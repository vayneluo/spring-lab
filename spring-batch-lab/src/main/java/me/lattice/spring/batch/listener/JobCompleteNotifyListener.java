package me.lattice.spring.batch.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.stereotype.Component;

/**
 * @description: 任务完成监听器
 * @author: Lattice
 * @date 2022/7/7 10:03
 */
@Slf4j
@Component
public class JobCompleteNotifyListener extends JobExecutionListenerSupport {


    @Override
    public void afterJob(JobExecution jobExecution) {
        if(jobExecution.getStatus() == BatchStatus.COMPLETED) {
            log.info("!!! JOB FINISHED! Time to verify the results");
        }
    }
}
