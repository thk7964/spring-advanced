package org.example.expert;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.example.expert.config.PasswordEncoder;
import org.example.expert.domain.user.entity.User;
import org.example.expert.domain.user.enums.UserRole;
import org.example.expert.domain.user.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@RequiredArgsConstructor
public class initData {

    private final UserService userService;
    private final PasswordEncoder passwordEncoder;

    @PostConstruct//실행될때 먼저 실행됨
    @Transactional
    public void init() {

        User user1 = new User("asdf1@asdf.com", passwordEncoder.encode("1234"), UserRole.ADMIN);
        User user2 = new User("asdf2@asdf.com", passwordEncoder.encode("1234"), UserRole.USER);

        userService.save(user1);
        userService.save(user2);
    }
}
