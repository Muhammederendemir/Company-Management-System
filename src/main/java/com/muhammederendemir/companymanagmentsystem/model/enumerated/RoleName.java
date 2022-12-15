package com.muhammederendemir.companymanagmentsystem.model.enumerated;


import lombok.AccessLevel;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public enum  RoleName {
    ROLE_READ("READ"),
    ROLE_CREATE("CREATE"),
    ROLE_UPDATE("UPDATE"),
    ROLE_DELETE("DELETE");

    @NonNull String value;
}
