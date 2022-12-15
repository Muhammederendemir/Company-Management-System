package com.muhammederendemir.companymanagmentsystem.mapper;

import com.muhammederendemir.companymanagmentsystem.dto.role.RoleRequestDTO;
import com.muhammederendemir.companymanagmentsystem.model.Role;
import org.mapstruct.Mapper;

@Mapper
public interface RoleMapper {
    Role roleRequestDTOToRole(RoleRequestDTO roleRequestDTO);
}
