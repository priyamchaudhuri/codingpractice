public class Deadlock {
    public static void main(String[] args) {
        Deadlock dc=new Deadlock();

        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
               dc.printOne();
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
               dc.printTwo();
            }
        });
        t1.start();
        try {
            t1.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }

    public void printOne(){
        synchronized (Integer.class){
            System.out.println("Acquired lock on Integer class");
        }
        synchronized (String.class){
            System.out.println("Acquired lock on String class");
        }
    }

    public void printTwo(){
        synchronized (Integer.class){
            System.out.println("Acquired lock on Integer class");
        }
        synchronized (String.class){
            System.out.println("Acquired lock on String class");
        }
    }
}
