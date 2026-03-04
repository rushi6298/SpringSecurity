package com.rushikesh.SpringSec.service;

import com.rushikesh.SpringSec.entity.UserPricipal;
import com.rushikesh.SpringSec.entity.Users;
import com.rushikesh.SpringSec.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.err.println("User Name is :"+username);
        Users user = userRepo.findByUsername(username);
        System.err.println("User is :"+user);
        if(user== null)
        {

            System.err.println("User Not Found");
            throw new UsernameNotFoundException("User Not Found");
        }


        return new UserPricipal(user);
    }
}
