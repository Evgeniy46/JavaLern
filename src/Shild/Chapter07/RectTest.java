package Shild.Chapter07;

/**
 * Created by Евгений on 19.09.2016.
 */
//Еще один пример рекурсии
public class RectTest {
    int values[];

    RectTest(int i){
        values = new int[i];
    }
    //вывести рекурсивно элементы массива
    void printArray(int i){
        if(i==0) return;
        else printArray(i-1);
        System.out.println("[" + (i-1) + "] " + values[i-1]);
    }
}
