import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeat {
    public static void main(String[] args) {
        String s1= "aabssfd";
        Character c=firstNonRepeating(s1);
        if (c!=null)
        System.out.println("first non repeating character " + c);
        else{
            System.out.println("no non repeating character");
        }
    }

    public static Character firstNonRepeating(String s){
        Map<Character,Integer> map=new LinkedHashMap<>();
        if (s.length()==1){
            return s.charAt(0);
        }
        for (int i=0;i<s.length()-1;i++){
            if (!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }else{
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
        }
//        for(int i=0;i<s.length()-1;i++){
//            int j=map.get(s.charAt(i));
//            if (j==1){
//                return i;
//            }
//        }
        for(Map.Entry entry:map.entrySet()){
            if ((Integer) entry.getValue()==1){
                return (Character) entry.getKey();
            }
        }

        // return map.entrySet().stream().filter(x->x.getValue()==1).findFirst().get().getKey();
        return null;
    }
}
