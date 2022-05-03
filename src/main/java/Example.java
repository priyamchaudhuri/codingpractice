import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Example {
    public static void main(String[] args) {

        ObjectPool objectPool=new ObjectPool(10,"Employee");
        objectPool.createObjects();
        Employee employee=(Employee) objectPool.getInstance();
        //objectPool.addBack(employee);
    }
}

class Employee{
    int id;
    int salary;




}

// Custom Object Pool
// If all objects are given to client, new request should wait till objects are moved
//   to pull

// Get objects from the pool
// release objects - gets added back to the pool
//at a time only 1 type of object
//client will share the object pool size


class ObjectPool{
    int freePool;
    int size;

    List objectList;
    String objectType;



   public ObjectPool(int size,String objectType){
       this.size=size;
       this.objectType=objectType;

    }

    public Object getInstance(){
        if (freePool==0){
            return null;
        }else{
            Object object=objectList.remove(0);
            freePool--;
            return object;
        }
    }

    public void createObjects(){
       List list=new ArrayList();
      for(int i=0;i<size;i++) {
          Object object = new Object();
          list.add(object);
      }

    }
}