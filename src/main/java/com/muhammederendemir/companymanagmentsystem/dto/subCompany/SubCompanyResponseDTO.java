package com.muhammederendemir.companymanagmentsystem.dto.subCompany;

import com.muhammederendemir.companymanagmentsystem.model.Company;
import com.muhammederendemir.companymanagmentsystem.model.SubCompanyRole;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
public class SubCompanyResponseDTO {

    String name;

    Company company;

    List<SubCompanyRole> SubCompanyRoleList = new ArrayList<>();

}
