package com.muhammederendemir.companymanagmentsystem.dto.user;

import com.muhammederendemir.companymanagmentsystem.model.Company;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;


@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseDTO {

    long id;
    String firstname;
    String lastname;
    String email;
    int phoneNumber;
    Company company;
    //List<SubCompanyRole> SubCompanyRoleList = new ArrayList<>();
}

