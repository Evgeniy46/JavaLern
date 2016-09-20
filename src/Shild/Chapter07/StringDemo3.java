package Shild.Chapter07;

/**
 * Created by Евгений on 20.09.2016.
 */
//Продемонстрировать применение массивов обьектов типа String0
public class StringDemo3 {
    public static void main(String args[]) {
        String str[] = {"один", "два", "три"};

        for (int i = 0; i < str.length; i++)
            System.out.println("str[" + i + "]: " + str[i]);
    }
}
