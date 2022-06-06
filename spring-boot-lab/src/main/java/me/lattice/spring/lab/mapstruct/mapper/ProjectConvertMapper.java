package me.lattice.spring.lab.mapstruct.mapper;

import lombok.extern.slf4j.Slf4j;
import me.lattice.spring.lab.mapstruct.dto.ProjectVO;
import me.lattice.spring.lab.mapstruct.entity.Project;
import org.mapstruct.Mapper;
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
    ProjectVO convertProjectVO(Project project);


}
