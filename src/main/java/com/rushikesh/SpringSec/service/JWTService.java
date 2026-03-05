package com.rushikesh.SpringSec.service;

import io.jsonwebtoken.Jwts;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Service
public class JWTService {

    public String generateToken(String username){

        Map<String, Object>claims = new HashMap<>();
        return Jwts.builder()
                .claims()
                .add(claims)
                .subject(username)
                .issuedAt(new Date(System.currentTimeMillis()))
                .expiration(new Date(System.currentTimeMillis()*60*60*30))
                .and()
                .signWith(getKey())
                .compact();
        return "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IlJ1c2hpa2VzaCIsImFkbWluIjp0cnVlLCJpYXQiOjE1MTYyMzkwMjJ9.d0dPOlBIsiuORbBrxTBplkrrd_2sYqg0si97SLSUgwk";

    }

    private Key getKey() {
        return 
    }

}
