package com.muhammederendemir.companymanagmentsystem.dto.company;

import com.muhammederendemir.companymanagmentsystem.model.CompanyRole;
import com.muhammederendemir.companymanagmentsystem.model.User;
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
public class CompanyResponseDTO {

    int id;
    String name;
    String address;
    List<User> userList = new ArrayList<>();
    List<User>subCompanyList = new ArrayList<>();
    List<CompanyRole>CompanyRoleList = new ArrayList<>();
}
