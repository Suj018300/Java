
class A extends Thread {
    public void run() {
        for (int i=1;i<=100;i++) {
            System.out.println("Hii A");
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i=1;i<=100;i++) {
            System.out.println("Helloooooooooo B");
        }
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        A obj1= new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();
    }
}