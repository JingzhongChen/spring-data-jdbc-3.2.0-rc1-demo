package com.example.demo.model;

import java.time.LocalDateTime;

public record UserChangeTracker(LocalDateTime nameChangedOn) {
    public UserChangeTracker nameChangedOn(LocalDateTime asOfDate) {
        return new UserChangeTracker(asOfDate);
    }

    public boolean canChangeName(LocalDateTime asOfDate) {
        return this.nameChangedOn() == null || this.nameChangedOn().isBefore(asOfDate);
    }
}
