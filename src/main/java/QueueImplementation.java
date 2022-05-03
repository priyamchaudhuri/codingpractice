public class QueueImplementation<V> {
    private V[] arr;
    private int front;
    private int back;
    private int maxSize;
    private int currentSize;

    public QueueImplementation(int size){
        this.maxSize=size;
        this.front=0;
        this.back=-1;
        arr=(V[])new Object();
        currentSize=0;
    }

    public boolean isEmpty(){
        return currentSize==0;
    }

    public boolean isFull(){
        return currentSize==maxSize-1;
    }

    public void enqueue(V value){
        if (isFull()){
            System.out.println("Queue size is full");
        }
        arr[++back]=value;
        currentSize++;
    }

    public void dequeue(){

    }


    public static void main(String[] args) {

    }


}
