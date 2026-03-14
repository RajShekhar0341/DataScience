class MyThread extends Thread {
    public MyThread() {
        super(); // Calls the base class (Thread) constructor
        System.out.println("MyThread constructor called");
    }

    @Override
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}