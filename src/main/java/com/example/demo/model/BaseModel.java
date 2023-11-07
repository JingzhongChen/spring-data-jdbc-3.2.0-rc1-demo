package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;

public abstract class BaseModel {
    @Id
    private Long id;

    @Version
    private Long version;

    public BaseModel() {
        super();
    }

    protected Long id() {
        return this.id;
    }

    protected void setId(Long id) {
        this.id = id;
    }

    protected Long getVersion() {
        return this.version;
    }

    protected void setVersion(Long version) {
        this.version = version;
    }
}
