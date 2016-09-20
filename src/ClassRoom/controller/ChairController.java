package ClassRoom.controller;

import ClassRoom.model.Chair;

/**
 * Created by Евгений on 20.09.2016.
 */
public class ChairController implements GenericController {

    Chair chair;

    public ChairController(Chair chair) {
        this.chair = chair;
    }

    @Override
    public void showDetails() {
        System.out.println("Name : " + chair.getName());
        System.out.println("Color :" + chair.getColor());

    }
}
