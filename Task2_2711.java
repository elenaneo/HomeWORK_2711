import java.util.Map;
import java.util.TreeMap;

public class Task2_2711 {

    public static void main(String[] args) {
        String inStr = "A new year has begun\n"+
                "January is month number one.\n" +
                "It is the start of a whole new year,\n" +
                "There’s nothing to fear\n" +
                "A new year for trying\n" +
                "not for sighing\n" +
                "What goals can you make,\n" +
               "for your own sake,\n" +
               "For a better you,\n" +
               "for a year that is new!";

        Map <Character, Integer> myAlphabet = new TreeMap<> ();
        for (int i=65;i<91;i++)
            myAlphabet.put((char) i,0);
        for (int i=97;i<122;i++)
            myAlphabet.put((char) i,0);
        for (int i=0;i<inStr.length();i++)
            if (myAlphabet.containsKey(inStr.charAt(i)))
                //System.out.println(i+"|"+inStr.charAt(i));
            myAlphabet.put(inStr.charAt(i),myAlphabet.get(inStr.charAt(i))+1);
        for (char i:myAlphabet.keySet())
            System.out.print(i+" - "+ myAlphabet.get(i)+";");

    }
}
