package com.muhammederendemir.companymanagmentsystem.repository;

import com.muhammederendemir.companymanagmentsystem.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer> {

    Boolean findByName(String companyName);

}
