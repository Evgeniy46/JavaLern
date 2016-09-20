package Shild.Chapter06;

/**
 * Created by Евгений on 17.09.2016.
 */

//В этом классе определяется целочисленный стек, в котором
// можно хранить до 10 целочисленных значений
public class Stack {
    int stck[] = new int [10];
    int tos;
    //инициализировать вершину стека
    Stack(){
        tos = -1;
    }
    //размеестить элемент в стеке
    void push(int item){
        if (tos == 9)
            System.out.println("Стек заполнен");
        else
            stck[++tos]=item;
    }
    //извлеч элемент из стека
    int pop (){
        if(tos<0){
            System.out.println("Стек не загружен.");
            return 0;
        }
        else
            return stck[tos--];
    }

}
