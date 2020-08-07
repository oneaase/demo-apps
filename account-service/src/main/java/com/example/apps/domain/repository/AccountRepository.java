package com.example.apps.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.apps.domain.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
}
