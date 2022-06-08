package me.lattice.spring.lab.mapstruct;

import lombok.extern.slf4j.Slf4j;
import me.lattice.spring.lab.mapstruct.dto.ProjectCompanyVO;
import me.lattice.spring.lab.mapstruct.dto.ProjectVO;
import me.lattice.spring.lab.mapstruct.entity.Company;
import me.lattice.spring.lab.mapstruct.entity.Project;
import me.lattice.spring.lab.mapstruct.mapper.ProjectConvertMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @description: MapStruct测试类
 * @author: Lattice
 * @date 2022/6/6 14:37
 */
@Slf4j
@SpringBootTest
public class MapStructConvertMapperTest {

    @Test
    public void projectConvertVO() {
        Project project = new Project(1L, "lattice", "desc");
        ProjectVO projectVO = ProjectConvertMapper.INSTANCE.convertProjectVO(project);
        log.info("project data : {}",projectVO);
    }

    @Test
    public void projectCompanyConvertVO() {
        Project project = new Project(2L, "lattice", "desc 2");
        Company company = new Company("lta co.");
        ProjectCompanyVO projectCompanyVO = ProjectConvertMapper.INSTANCE.convertProjectCompanyVO(project, company);
        log.info("project comp data : {}",projectCompanyVO);
    }
}
