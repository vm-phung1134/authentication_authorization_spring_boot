package com.authorize.auth_management_api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.authorize.auth_management_api.entity.UserSchema;

@Repository
public interface UserRepository extends JpaRepository<UserSchema, Integer> {
    Optional<UserSchema> findByName(String username);
    @Query("SELECT u FROM UserSchema u WHERE u.email = :email")
    Optional<UserSchema> findByEmail(@Param("email") String email);
}
