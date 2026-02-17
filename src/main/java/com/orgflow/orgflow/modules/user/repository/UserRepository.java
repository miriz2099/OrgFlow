package com.orgflow.orgflow.modules.user.repository;

import com.orgflow.orgflow.modules.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}