package com.example.demo.model;

import java.time.LocalDateTime;

public record OrderChangeTracker(LocalDateTime updatedOn) {
    public boolean canUpdate(LocalDateTime asOfDate) {
        return this.updatedOn() == null || this.updatedOn().isBefore(asOfDate);
    }

    public OrderChangeTracker updatedOn(LocalDateTime asOfDate) {
        return new OrderChangeTracker(
                asOfDate
        );
    }
}
