package com.muhammederendemir.companymanagmentsystem.repository;

import com.muhammederendemir.companymanagmentsystem.model.Role;
import com.muhammederendemir.companymanagmentsystem.model.enumerated.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
    Boolean findByName(RoleName roleName);
}
