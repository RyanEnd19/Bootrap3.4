package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.*;

import java.util.List;

public interface RoleService {

    public List<Role> getAllRoles();
}