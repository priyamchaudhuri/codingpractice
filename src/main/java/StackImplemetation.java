public class StackImplemetation<V> {
     private int top;
     private int maxSize;
     private V arr[];

     public StackImplemetation(int capacity){
         this.maxSize=capacity;
         this.top=-1;
         arr=(V[])new Object[capacity];
     }

     public int getMaxSize(){
         return this.maxSize;
     }

    //returns true if Stack is empty
    public boolean isEmpty(){
        return top == -1;
    }

    //returns true if Stack is full
    public boolean isFull(){
        return top == maxSize -1;
    }

    public V top(){
         if (isEmpty()){
             return null;
         }else
             return arr[top];
    }

    public void push(V value){
         if (isFull()){
             System.out.println("Stack is full");
             return;
         }
         arr[++top]=value;
    }

    public V pop(){
         if (isEmpty())
             return null;
         return arr[top--];
    }




    public static void main(String[] args) {
        StackImplemetation<Integer> stackImplemetation=new StackImplemetation(10);
        stackImplemetation.push(1);
        stackImplemetation.push(4);
        stackImplemetation.push(2);
        System.out.println(stackImplemetation.top);
        System.out.println(stackImplemetation.pop());
    }


}
