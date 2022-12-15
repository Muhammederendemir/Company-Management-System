package com.muhammederendemir.companymanagmentsystem.model;

import com.muhammederendemir.companymanagmentsystem.model.audit.UserDateAudit;
import com.muhammederendemir.companymanagmentsystem.model.enumerated.RoleName;
import com.sun.istack.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;


@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Role extends UserDateAudit {

    @Id
    @Column(name = "role_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @NotNull
    @NaturalId //Used for search performance
    @Enumerated(EnumType.STRING)
    @Column(length = 50, unique = true)
    @NotBlank
    RoleName name;

    //@OneToMany(mappedBy = "role", cascade = CascadeType.ALL)
    // List<CompanyRole> CompanyRoleList = new ArrayList<>();
}
