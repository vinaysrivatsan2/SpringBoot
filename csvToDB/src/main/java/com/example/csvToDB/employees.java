package com.example.csvToDB;



import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.opencsv.bean.CsvBindByName;


@Entity
@JsonInclude(Include.NON_EMPTY)
@Table(name = "employees")
    public class employees  {

        @Id
        @Column(name = "nuid")
        @CsvBindByName
        public long id;
        @CsvBindByName
        public String legalFirstName;
        @CsvBindByName
        public String preferredFirstName;
        @CsvBindByName
        public String lastName;
        @CsvBindByName
        public String studentUsername;
        @CsvBindByName
        public String sponsoredUsername;

        @CsvBindByName
        public String position;
        @CsvBindByName
        public String status;
        @CsvBindByName
        public double wage;
        @CsvBindByName
        public char coriChecked;
        @CsvBindByName
        public String shirtSize;
        @CsvBindByName
        public String scheduleId;
        @CsvBindByName
        public String terminationDate;
        @CsvBindByName
        public String startDate;

        @Override
        public String toString(){
            return "nuid "+id+", name:" +preferredFirstName;
        }

    }


