package com.muhammederendemir.companymanagmentsystem.service.impl;


import com.muhammederendemir.companymanagmentsystem.dto.company.CompanyRequestDTO;
import com.muhammederendemir.companymanagmentsystem.dto.company.CompanyResponseDTO;
import com.muhammederendemir.companymanagmentsystem.exception.ConflictException;
import com.muhammederendemir.companymanagmentsystem.exception.ResourceNotFoundException;
import com.muhammederendemir.companymanagmentsystem.mapper.CompanyMapper;
import com.muhammederendemir.companymanagmentsystem.model.Company;
import com.muhammederendemir.companymanagmentsystem.repository.CompanyRepository;
import com.muhammederendemir.companymanagmentsystem.service.CompanyService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class CompanyServiceImpl implements CompanyService {

    CompanyRepository companyRepository;

    CompanyMapper companyMapper;

    @Override
    public CompanyResponseDTO createCompany(CompanyRequestDTO companyRequestDTO) {
        if(companyRepository.findByName(companyRequestDTO.getName())){
            throw new ConflictException("Company Name Already exits");
        }
        Company company= companyMapper.companyRequestDTOToCompany(companyRequestDTO);
        company= companyRepository.save(company);
        return companyMapper.companyToCompanyResponseDTO(company);
    }

    @Override
    public void deleteCompany(int companyId) {
        if (companyRepository.existsById(companyId)){
            companyRepository.deleteById(companyId);
        }else {
            throw new ResourceNotFoundException("Company","id",companyId);
        }
    }

    @Override
    public CompanyResponseDTO updateCompany(int companyId, CompanyRequestDTO companyRequestDTO) {

        Company company= companyRepository.findById(companyId).orElseThrow(() -> new ResourceNotFoundException("Company","companyId",companyId));
        if (companyRequestDTO.getName()!=null){
            if (!company.getName().equals(companyRequestDTO.getName())){
                Boolean existsCompanyName = companyRepository.findByName(companyRequestDTO.getName());
                if (existsCompanyName){
                    throw new ConflictException("Company Name Already exits");
                }
            }
             company = companyRepository.save(companyMapper.companyRequestDTOToCompany(companyRequestDTO));
        }
        return companyMapper.companyToCompanyResponseDTO(company);
    }

    @Override
    public List<CompanyResponseDTO> getAllCompany() {
        return companyMapper.companyListToCompanyResponseDTOLis(companyRepository.findAll());
    }

    @Override
    public CompanyResponseDTO getCompany(int companyId) {
        Company company=companyRepository.findById(companyId).orElseThrow(()-> new ResourceNotFoundException("Company","companyId",companyId));
        return companyMapper.companyToCompanyResponseDTO(company);
    }
}

