package com.example.csvToDB;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface employeeDTO extends JpaRepository<employees,Long>  {

}
