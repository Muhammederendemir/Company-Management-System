package com.muhammederendemir.companymanagmentsystem.dto.user;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserLoginRequestDTO {

    @Size(max = 50)
    @Email
    String email;

    @Size(max = 120)
    String password;
}
