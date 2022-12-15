package com.muhammederendemir.companymanagmentsystem.dto.subCompany;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SubCompanyRequestDTO {

    @Size(max = 50)
    String name;

    @NotBlank
    int companyId;

}
