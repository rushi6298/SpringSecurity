package com.rushikesh.SpringSec.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class Student {
    private int id;
    private  String name;
    private  int mark;
}
