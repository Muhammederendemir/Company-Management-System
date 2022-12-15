package com.muhammederendemir.companymanagmentsystem.service.impl;

import com.muhammederendemir.companymanagmentsystem.dto.role.RoleRequestDTO;
import com.muhammederendemir.companymanagmentsystem.exception.ConflictException;
import com.muhammederendemir.companymanagmentsystem.exception.ResourceNotFoundException;
import com.muhammederendemir.companymanagmentsystem.mapper.RoleMapper;
import com.muhammederendemir.companymanagmentsystem.model.Role;
import com.muhammederendemir.companymanagmentsystem.repository.RoleRepository;
import com.muhammederendemir.companymanagmentsystem.service.RoleService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
@NoArgsConstructor
public class RoleServiceImpl implements RoleService {

    RoleRepository roleRepository;
    RoleMapper roleMapper;

    @Override
    public Role createRole(RoleRequestDTO roleRequestDTO) {
        if(roleRepository.findByName(roleRequestDTO.getName())){
            throw new ConflictException("Role Name Already exits");
        }
        Role role= roleMapper.roleRequestDTOToRole(roleRequestDTO);
        return   roleRepository.save(role);
    }

    @Override
    public void deleteRole(int roleId) {
        if (roleRepository.existsById(roleId)){
            roleRepository.deleteById(roleId);
        }else {
            throw new ResourceNotFoundException("Role","id",roleId);
        }
    }

    @Override
    public Role updateRole(int roleId, RoleRequestDTO roleRequestDTO) {

        Role role=roleRepository.findById(roleId).orElseThrow(() -> new ResourceNotFoundException("Role","RoleId",roleId));

        if (roleRequestDTO.getName()!=null){
            if (!role.getName().equals(roleRequestDTO.getName())) {
                Boolean existRoleName= roleRepository.findByName(roleRequestDTO.getName());
                if (existRoleName) {
                    throw new ConflictException("Role Name already exist");
                }
            }
            role=roleRepository.save(roleMapper.roleRequestDTOToRole(roleRequestDTO));
        }
        return role;
    }

    @Override
    public List<Role> getAllRole() {
        return roleRepository.findAll();
    }

    @Override
    public Role getRole(int roleId) {
        return roleRepository.findById(roleId).orElseThrow(()-> new ResourceNotFoundException("Role","roleId",roleId));
    }
}
