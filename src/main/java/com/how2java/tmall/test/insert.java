package com.how2java.tmall.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insert {
    public static void main(String[] args) {
        String name ="didigugubird";
        char[] cs = name.toCharArray();
        for (int i=1; i <cs.length-1;i++){
            cs[i] ='*';
        }
        name = new String(cs);
        System.out.println(name);

    }
}
