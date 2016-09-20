package Shild.Chapter07;

/**
 * Created by Евгений on 17.09.2016.
 */
public class Box1 {
    double width;
    double height;
    double depth;

    //Конструктор, используемый пи указании всех размеров
    public Box1(double w, double h, double d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    //Конструктор, используемый , когда ни один из размеров не указан
    Box1(){
        width = -1;
        height = -1;
        depth = -1;
    }
    //конструктор испльзуемый при создании куба
    Box1(double len){

        width = height = depth = len;
    }

    //расчитать и возратить обьем
    double volume() {
        return width*height*depth;
    }
}

