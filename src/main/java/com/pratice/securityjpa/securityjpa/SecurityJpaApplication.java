package com.pratice.securityjpa.securityjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SecurityJpaApplication {

//    @Autowired
//    UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(SecurityJpaApplication.class, args);
    }


//    @Override
//    public void run(String... args) throws Exception {
//        User user = new User("piyush" , "$2a$10$7keRoiSnl2aHPPaeIZJdzOPjXMD5iA16cl8kgvCcxPLi5Kr3FApGS", true,"admin:student");
//        User user1 = new User("rahul" , "$2a$10$CIV6p9LrsMpQiP1r0FhdF.Kr5l/DxhupUiE28dzu0cOIzPSf/nNCO", true,"student");
//        userRepository.save(user);
//        userRepository.save(user1);
//    }
}
