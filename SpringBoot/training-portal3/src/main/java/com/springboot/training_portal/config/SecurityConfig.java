
package com.springboot.training_portal.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import com.springboot.training_portal.Repository.AppUserRepo;

@Configuration
public class SecurityConfig {
	
	@Bean
	CommandLineRunner seedDemoUsers(AppUserRepo repository,PasswordEncoder encoder) {
		return null;
		
	}

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    InMemoryUserDetailsManager userDetailsService(PasswordEncoder encoder) {

        // Student
        UserDetails student = User.withUsername("student")
                .password(encoder.encode("student@118"))
                .roles("STUDENT")
                .build();

        // Admin
        UserDetails admin = User.withUsername("admin")
                .password(encoder.encode("admin@118"))
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(student, admin);
    }

    
  //HttpSecurity
  		// authorizeHttprequest() --> Configures the acces rules for urls 
  		// formLogin(WithDefaults())--> It will Enable form based login.\
  		// build - it builds the securityFilterChain Object.
  		//requestMatcherrs("url").hashRole("rolename");
  		// anyRequest().authenticated():for remaining reuests authenticator sigon os mandatory.
    
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http)
            throws Exception {

        http.authorizeHttpRequests(auth -> auth

                .requestMatchers("/home").permitAll()

                .requestMatchers("/student/dashboard")
                .hasRole("STUDENT")

                .requestMatchers("/admin/dashboard")
                .hasRole("ADMIN")

                .anyRequest().authenticated()
        )

        .formLogin(Customizer.withDefaults());

        return http.build();
    }
}
