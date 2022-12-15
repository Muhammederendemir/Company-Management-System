package com.muhammederendemir.companymanagmentsystem.dto.company;

import com.muhammederendemir.companymanagmentsystem.model.Company;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CompanyRequestDTO {

    @Size(max = 50)
    String name;

    @Size(max = 50)
    String address;

    @NotBlank
    Company company;
}
