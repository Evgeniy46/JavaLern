package Shild.Chapter07;

/**
 * Created by Евгений on 19.09.2016.
 */
//Простой пример рекурсии
public class Factorial {
    //Это рекрсивный метод
    int fact(int n){
        int result;

        if(n==1)return 1;
        result = fact(n-1)*n;
        return result;
    }
}
