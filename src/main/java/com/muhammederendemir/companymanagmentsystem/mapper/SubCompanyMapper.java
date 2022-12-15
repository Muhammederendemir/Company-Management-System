package com.muhammederendemir.companymanagmentsystem.mapper;
import com.muhammederendemir.companymanagmentsystem.dto.subCompany.SubCompanyRequestDTO;
import com.muhammederendemir.companymanagmentsystem.dto.subCompany.SubCompanyResponseDTO;
import com.muhammederendemir.companymanagmentsystem.model.SubCompany;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface SubCompanyMapper {
    SubCompanyResponseDTO subCompanyToSubCompanyResponseDTO(SubCompany subCompany);
    SubCompany subCompanyRequestDTOToSubCompany(SubCompanyRequestDTO subCompanyRequestDTO);

    List<SubCompanyResponseDTO> subCompanyListToSubCompanyResponseDTOLis(List<SubCompany> subCompanyList);
}
