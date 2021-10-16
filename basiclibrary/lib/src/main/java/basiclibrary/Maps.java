package basiclibrary;

import java.util.*;

public class Maps {


    public static void main(String[] args) {

        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };


        checkForData(weeklyMonthTemperatures);

        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");


        String [] str = new String[votes.size()];
        for (int j = 0; j < votes.size(); j++) {
            str[j] = votes.get(j);
        }
        String winner = tally(str);
        System.out.println(winner + " received the most votes!");

    }



    public static ArrayList<Integer> checkForData(int[][] data) {


        ArrayList<Integer> missing = new ArrayList<>();
        Set<Integer> hashSet = new HashSet<>();


        for (int[] datum : data) {
            for (int i : datum) {
                hashSet.add(i);
            }
        }

        int max = Collections.max(hashSet);

        int min = Collections.min(hashSet);

        System.out.println("High: " + max);

        System.out.println("Low: " + min);

        for (int i = min; i < max; i++) {
            if (!hashSet.contains(i)) {
                missing.add(i);
                System.out.println("Never saw temperature: " + i);
            }
        }



        return missing;
    }







    static String tally(String[] array) {

        Map<String,Integer> hashmap = new HashMap<>();
        for (String str : array)
        {
            if (hashmap.containsKey(str))
                hashmap.put(str, hashmap.get(str) + 1);
            else
                hashmap.put(str, 1);
        }

        String maxStr = "";
        int maxVal = 0;
        for (Map.Entry<String,Integer> entry : hashmap.entrySet())
        {
            String key = entry.getKey();
            Integer count = entry.getValue();
            if (count > maxVal)
            {
                maxVal = count;
                maxStr = key;
            }

            else if (count == maxVal){
                if (key.length() < maxStr.length())
                    maxStr = key;
            }
        }

        return maxStr;
    }


}