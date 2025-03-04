package com.mysite.sbb_api.user.repository;

import com.mysite.sbb_api.entity.SiteUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<SiteUser, Long> {
    Optional<SiteUser> findByUsername(String username);
    Optional<SiteUser> findByEmail(String email);

    Optional<SiteUser> findByNaverId(String naverId);
}
