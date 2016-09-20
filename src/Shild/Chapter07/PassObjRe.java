package Shild.Chapter07;

/**
 * Created by Евгений on 19.09.2016.
 */
public class PassObjRe {
    public static void main(String args[]){
        Test2 ob = new Test2(15,20);
        System.out.println("ob.a и ob.b до вызова: " + ob.a + " " + ob.b);

        ob.meth(ob);

        System.out.println("ob.a и ob.b после вызова: " + ob.a + " " + ob.b);
    }
}
