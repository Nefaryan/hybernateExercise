package it.develhope.hybernateExercise.entities;

import javax.persistence.*;

@Entity
@Table
public class Students {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private long id;

     @Column(nullable = false)
     private String name;

     @Column(nullable = false)
     private String surname;

     @Column(unique = true,name = "studentEmail",nullable = false)
     private String email;



     public Students(){}

     public Students(long id, String name, String surname, String email) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
    }
     public long getId() {
        return id;
    }
     public void setId(long id) {
        this.id = id;
    }
     public String getName() {
        return name;
    }
     public void setName(String name) {
        this.name = name;
    }
     public String getSurname() {
        return surname;
    }
     public void setSurname(String surname) {
        this.surname = surname;
    }
     public String getEmail() {
        return email;
    }
     public void setEmail(String email) {
        this.email = email;
    }
}
