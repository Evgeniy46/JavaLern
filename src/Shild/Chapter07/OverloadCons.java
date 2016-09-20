package Shild.Chapter07;

/**
 * Created by Евгений on 17.09.2016.
 */
public class OverloadCons {
    public static void main(String args[]){
        //создать параллелепипеды используя разные
        //конструкторы
        Box1 mybox1 = new Box1(10,20,15);
        Box1 mybox2 = new Box1();
        Box1 mycube = new Box1(7);

        double vol;

        //получить обьем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println(" Обьем mybox1 равен " + vol);

        //получить обьем второго парралелепеипеджа
        vol = mybox2.volume();
        System.out.println(" Обьем mybox2 равен " + vol);

        //получить обьем куба
        vol = mycube.volume();
        System.out.println(" Обьем mycube равен " + vol);
    }
}
