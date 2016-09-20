package Shild.Chapter07;

/**
 * Created by Евгений on 20.09.2016.
 */
//Эта программа не подлежит компиляции
public class Outer1 {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    //Это внутренний класс
    class Inner {
        int y = 10;//y локальная переменная класса Inner

        void display() {
            System.out.println("вывод: outer_x = " + outer_x);
        }
    }

    void showy() {
        /*System.out.println(y);//ОШИБКА , здесь переменная y не доступна*/
    }

}
