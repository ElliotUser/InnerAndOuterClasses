package exc01;

public class Outer {
    private int outer_x = 100;

    public void test(){
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {
        void display(){
            System.out.println("вывод: outer_x = " +outer_x);
        }
    }
}
