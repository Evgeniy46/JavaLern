package Shild.Chapter07;

/**
 * Created by Евгений on 20.09.2016.
 */
//продемонстрировать применение внутреннего класса
public class Outer {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    //это внутренний класс
    class Inner {
        void display() {
            System.out.println("вывод: outer_x = " + outer_x);
        }
    }
}
