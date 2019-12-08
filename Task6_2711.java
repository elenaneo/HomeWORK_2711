import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Task6_2711 {
    public static void main(String[] args) {
        String[] result = {"Ivan 5", "Petr 3", "Alex 10", "Petr 8", "Ivan 6", "Alex 5", "Ivan 1", "Petr 5", "Alex 1"};
        Map<String, Integer> rezMap = new TreeMap<>();
        String maxKey = new String(), lastMaxKey  = new String();
        for (int i = 0; i < result.length; i++)
            if (rezMap.containsKey(result[i].substring(0, result[i].indexOf(" ")))) {
                if (!lastMaxKey.isEmpty())
                {System.out.println ("не пусто"+"|"+lastMaxKey);
                    maxKey = maxKey(rezMap,rezMap.get(lastMaxKey));}
                else
                {System.out.println ("пусто");
                    maxKey = maxKey(rezMap,0);}
                System.out.println ("max"+"|"+maxKey);
                if (!maxKey.equals("null")) {
                    lastMaxKey = maxKey;
                    System.out.println ("max null"+"|"+);
                }
                rezMap.put(result[i].substring(0, result[i].indexOf(" ")),
                        rezMap.get(result[i].substring(0, result[i].indexOf(" ")))
                                + Integer.parseInt(result[i].substring(result[i].indexOf(" ") + 1)));
            } else
                rezMap.put(result[i].substring(0, result[i].indexOf(" ")), Integer.parseInt(result[i].substring(result[i].indexOf(" ") + 1)));
        System.out.println (rezMap.keySet());
        System.out.println (rezMap.values());
        System.out.println (maxKey);
        System.out.println (lastMaxKey);

    }
            //System.out.println(result[i].substring(0,result[i].indexOf(" "))+"|"+result[i].substring(result[i].indexOf(" ")+1));

    public static String maxKey (Map inMap,Integer maxValue)
    {
        TreeMap<Object, Object> rezMap= new TreeMap<>();
        for (Object i:inMap.keySet())
            rezMap.put(inMap.get(i),i);
        if (maxValue==rezMap.lastKey())
            return null;
        else
            return rezMap.get(rezMap.lastKey()).toString();

    }
}
