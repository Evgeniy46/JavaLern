package Shild.Chapter07;

/**
 * Created by Евгений on 20.09.2016.
 */
//вывести все аргументы командной строки
public class CommondLine {
    public static void main(String args[]) {
        for(int i=0; i<args.length; i++)
            System.out.println("args[" + i + "]: " + args[i]);
    }
}
