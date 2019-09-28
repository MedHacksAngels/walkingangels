/* Let's add some accounts so that we can log in! */

package com.medhacks.walkingangels;

import com.medhacks.walkingangels.jacob.Translation;
import com.medhacks.walkingangels.jacob.TranslationRepository;
import com.medhacks.walkingangels.jen.Service;
import com.medhacks.walkingangels.security.Role;
import com.medhacks.walkingangels.security.RoleRepository;
import com.medhacks.walkingangels.security.User;
import com.medhacks.walkingangels.security.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private TranslationRepository translationRepository;

    @Override
    public void run(String...strings) throws Exception{

        roleRepository.save(new Role("USER"));
        roleRepository.save(new Role("ADMIN"));

        Role adminRole = roleRepository.findByRole("ADMIN");
        Role userRole = roleRepository.findByRole("USER");

        User user = new User("jim@jim.com", "password", "Jim",
                "Jimmerson", true, "jim");
        user.setRoles(Arrays.asList(userRole));
        userRepository.save(user);

        user = new User("admin@admin.com", "password", "Admin",
                "User", true, "admin");
        user.setRoles(Arrays.asList(adminRole));
        userRepository.save(user);

        Translation translation = new Translation("English", "British");
        translationRepository.save(translation);

    }
}
