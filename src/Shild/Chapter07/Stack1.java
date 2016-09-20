package Shild.Chapter07;

/**
 * Created by Евгений on 20.09.2016.
 */
//усовершенствованный член длины массива
//использован член длины массива
public class Stack1 {
    private int stck[];
    private int tos;

    //выделить память под стек и инициализировать его
    Stack1(int size) {
        stck = new int[size];
        tos = -1;
    }

    //разместить элемент в стеке
    void push(int item) {
        if (tos == stck.length - 1)//использовать член длины массива
            System.out.println("Стек заполнен.");
        else
            stck[++tos] = item;
    }

    //извлеч элементы из стека
    int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        } else
            return stck[tos--];
    }
}
