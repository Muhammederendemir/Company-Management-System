package com.muhammederendemir.companymanagmentsystem.repository;

import com.muhammederendemir.companymanagmentsystem.model.SubCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubCompanyRepository extends JpaRepository<SubCompany,Integer> {
    Boolean findByName(String subCompanyName);
}
