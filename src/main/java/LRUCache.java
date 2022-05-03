import java.util.*;

public class LRUCache {
    Deque<CacheEntry> dq=new LinkedList<>();
    Map<Integer,CacheEntry> map=new HashMap<>();
    int CACHE_SIZE=3;

    public String getFromCache(int i){
        if (map.containsKey(i)){
            CacheEntry entry=map.get(i);
            dq.remove(entry);
            dq.addFirst(entry);
            return entry.value;
        }
        return null;
    }

    public void putToCache(CacheEntry c){
        if (map.containsKey(c.key)){
            CacheEntry cacheEntry=map.get(c.key);
            dq.remove(cacheEntry);
        }else{
            if(dq.size()==CACHE_SIZE) {
                CacheEntry removedCacheEntry = dq.removeLast();;
                map.remove(removedCacheEntry.key);
            }

        }
        map.put(c.key,c);
        dq.addFirst(c);
    }


    public static void main(String[] args) {
          LRUCache lru=new LRUCache();
          lru.putToCache(new CacheEntry(1,"Hello"));
         lru.putToCache(new CacheEntry(2,"Hello2"));
         lru.putToCache(new CacheEntry(3,"Hello3"));
         lru.putToCache(new CacheEntry(4,"Hello4"));
         lru.putToCache(new CacheEntry(2,"Hello5"));

        System.out.println(lru.getFromCache(1));
        System.out.println(lru.getFromCache(2));
        for (CacheEntry cacheEntry:lru.dq){
            System.out.println(cacheEntry.key + " "+ cacheEntry.value);
        }



    }


}



class CacheEntry{
    int key;
    String value;

    CacheEntry(int key,String value){
        this.key=key;
        this.value=value;
    }

}