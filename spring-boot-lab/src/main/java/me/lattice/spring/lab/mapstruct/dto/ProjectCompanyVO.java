package me.lattice.spring.lab.mapstruct.dto;

import lombok.Data;
import lombok.ToString;

/**
 * @description: 学生DTO转换对象
 * @author: Lattice
 * @date 2022/6/6 14:28
 */
@Data
@ToString
public class ProjectCompanyVO {

    private Long id;

    private String projectNameVO;

    private String desc;

    private String companyName;
}
