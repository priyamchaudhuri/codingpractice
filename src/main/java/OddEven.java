import java.util.SortedMap;

public class OddEven {
    int counter=1;
    static int n;
    public static void main(String[] args) {
         n=10;
        OddEven oe=new OddEven();
        Thread t1=new Thread(new Runnable(){
            public void run(){
               oe.printOddNumber();
            }
        },"Thread-1");

        Thread t2=new Thread(new Runnable(){
            public void run(){
               oe.printEvenNumber();
            }
        },"Thread-2");
        t1.start();
        t2.start();
    }

    public void printOddNumber(){
       synchronized (this){
        while (counter<n) {
            if (counter % 2 == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
                System.out.println(Thread.currentThread().getName() + " " + counter);
                counter++;
                notify();
            }

        }
    }

    public void printEvenNumber(){
        synchronized (this){
        while (counter<=n) {
            if (counter % 2 != 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
                System.out.println(Thread.currentThread().getName() + " " + counter);
                counter++;
                notify();
            }

        }
    }
}
