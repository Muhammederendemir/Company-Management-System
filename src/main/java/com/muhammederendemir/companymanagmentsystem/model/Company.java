package com.muhammederendemir.companymanagmentsystem.model;

import com.muhammederendemir.companymanagmentsystem.model.audit.UserDateAudit;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Company extends UserDateAudit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "company_id")
    int Id;

    @NotBlank
    @NotNull
    String name;

    String address;

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL)
    List<User>userList = new ArrayList<>();

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL)
    List<User>subCompanyList = new ArrayList<>();

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL)
    List<CompanyRole>CompanyRoleList = new ArrayList<>();

}

