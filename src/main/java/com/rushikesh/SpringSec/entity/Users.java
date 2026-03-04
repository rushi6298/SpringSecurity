package com.rushikesh.SpringSec.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name="users")
public class Users {
    @Id
    private int id;
    private String username;
    private String password;

}
