package com.rushikesh.SpringSec.repository;

import com.rushikesh.SpringSec.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users,Integer> {

    public Users findByUsername(String username);
}
