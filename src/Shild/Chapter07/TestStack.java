package Shild.Chapter07;

/**
 * Created by Евгений on 19.09.2016.
 */
public class TestStack {
    public static void main(String args[]) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        //раместить числа в стеке
        for (int i = 0; i < 10; i++) mystack1.push(i);
        for (int i = 10; i < 20; i++) mystack2.push(i);

        //Извлеч эти числа из стека
        System.out.println("Стек в mystack1: ");

        for (int i = 0; i < 10; i++)
            System.out.println(mystack1.pop());

        System.out.println("Стек в mystack2: ");

        for (int i = 0; i<10; i++)
            System.out.println(mystack2.pop());

        //Эти операторы не допустимым
        // mystack1.tos = -2;
        //mystack2.stck[3] = 100;
    }

}
