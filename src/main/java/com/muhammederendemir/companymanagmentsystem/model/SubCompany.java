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
public class SubCompany extends UserDateAudit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subCompany_id")
    int id;
    String name;

    @ManyToOne
    Company company;

    @OneToMany(mappedBy = "subCompany", cascade = CascadeType.ALL)
    List<SubCompanyRole> SubCompanyRoleList = new ArrayList<>();

}
