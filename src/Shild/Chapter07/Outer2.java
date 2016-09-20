package Shild.Chapter07;

/**
 * Created by Евгений on 20.09.2016.
 */
//определить внутренний класс в цикле for
public class Outer2 {
    int outer_x = 100;

    void test() {
        for(int i=0; i<10; i++) {
            class Inner {
                void display() {
                    System.out.println("вывод: outer_x = " + outer_x);
                }
            }
            Inner inner = new Inner();
            inner.display();
        }
    }
}
