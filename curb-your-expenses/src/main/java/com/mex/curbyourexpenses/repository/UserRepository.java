package com.mex.curbyourexpenses.repository;

import com.mex.curbyourexpenses.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<AppUser, UUID> {
}
