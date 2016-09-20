package Shild.Chapter07;

/**
 * Created by Евгений on 17.09.2016.
 */
public class OverloadCons1 {
    public static void main(String args []){
        //Создать параалллелепипеды используя
        //разные конструкторы
        Box2 mybox1 = new Box2(10,20,15);
        Box2 mybox2 = new Box2();
        Box2 mycube = new Box2(7);

        Box2 myclone = new Box2(mybox1);
        //создать копию обьекта mybox1
        double vol;

        //получить обьем первого парлелепипеда
        vol = mybox1.volume();
        System.out.println("Обьем mybox1 равен " + vol);

        //получить обьем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Обьем mybox2 равен " + vol);

        //получить обьем куба
        vol = mycube.volume();
        System.out.println("Обьем куба равен " + vol);

        //получить обьем клона
        vol = myclone.volume();
        System.out.println("Обьем клона равен " + vol);
    }

}
