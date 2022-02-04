package lmsHW3;

import java.util.*;

public class ListMap {

    public static void main(String[] args) {

    }

    public void listAndMap(){

        List<Integer> l1 = Arrays.asList(1,2,3,4,10);

        Map<String,String> m1 = new HashMap<>(){{
            put("a","1");
            put("b","2");
            put("c","10");
        }};

    }

    public List<Integer> contains(List<Integer> l1, Map<String,String> m1){

        List<Integer> doesContain = new ArrayList<>();

        for(Integer i : l1) {

            if(!m1.containsValue(String.valueOf(i))) {
                doesContain.add(i);
            }
        }
        return doesContain;
    }



}
