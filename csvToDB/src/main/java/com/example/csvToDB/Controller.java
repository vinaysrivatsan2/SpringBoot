package com.example.csvToDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class    Controller {
    @Autowired
    private employeesService es;
    @RequestMapping(path="feedEmployeesData")
    public void setDataInDb(){
        es.saveEmployeeData();
    }
}
