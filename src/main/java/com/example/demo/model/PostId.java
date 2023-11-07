package com.example.demo.model;

import java.beans.ConstructorProperties;

public class PostId extends AbstractId<Long> {
    @ConstructorProperties({"id"})
    public PostId(Long id) {
        this.setId(id);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        return super.equals(o);
    }
}
