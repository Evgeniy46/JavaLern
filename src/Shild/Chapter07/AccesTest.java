package Shild.Chapter07;

/**
 * Created by Евгений on 19.09.2016.
 */
public class AccesTest {
    public static void main(String args[]) {
        Test4 ob = new Test4();

        //эти операторы правильны, поэтому члены a и b
        //данного класса доступны непосредственно
        ob.a = 10;
        ob.b = 20;

        //Этот оператор неверен и может вызвать ошибку
        //ob.c = 100; ОШИБКА!!!!!!!!!!!!!!!!!!!!!!!!!!

        //Доступ к члену c данного класса должен осуществляться
        // с помощью методов ее класса
        ob.setc(100);//ВЕРНО!
        System.out.println("a, b, и c: " + ob.a + " "+ ob.b + " " + ob.getc());
    }
}
