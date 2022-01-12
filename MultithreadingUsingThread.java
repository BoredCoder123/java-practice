class MultithreadingUsingThread{
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}

class MyThread1 extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("My thread 1 is running");
            System.out.println("x");;
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("My thread 2 is running");
            System.out.println("My thread 2 is done");;
        }
    }
}