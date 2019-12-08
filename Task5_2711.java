import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Task5_2711 {
    public static void main(String[] args) {
        Map  <Character, Integer> inMap = new TreeMap<>();
        for (int i=65;i<91;i++)
            inMap.put((char) i, i);
        for (int i=97;i<122;i++)
            inMap.put((char) i,i);
        System.out.println(inMap.keySet());
        System.out.println(inMap.values());
        Map  <Object,Object> rezMap= new HashMap<>();
        rezMap=flipOver (inMap);
        System.out.println(rezMap.keySet());
        System.out.println(rezMap.values());
    }
    public static  Map flipOver (Map inMap)
    {
        Map<Object, Object> rezMap= new HashMap<>();
        for (Object i:inMap.keySet())
             rezMap.put(inMap.get(i),i);
        return rezMap;
    }
}
