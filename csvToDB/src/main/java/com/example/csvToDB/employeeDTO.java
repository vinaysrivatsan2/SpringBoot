package com.example.csvToDB;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface employeeDTO extends JpaRepository<employees,Integer> {

}
