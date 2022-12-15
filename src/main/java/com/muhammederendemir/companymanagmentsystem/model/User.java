package com.muhammederendemir.companymanagmentsystem.model;

import com.muhammederendemir.companymanagmentsystem.model.audit.UserDateAudit;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "users")
public class User extends UserDateAudit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    long id;

    String firstname;
    String lastname;
    String email;
    String password;
    int phoneNumber;

    @ManyToOne
    @JoinColumn(name = "company_id")
    Company company;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    List<CompanyRole> CompanyRoleList = new ArrayList<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    List<SubCompanyRole> SubCompanyRoleList = new ArrayList<>();
}
