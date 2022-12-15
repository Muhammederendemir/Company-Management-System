package com.muhammederendemir.companymanagmentsystem.model.audit;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.muhammederendemir.companymanagmentsystem.model.User;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

@Data
@MappedSuperclass
@JsonIgnoreProperties(
        value = {"createdBy", "updatedBy"},
        allowGetters = true
)
public abstract class UserDateAudit extends DateAudit {

    @CreatedBy
    @OneToOne
    private User createdBy;

    @LastModifiedBy
    @OneToOne
    private User updatedBy;
}
