package com.example.springboot.dtos;

import com.example.springboot.enums.UserRole;

public record RegisterRecordDto(Boolean active, String name, String email, String password, UserRole role) {
}
