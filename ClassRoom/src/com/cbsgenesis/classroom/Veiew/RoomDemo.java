package com.cbsgenesis.classroom.Veiew;

import com.cbsgenesis.classroom.controller.ChairController;
import com.cbsgenesis.classroom.model.Chair;

/**
 * Created by Java on 15.09.2016.
 */
public class RoomDemo {
    public static void main(String args[]){
        Chair chair = new Chair();
        chair.setName("Super Chair");
        chair.setColor("Braun");

        ChairController chairController = new ChairController(chair);

        Room room = new Room(chairController);

        room.showChairController();


    }
}
