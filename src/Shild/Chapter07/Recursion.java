package Shild.Chapter07;

/**
 * Created by Евгений on 19.09.2016.
 */
public class Recursion {
    public static void main(String args[]){
        Factorial f = new Factorial();

        System.out.println("Факториал 3 равен " + f.fact(3));
        System.out.println("Факториал 4 равен " + f.fact(4));
        System.out.println("Факториал 5 равен " + f.fact(5));
    }
}
