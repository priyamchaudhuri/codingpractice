import java.util.*;

public class MaxNumber {
    public static void main(String[] args) {
        Integer arr[]={54,546,548,60};
        findMax(arr);
    }

    public static void findMax(Integer []arr){
        List arr1=Arrays.asList(arr);
        Collections.sort(arr1,new Comparator<Integer>(){
            public int compare(Integer X,Integer Y){
               String a=X.toString();
               String b=Y.toString();
               String ab=a+b;
               String ba=b+a;
              if (ab.compareTo(ba)>0)
                  return -1;
              else
                  return 1;
            }
        });
       Iterator iterator= arr1.iterator();
       while(iterator.hasNext()){
           System.out.print(iterator.next());
       }
    }

}
