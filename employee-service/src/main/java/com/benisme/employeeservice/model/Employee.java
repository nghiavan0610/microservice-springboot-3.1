package com.benisme.employeeservice.model;

public record Employee(Long id, Long departmentId, String name, Integer age, String position) {
}
