package com.muhammederendemir.companymanagmentsystem.dto.user;

import com.muhammederendemir.companymanagmentsystem.model.Company;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserRegisterRequestDTO {

    @Size(max = 50)
    String firstname;

    @Size(max = 50)
    String lastname;

    @Size(max = 50)
    @Email
    String email;

    @Size(max = 120)
    String password;

    int phoneNumber;

    @NotBlank
    Company company;
}
