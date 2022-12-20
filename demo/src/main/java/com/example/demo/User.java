package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class User {

    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)

   
    int id;

    String Logtyp,date,time,i;

    User() {}

    User(String Logtyp,String date,String time,String i)

    {

        this.i = i;
        this.time=time;
        this.Logtyp=Logtyp;
        this.date= date;

    }
}
 