package com.muhammederendemir.companymanagmentsystem.mapper;

import com.muhammederendemir.companymanagmentsystem.dto.company.CompanyRequestDTO;
import com.muhammederendemir.companymanagmentsystem.dto.company.CompanyResponseDTO;
import com.muhammederendemir.companymanagmentsystem.model.Company;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface CompanyMapper {

    CompanyResponseDTO companyToCompanyResponseDTO(Company company);

    Company companyRequestDTOToCompany(CompanyRequestDTO companyRequestDTO);

    List<CompanyResponseDTO> companyListToCompanyResponseDTOLis(List<Company> companyList);
}
