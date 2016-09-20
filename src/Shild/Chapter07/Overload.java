package Shild.Chapter07;

/**
 * Created by Евгений on 17.09.2016.
 */
public class Overload {
    public static void main(String args[]){
        OverloadDemo ob = new OverloadDemo();
        double result;

        //вызывать все варианты метода test()
        ob.test();
        ob.test(10);
        ob.test(10,20);
        result = ob.test(123.25);
        System.out.println("Результат вызова ob.test(123.25): " + result);
    }
}
