package Shild.Chapter07;

/**
 * Created by Евгений on 17.09.2016.
 */
public class Overload1 {
    public static void main(String args []){
        OverloadDemo1 ob = new OverloadDemo1();
        int i = 88;

        ob.test();
        ob.test(10,20);

        ob.test(i);    //Здесь вызывается вариант метода test(double)
        ob.test(123.2);//а здесь вызывается вариант метода test(double)
    }
}
