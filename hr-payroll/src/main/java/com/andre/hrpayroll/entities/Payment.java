package com.andre.hrpayroll.entities;


import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Payment implements Serializable {

    private String name;
    private Double dailyIncome;
    private Integer days;


    public Double getTotal(){
        return days * dailyIncome;
    }

}
