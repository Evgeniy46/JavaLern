package Shild.Chapter07;

/**
 * Created by Евгений on 17.09.2016.
 */
//В этой версии Box2 один обьект допускается
//инициализировать другим обьектом
public class Box2 {
    double width;
    double height;
    double depth;

    //Обратите внимание на этот конструктор.
    //В качестве параметра в нем используетсяобьект типа Box2
    Box2(Box2 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    //Конструктор, используемый пи указании всех размеров
    public Box2(double w, double h, double d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }
    //Конструктор, используемый , когда ни один из размеров не указан
    Box2(){
        width = -1; //Использовать значение - 1 для обозначения
        height = -1;//неининициализированного
        depth = -1; //параллелепипеда
    }
    //конструктор испльзуемый при создании куба
    Box2(double len) {
        width = height = depth = len;
    }
    //расчитать и возратить обьем
    double volume(){

        return width*height*depth;
    }
}
