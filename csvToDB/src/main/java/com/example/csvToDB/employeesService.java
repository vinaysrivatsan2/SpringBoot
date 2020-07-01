package com.example.csvToDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@Service
public class employeesService {
   @Autowired
    private employeeDTO edto;
   String data_emp;
   public void saveEmployeeData(){
       try {
           BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\vinay\\OneDrive\\Desktop\\vinay\\ITS\\staff_roster\\employees1.csv"));
           while((data_emp = br.readLine())!=null){
               String[] data= data_emp.split(",");
               employees e= new employees();
               System.out.println("Hi");
               e.id=Long.parseLong(data[0]);
               e.legalFirstName=data[1];
               e.preferredFirstName=data[2];
               e.lastName=data[3];
               e.studentUsername=data[4];
               e.sponsoredUsername=data[5];
               e.position=data[6];
               e.status=data[7];
               e.wage=Double.parseDouble(data[8]);
               e.coriChecked=(data[9]).charAt(0);
               e.shirtSize=data[10];
               e.scheduleId=data[11];
               e.startDate=data[13];
               e.terminationDate=data[12];
               edto.save(e);
           }
       }
       catch(FileNotFoundException e){
            e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       }
   }
}
