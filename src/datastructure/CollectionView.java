package datastructure;

import java.util.*;

public class CollectionView {

public static void main(String[] args) {
        /*
         Map is created and inserted some data.Retrieve the Collection view of values present in map
         */
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "NewYork");
        map.put(2, "NewJersy");
        map.put(3, "Chicago");
        map.put(4, "Boston");
        map.put(5, "connecticut");
        map.put(6, "pennsylvania");

        Set<Map.Entry<Integer, String>> set = map.entrySet();
        for (Map.Entry< Integer, String> mapEntry: set) {
                System.out.print(mapEntry.getKey()+": ");
                System.out.println(mapEntry.getValue());
        }



    }

}
