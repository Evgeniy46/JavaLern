package com.cbsgenesis.classroom.controller;

import com.cbsgenesis.classroom.model.Chair;

/**
 * Created by Java on 15.09.2016.
 */
public class ChairController implements GenericController {

    Chair chair;

    public ChairController(Chair chair) {
        this.chair = chair;
    }

    @Override
    public void showDetails(){
        System.out.println("Name : "+chair.getName());
        System.out.println("Color :"+chair.getColor());

    }



}
