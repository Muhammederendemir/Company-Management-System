package com.muhammederendemir.companymanagmentsystem.service.impl;

import com.muhammederendemir.companymanagmentsystem.dto.subCompany.SubCompanyRequestDTO;
import com.muhammederendemir.companymanagmentsystem.dto.subCompany.SubCompanyResponseDTO;
import com.muhammederendemir.companymanagmentsystem.exception.ConflictException;
import com.muhammederendemir.companymanagmentsystem.exception.ResourceNotFoundException;
import com.muhammederendemir.companymanagmentsystem.mapper.SubCompanyMapper;
import com.muhammederendemir.companymanagmentsystem.model.SubCompany;
import com.muhammederendemir.companymanagmentsystem.repository.SubCompanyRepository;
import com.muhammederendemir.companymanagmentsystem.service.SubCompanyService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class SubCompanyServiceImpl implements SubCompanyService {

    SubCompanyRepository subCompanyRepository;
    SubCompanyMapper subCompanyMapper;

    @Override
    public SubCompanyResponseDTO createSubCompany(SubCompanyRequestDTO subCompanyRequestDTO) {
        if(subCompanyRepository.findByName(subCompanyRequestDTO.getName())){
            throw new ConflictException("SubCompany Name Already exits");
        }
        SubCompany subCompany=subCompanyMapper.subCompanyRequestDTOToSubCompany(subCompanyRequestDTO);
        return subCompanyMapper.subCompanyToSubCompanyResponseDTO(subCompanyRepository.save(subCompany));
    }

    @Override
    public void deleteSubCompany(int subCompanyId) {
        if (subCompanyRepository.existsById(subCompanyId)){
            subCompanyRepository.deleteById(subCompanyId);
        }else {
            throw new ResourceNotFoundException("SubCompany","id",subCompanyId);
        }
    }

    // TODO TAMAMLA
    @Override
    public SubCompanyResponseDTO updateSubCompany(int subCompanyId, SubCompanyRequestDTO subCompanyRequestDTO) {

        SubCompany subCompany = subCompanyRepository.findById(subCompanyId).orElseThrow(() -> new ResourceNotFoundException("SubCompany", "id", subCompanyId));
        if (subCompanyRequestDTO.getName() != null) {
            if (!subCompany.getName().equals(subCompanyRequestDTO.getName())) {
                Boolean existsSubCompanyName = subCompanyRepository.findByName(subCompanyRequestDTO.getName());
                if (existsSubCompanyName) {
                    throw new ConflictException("SubCompany Name Already exits");
                }
            }
            subCompany = subCompanyRepository.save(subCompanyMapper.subCompanyRequestDTOToSubCompany(subCompanyRequestDTO));
        }
        return subCompanyMapper.subCompanyToSubCompanyResponseDTO(subCompany);
    }


    @Override
    public List<SubCompanyResponseDTO> getAllSubCompany() {
        return subCompanyMapper.subCompanyListToSubCompanyResponseDTOLis(subCompanyRepository.findAll());
    }

    @Override
    public SubCompanyResponseDTO getSubCompany(int subCompanyId) {
        SubCompany subCompany= subCompanyRepository.findById(subCompanyId).orElseThrow(()-> new ResourceNotFoundException("SubCompany","id",subCompanyId));
        return subCompanyMapper.subCompanyToSubCompanyResponseDTO(subCompany);
    }

    @Override
    public List<SubCompanyResponseDTO> getSubCompanyListInCompany(int companyId) {
        return null;
    }
}
