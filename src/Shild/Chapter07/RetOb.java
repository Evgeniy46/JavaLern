package Shild.Chapter07;

/**
 * Created by Евгений on 19.09.2016.
 */
public class RetOb {
    public static void main(String args[]){
        Test3 ob1 = new Test3(2);
        Test3 ob2;

        ob2 = ob1.incrByten();
        System.out.println("ob1.a:" + ob1.a);
        System.out.println("ob2.a:" + ob2.a);

        ob2 = ob2.incrByten();
        System.out.println("ob2.a после второго увеличения значения: " + ob2.a);

    }
}
