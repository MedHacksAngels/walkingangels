// this java class sets up the app to restrict access. by default, if access is not specified, it is denied.

package com.medhacks.walkingangels;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
// above annots indicate to compiler that file is configuration file and that SpringSecurity is enabled for this app
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    // extended class has all the methods needed to include security in our app

    // the @Bean annot and passwordEncoder() method creates an obj that can be re-used to encode passwords in your app
    // provides an instance of BCryptPasswordEncoder, which is a pw encoder that uses the BCrypt hashing function
    @Bean
    public static BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Autowired
    private SSUserDetailsService userDetailsService;

    @Autowired
    private UserRepository appUserRepository;

    @Override
    public UserDetailsService userDetailsServiceBean() throws Exception{
        return new SSUserDetailsService(appUserRepository);
    }

    // The configure() method configures users who can access the app.
    @Override
    protected void configure(HttpSecurity http) throws Exception{
        // Restricts access to routes
        http
        .authorizeRequests()
                .antMatchers("/", "/h2/**").permitAll()
                .antMatchers("/register", "/logoutconfirm", "/detail/**").permitAll()
                .anyRequest().authenticated()
                // ^ any other request needs to be authenticated
                .and()
        .formLogin()
                .loginPage("/login").permitAll()
                // ^ this is the page ppl see if they have not logged in yet
                .and()
                .logout()
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                .logoutSuccessUrl("/logoutconfirm").permitAll() // if logout is successful it'll take us back to logout page.
                .and()
                .httpBasic(); // browser identifies you as a user. not good for security, remove for real apps

        // we're disabling two security features here. consider deleting...
        http
                .csrf().disable();
        http
                .headers().frameOptions().disable();
    }

    // multiple users can be configured here but atm it is for single in-memory user
    // you can further specify how users are granted access to app if their details are stored in db
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth
                .userDetailsService(userDetailsServiceBean())
                .passwordEncoder(passwordEncoder());

    }
}
