package com.baseballshop.repository;

import com.baseballshop.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository <Member, String> {

    Member findByUserId(String userId);

  Boolean existsByUserId(String userId);

}