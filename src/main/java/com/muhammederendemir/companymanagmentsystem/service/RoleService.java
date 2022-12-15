package com.muhammederendemir.companymanagmentsystem.service;

import com.muhammederendemir.companymanagmentsystem.dto.role.RoleRequestDTO;
import com.muhammederendemir.companymanagmentsystem.model.Role;

import java.util.List;

public interface RoleService {
    Role createRole(RoleRequestDTO roleRequestDTO);
    void deleteRole(int roleId);
    Role updateRole(int roleId, RoleRequestDTO roleRequestDTO);
    List<Role> getAllRole();
    Role getRole(int roleId);

}
