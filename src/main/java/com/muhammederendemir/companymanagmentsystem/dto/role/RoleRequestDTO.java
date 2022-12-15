package com.muhammederendemir.companymanagmentsystem.dto.role;

import com.muhammederendemir.companymanagmentsystem.model.enumerated.RoleName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;


@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RoleRequestDTO {

    @NotBlank
    @Enumerated
    RoleName name;

}