package Shild.Chapter07;

/**
 * Created by Евгений on 17.09.2016.
 */
//Обьекты допускается передавать методам в качестве параметров
public class Test {
    int a,b;

    Test (int i, int j){
        a = i;
        b = j;
    }
    //возвратить логическое значение true, если в
    //качестве параметра о указан вызывающий оьект
    boolean equals(Test o){
        if(o.a == a && o.b == b)return true;
        else return false;
    }
}
