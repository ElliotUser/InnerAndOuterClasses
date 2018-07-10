package exc02;

public class Outer {
    private int outer_x = 100;

    public void test(){
        Inner inner = new Inner();
        inner.display();
    }

    class Inner{
        int y = 10;

        void display(){
            System.out.println("вывод: outer_x = "+ outer_x);
        }
    }

//    public void showy(){
//        System.out.println(y);      //ошибка, здесь переменная y недоступна!
//    }
}
