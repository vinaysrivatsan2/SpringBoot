package com.example.csvToDB;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity

    public class employees  {

        @Id
        @Column(name = "nuid")

        public long id;

        public String legalFirstName;
        public String preferredFirstName;
        public String lastName;

        public String studentUsername;
        public String sponsoredUsername;


        public String position;

        public String status;
        public double wage;
        public char coriChecked;

        public String shirtSize;
        public String scheduleId;

        public String terminationDate;
        public String startDate;



    }


