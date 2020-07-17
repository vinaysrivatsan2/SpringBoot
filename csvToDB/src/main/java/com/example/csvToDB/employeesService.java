package com.example.csvToDB;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.List;

@Service
public class employeesService {

   @Autowired
    private employeeDTO edto;

   employees data_emp;
   public void saveEmployeeData(MultipartFile file) throws IOException {
       Reader reader = new BufferedReader(new InputStreamReader(file.getInputStream()));
       CsvToBean<employees> csvToBean = new CsvToBeanBuilder<employees>(reader)
               .withType(employees.class)
               .withIgnoreLeadingWhiteSpace(true)
               .build();

       // convert `CsvToBean` object to list of users
       List<employees> users = csvToBean.parse();
       System.out.println(users.get(0));
       edto.saveAll(users);
   }

////           BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\vinay\\OneDrive\\Desktop\\vinay\\ITS\\staff_roster\\employees1.csv"));
//
//           int len= a.size(), temp=0;
//           while(len>0){
//
//               data_emp=a.get(temp++);
////               String[] data= data_emp.split(",");
//               employees e= new employees();
//               System.out.println("Hi");
//               e.id=
//                       data_emp.id;
//               e.legalFirstName=data_emp.legalFirstName;
//               e.preferredFirstName=data_emp.preferredFirstName;
//               e.lastName=data_emp.lastName;
//               e.studentUsername=data_emp.studentUsername;
//               e.sponsoredUsername=data_emp.sponsoredUsername;
//               e.position=data_emp.position;
//               e.status=data_emp.status;
//               e.wage=data_emp.wage;
//               e.coriChecked=data_emp.coriChecked;
//               e.shirtSize=data_emp.shirtSize;
//               e.scheduleId=data_emp.scheduleId;
//               e.startDate=data_emp.startDate;
//               e.terminationDate=data_emp.terminationDate;
//               len--;
//               edto.save(e);
//           }
//       }



}
