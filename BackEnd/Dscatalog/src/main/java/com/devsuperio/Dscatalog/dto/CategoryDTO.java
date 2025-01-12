package com.devsuperio.Dscatalog.dto;

import com.devsuperio.Dscatalog.entities.Category;

import java.io.Serializable;

public class CategoryDTO implements Serializable {
    private Long id;
    private String name;

    public CategoryDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public CategoryDTO(Category entities) {
        this.id = entities.getId();
        this.name = entities.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
