import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] s1={"eat","tea","tan","ate","nat","bat"};
        Map<String,List<String >> map=groupanagram(s1);
        System.out.println(map.size());
        for (String s : map.keySet()) {
            List<String> values = map.get(s);
            System.out.print(values);

        }
    }

    public static Map<String,List<String >> groupanagram(String[] s1){
        Map<String,List<String>> map=new HashMap();
        for (int i=0;i<s1.length;i++){
            char tempArray[]= s1[i].toCharArray();
            Arrays.sort(tempArray);
            String word=new String(tempArray);
            if(map.get(word)==null) {
                List<String> list=new ArrayList();
                list.add(s1[i]);
                map.put(word,list);
            }else{
                List<String> list=map.get(word);
                list.add(s1[i]);
                map.put(word,list);
            }
        }
        return map;
    }
}
