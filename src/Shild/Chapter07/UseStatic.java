package Shild.Chapter07;

/**
 * Created by Евгений on 19.09.2016.
 */
public class UseStatic {
    static int a = 3;
    static int b;

    static void meth(int x){
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    static{
        System.out.println("Статический блок инициализирован.");
        b = a * 4;
    }
    public static void main(String args[]){
        meth(42);
    }
}
