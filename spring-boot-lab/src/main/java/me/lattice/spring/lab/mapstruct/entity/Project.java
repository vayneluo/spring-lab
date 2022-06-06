package me.lattice.spring.lab.mapstruct.entity;

import lombok.Data;

/**
 * @description: TODO
 * @author: Lattice
 * @date 2022/6/6 14:20
 */
@Data
public class Project {

    private Long id;

    private String projectName;

    private String desc;

    public Project(Long id, String projectName, String desc) {
        this.id = id;
        this.projectName = projectName;
        this.desc = desc;
    }
}
