package Shild.Chapter07;

/**
 * Created by Евгений on 19.09.2016.
 */
public class Recursion2 {
    public static void main(String args[]) {
        RectTest ob = new RectTest(10);
        int i;

        for (i = 0; i < 10; i++)
            ob.values[i] = i;
        ob.printArray(10);
    }
}
