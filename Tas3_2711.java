import java.util.Collection;

import java.util.*;

public class Tas3_2711 {
    public static void main(String[] args) {
        String inStr = "A new year has begun "+
                       "A new year for trying " +
                       "for a year that is new";
        String[] str=inStr.split(" ");

        ArrayList<String> Test= new  ArrayList <> (Arrays.asList(str));
        System.out.println(Test.toString());
        System.out.println(removeDuplicates(Test).toString());
       // Test.add()


    }
    public static Collection removeDuplicates (Collection inCollection)
    {
        Set set = new HashSet(inCollection);
        inCollection.clear();
        inCollection.addAll(set);
        return inCollection;
    }
}
