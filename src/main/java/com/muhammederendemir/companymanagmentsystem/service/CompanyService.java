package com.muhammederendemir.companymanagmentsystem.service;

import com.muhammederendemir.companymanagmentsystem.dto.company.CompanyRequestDTO;
import com.muhammederendemir.companymanagmentsystem.dto.company.CompanyResponseDTO;

import java.util.List;

public interface CompanyService {
     CompanyResponseDTO createCompany(CompanyRequestDTO companyRequestDTO);
     void deleteCompany(int companyId);
     CompanyResponseDTO updateCompany(int companyId,CompanyRequestDTO companyRequestDTO);

     List<CompanyResponseDTO> getAllCompany();

     CompanyResponseDTO getCompany(int companyId);
}
