package com.muhammederendemir.companymanagmentsystem.repository;

import com.muhammederendemir.companymanagmentsystem.model.SubCompanyRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubCompanyRoleRepository extends JpaRepository<SubCompanyRole,Long> {
}
