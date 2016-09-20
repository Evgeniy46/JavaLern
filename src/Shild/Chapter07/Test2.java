package Shild.Chapter07;

/**
 * Created by Евгений on 19.09.2016.
 */
public class Test2 {
    int a,b;

    Test2(int i, int j){
        a = i;
        b = j;
    }
    //передать обьект
    void meth(Test2 o){
        o.a *=2;
        o.b /=2;
    }

}
