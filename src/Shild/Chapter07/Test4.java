package Shild.Chapter07;

/**
 * Created by Евгений on 19.09.2016.
 */
//В этой программе демонстрируется отличие
//модификаторов public и private
public class Test4 {
    int a;         //доступ,определяемый по умлчанию
    public int b;  //открытый доступ
    private int c; //закрытый доступ

    //методы доступа к члену с данного класса
    void setc(int i) { //установить значение члена c  данного класса
        c = i;
    }

    int getc() {       //получить значение члена c данного класса
        return c;
    }
}
