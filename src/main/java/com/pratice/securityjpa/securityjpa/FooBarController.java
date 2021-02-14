package com.pratice.securityjpa.securityjpa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooBarController {

//    @Autowired
//    UserRepository userRepository ;
//

    // This require authentication and authorization as well
    @GetMapping("/student")
    public String getStudent() {
        return "hello student";
    }

    // This require authentication and authorization as well
    @GetMapping("/admin")
    public String getAdmin() {
        return "hello admin";
    }

    // This api does not require authentication and authorization
    @GetMapping("/visitor")
    public String getVisitor() {
        return "hello visitor";
    }

//    @PostMapping("/user")
//    public User createUser(@RequestBody User user) {
//        return userRepository.save(user);
//    }
}
