package com.example.csvToDB;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;

@RestController
public class    Controller {

    @Autowired
    private employeesService es;
//    @RequestMapping(path="feedEmployeesData")
//    public void setDataInDb(){
//           es.saveEmployeeData();
//    }


    @PostMapping("/upload-csv-file")
    public String uploadCSVFile(@RequestParam("file") MultipartFile file) throws IOException {

        // validate file
        if (file.isEmpty()) {
            System.out.println("No file");
        } else {

            // parse CSV file to create a list of `User` objects


                // create csv bean reader

                es.saveEmployeeData(file);
                // TODO: save users in DB?

                // save users list on model



        }

        return "file-upload-status";
    }
}
