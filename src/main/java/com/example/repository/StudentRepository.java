package com.example.repository;

/*
We will use Spring Data JPA save()
method to create and update an
entity(see more details here).
To retrieve and delete operation we
will use findById() and delete() method.

The methods save(),
findById() and delete()
method has been defined in CrudRepository
interface. Since StudentRepository
 extends JpaRepository and JpaRepository
  extends PagingAndSortingRepository.
   Further  PagingAndSortingRepository
   extends CrudRepository interface.
   All these methods(save(),findById()
   and delete()) will be available for
    StudentRepository.
 */

import com.example.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.io.Serializable;

@Repository
public interface StudentRepository extends JpaRepository<Student, Serializable> {

}