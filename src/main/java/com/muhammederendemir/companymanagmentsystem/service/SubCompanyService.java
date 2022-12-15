package com.muhammederendemir.companymanagmentsystem.service;

import com.muhammederendemir.companymanagmentsystem.dto.subCompany.SubCompanyRequestDTO;
import com.muhammederendemir.companymanagmentsystem.dto.subCompany.SubCompanyResponseDTO;

import java.util.List;

public interface SubCompanyService {

    SubCompanyResponseDTO createSubCompany(SubCompanyRequestDTO subCompanyRequestDTO);
    void deleteSubCompany(int subCompanyId);
    SubCompanyResponseDTO updateSubCompany(int subCompanyId, SubCompanyRequestDTO subCompanyRequestDTO);
    List<SubCompanyResponseDTO> getAllSubCompany();
    SubCompanyResponseDTO getSubCompany(int subCompanyId);
    List<SubCompanyResponseDTO> getSubCompanyListInCompany(int companyId);
}
