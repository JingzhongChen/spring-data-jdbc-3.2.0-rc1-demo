package com.example.demo.model;

/**
 * @Author: Chen Hongzhou
 * @Date: 2023/2/28 16:59
 * @Description:
 */
public abstract class AbstractId<T> {
    protected T id;

    public T getId() {
        return id;
    }

    protected void setId(T id) {
        if (id == null) {
            throw new IllegalArgumentException("id is required");
        }
        if (this.id != null) {
            throw new IllegalStateException("id is already set");
        }
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractId<T> other = (AbstractId<T>) o;
        return id.equals(other.getId());
    }

}
