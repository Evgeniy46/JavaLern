package Shild.Chapter07;

/**
 * Created by Евгений on 20.09.2016.
 */
public class TestSteck1 {
    public static void main(String args[]) {
        Stack1 mystack1 = new Stack1(5);
        Stack1 mystack2 = new Stack1(8);

        //разместить числа в стеке
        for (int i = 0; i < 5; i++) mystack1.push(i);
        for (int i = 0; i < 8; i++) mystack2.push(i);

        //извлеч эти числа из стека
        System.out.println("Стек в mystack1:");
        for (int i = 0; i < 5; i++)
            System.out.println(mystack1.pop());

        System.out.println("Стек в mystack2:");
        for (int i = 0; i < 8; i++)
            System.out.println(mystack2.pop());


    }
}
