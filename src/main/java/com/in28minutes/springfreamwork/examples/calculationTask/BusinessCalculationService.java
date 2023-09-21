package com.in28minutes.springfreamwork.examples.calculationTask;

import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component
public class BusinessCalculationService {
    private DataService dataService;

    // Constructor
    public BusinessCalculationService(DataService dataService){
        super();
        this.dataService  = dataService;
    }

    public int findMax(){
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
