
/*
We are not using @Table annotation with Student.java.
Hibernate will create a table name with the entity name.
since in application.properties file we have mentioned,
every time when we will restart the server hibernate will
create the table automatically.

Here :
@Entity – Used with the entity class.

@Id – Specifies the primary key of an entity.

@GeneratedValue – Define the primary key generation strategy.

@Column – Used to map entity field with database column. The column name must the same as the database column name.

 */

package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "roll_number")
    private String rollNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

}