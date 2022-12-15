package com.muhammederendemir.companymanagmentsystem.repository;

import com.muhammederendemir.companymanagmentsystem.model.CompanyRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRoleRepository extends JpaRepository<CompanyRole, Long> {

}
