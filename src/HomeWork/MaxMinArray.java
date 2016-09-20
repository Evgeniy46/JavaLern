package HomeWork;

/**
 * Created by Евгений on 13.09.2016.
 */
public class MaxMinArray {
    public static void main(String args[]) {
        int Arr[] = {12, 2, 5, 8, 88, -3, 65, 100, -15, 7, 1,0};
        int min = 0;
        int max = 0;
        for (int x : Arr) {
            if (x > max) {
                max = x;
            }
            if (x < min) {
                min = x;
            }
        }
        System.out.println("Максимальное значение массива :" + max);
        System.out.println("минимальное значение массива :" + min);
    }
}
