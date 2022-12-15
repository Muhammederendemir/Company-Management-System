package com.muhammederendemir.companymanagmentsystem.bootsrap;

import com.muhammederendemir.companymanagmentsystem.model.Role;
import com.muhammederendemir.companymanagmentsystem.model.enumerated.RoleName;
import com.muhammederendemir.companymanagmentsystem.repository.RoleRepository;
import lombok.AccessLevel;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class InitDataLoader implements CommandLineRunner {

    @NonNull
    RoleRepository roleRepository;


    @Override
    public void run(String... args){
        if (roleRepository.findAll().isEmpty()) {
            initRole();
        }
    }

    private void initRole(){
        Role roleCreate=new Role(1,RoleName.ROLE_CREATE);
        Role roleRead=new Role(2,RoleName.ROLE_READ);
        Role roleUpdate=new Role(3,RoleName.ROLE_UPDATE);
        Role roleDelete=new Role(4,RoleName.ROLE_DELETE);

        roleRepository.save(roleCreate);
        roleRepository.save(roleRead);
        roleRepository.save(roleUpdate);
        roleRepository.save(roleDelete);

    }


}
