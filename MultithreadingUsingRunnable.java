public class MultithreadingUsingRunnable {
    public static void main(String[] args) {
        Runnable1 r1 = new Runnable1();
        Thread thread1 = new Thread(r1);
        Runnable2 r2 = new Runnable2();
        Thread thread2 = new Thread(r2);
        thread1.start();
        thread2.start();
    }
}

class Runnable1 implements Runnable {
    @Override
    public void run() {
        while(true){
            System.out.println("Runnable 1 is running");
            System.out.println("x");
        }
    }
}

class Runnable2 implements Runnable {
    @Override
    public void run() {
        while(true){
            System.out.println("Runnable 2 is running");
        }
    }
}