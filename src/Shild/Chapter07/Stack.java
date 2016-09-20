package Shild.Chapter07;

/**
 * Created by Евгений on 19.09.2016.
 *///В этом классе определяется целочисленный стек, который может
// содержать 10 значений
public class Stack {
    /*Теперь перемнные stck и tos являются закрытыми
     Это означает, что они не могут быть случайно или
     намеренно изменены таким образом , чтобы нарушить стек
      */
    private int stck[] = new int [10];
    private int tos;

    //инициализировать вершину стека

    Stack(){
        tos = -1;
    }

    //Разместить элемент в стеке
    void push(int item){
        if(tos == 9)
            System.out.println("Стек заполнен.");
        else
            stck[++tos] = item;
    }
    //извлеч элементы из стека
    int pop(){
        if(tos < 0){
            System.out.println("Стек не загружен.");
            return 0;
        }
        else
            return stck[tos--];
    }



}
