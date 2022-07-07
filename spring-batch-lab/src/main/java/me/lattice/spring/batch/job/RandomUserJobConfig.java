package me.lattice.spring.batch.job;

import lombok.extern.slf4j.Slf4j;
import me.lattice.spring.batch.entity.DuckUser;
import me.lattice.spring.batch.service.RandomUserService;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.item.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * @description: 随机生成用户信息任务
 * @author: Lattice
 * @date 2022/7/7 09:40
 */
@Slf4j
@SuppressWarnings("all")
@Configuration
public class RandomUserJobConfig {

    @Autowired
    JobBuilderFactory jobBuilderFactory;
    @Autowired
    StepBuilderFactory stepBuilderFactory;
    @Autowired
    RandomUserService randomUserService;
    @Autowired
    JobRepository jobRepository;

    @Bean
    public ItemReader<DuckUser> reader() {
        return new ItemReader<DuckUser>() {
            private int count;

            @Override
            public DuckUser read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
                List<DuckUser> duckUsers = randomUserService.randomUser();
                if(count < duckUsers.size()){
                    return duckUsers.get(count++);
                }else{
                    count = 0;
                }
                return null;
            }
        };
    }

    @Bean
    public ItemProcessor processor() {
        return new ItemProcessor() {
            @Override
            public Object process(Object o) throws Exception {
                log.info("转换前数据 : {}", o);
                return o;
            }
        };
    }

    @Bean
    public ItemWriter<DuckUser> writer() {
        return new ItemWriter<DuckUser>() {
            @Override
            public void write(List<? extends DuckUser> list) throws Exception {

            }
        };
    }

    @Bean
    public Step stepOne() {
        return stepBuilderFactory.get("stepOne")
                .chunk(10)
                .reader(reader())
                .processor(processor())
                .writer(writer())
                .build();
    }

    @Bean
    public Job randomUserJob() {
        return jobBuilderFactory.get("randomUserJob")
                .flow(stepOne())
                .end().build();
    }


}
