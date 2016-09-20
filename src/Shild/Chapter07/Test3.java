package Shild.Chapter07;

/**
 * Created by Евгений on 19.09.2016.
 */
public class Test3 {
    int a;

    Test3(int i) {
      a = i;
    }

    Test3 incrByten() {
        Test3 temp = new Test3(a + 10);
        return temp;
    }
}
