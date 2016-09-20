package Shild.Chapter07;

/**
 * Created by Евгений on 17.09.2016.
 */
public class Box {
    double width;
    double height;
    double depth;

    //Это конструктор класаа Box


    public Box(double w, double h, double d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }
    //Расчитать и возратить обьем
    double volume(){
        return width*height*depth;
    }
}
