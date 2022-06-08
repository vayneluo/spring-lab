package me.lattice.spring.lab.mapstruct.mapper;

import lombok.extern.slf4j.Slf4j;
import me.lattice.spring.lab.mapstruct.dto.ProjectCompanyVO;
import me.lattice.spring.lab.mapstruct.dto.ProjectVO;
import me.lattice.spring.lab.mapstruct.entity.Company;
import me.lattice.spring.lab.mapstruct.entity.Project;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * @description: 项目实体转换
 * @author: Lattice
 * @date 2022/6/6 14:33
 */
@Mapper
public interface ProjectConvertMapper {

    ProjectConvertMapper INSTANCE = Mappers.getMapper(ProjectConvertMapper.class);

    /***
     * @description: 项目实体转换
     * @param: [project] 项目实体
     * @author: Vayne.Luo
     * @date: 2022/6/6 14:34
     */
    @Mappings({
            @Mapping(source = "projectName", target = "projectNameVO")
    })
    ProjectVO convertProjectVO(Project project);

    @Mappings({
            @Mapping(source = "project.projectName", target = "projectNameVO"),
            @Mapping(source = "company.companyName", target = "companyName")
    })
    ProjectCompanyVO convertProjectCompanyVO(Project project, Company company);


}
