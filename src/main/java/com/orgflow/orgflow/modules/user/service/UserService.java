package com.orgflow.orgflow.modules.user.service;

import com.orgflow.orgflow.modules.user.model.User;
import com.orgflow.orgflow.modules.user.repository.UserRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    // הוספת Constructor ידני במקום הלומבוק
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }
}