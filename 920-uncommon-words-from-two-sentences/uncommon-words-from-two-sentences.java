
// class Solution {
//     public String[] uncommonFromSentences(String s1, String s2) {
//         String[] str1 = s1.split(" ");
//         String[] str2 = s2.split(" ");

//         ArrayList<String> ans = new ArrayList<>();

//         for (String word : str1) {
//             if (!s2.contains(word) && 
//                 Collections.frequency(Arrays.asList(str1), word) == 1) {
//                 ans.add(word);
//             }
//         }

//         for (String word : str2) {
//             if (!s1.contains(word) && 
//                 Collections.frequency(Arrays.asList(str2), word) == 1) {
//                 ans.add(word);
//             }
//         }

//         return ans.toArray(new String[0]);
//     }
// }


import java.util.*;

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] str1 = s1.split(" ");
        String[] str2 = s2.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : str1) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (String word : str2) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        ArrayList<String> ans = new ArrayList<>();

        for (String word : map.keySet()) {
            if (map.get(word) == 1) {
                ans.add(word);
            }
        }

        return ans.toArray(new String[0]);
    }
}