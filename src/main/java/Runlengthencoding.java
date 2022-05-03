import java.util.LinkedHashMap;
import java.util.Map;

public class Runlengthencoding {
    public static void main(String[] args) {
        String s="aasddddbc";
        String s1=runlength(s);
        System.out.println(s1);
    }

    public static String runlength(String s){
        Map<Character,Integer> map=new LinkedHashMap();
        for(int i=0;i<s.length();i++){
            if (map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i),1);
            }
        }
        String s1="";
        for (Map.Entry entry:map.entrySet()){
            s1=s1+entry.getKey()+entry.getValue();
        }
        return s1;
    }
}
