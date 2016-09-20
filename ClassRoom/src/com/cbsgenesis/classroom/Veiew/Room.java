package com.cbsgenesis.classroom.Veiew;

import com.cbsgenesis.classroom.controller.ChairController;

/**
 * Created by Java on 15.09.2016.
 */
public class Room {

    ChairController chairController;

    public Room(ChairController chairController) {
        this.chairController = chairController;
    }
    public void showChairController(){

        this.chairController.showDetails();



    }
}
