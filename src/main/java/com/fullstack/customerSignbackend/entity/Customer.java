package com.fullstack.customerSignbackend.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CUSTOMER")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int custID;

    private String custName;

    private String custAddress;

    private String custContactNumber;

    @JsonFormat (pattern = "yyyy-MM-dd")
    private Date custDOB;

    private String custEmailId;

    private String custPassword;



}
