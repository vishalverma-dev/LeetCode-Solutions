/*
 * Problem: Group Anagrams
 * LeetCode: 49
 * Difficulty: Medium
 * Topics: HashMap, String, Sorting
 *
 * Description:
 * Given an array of strings, group all anagrams together.
 * Two strings are anagrams if they contain the same characters
 * with the same frequencies, regardless of their order.
 *
 * Time Complexity: O(n * k log k)
 * Space Complexity: O(n * k)
 */


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> map = new HashMap<>();

        for(int i=0; i<strs.length; i++){

            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            String rev = new String(temp);

            if(!map.containsKey(rev)){
                map.put(rev, new ArrayList<>());
            }

            map.get(rev).add(strs[i]);

        }

        return new ArrayList<>(map.values());
        
    }
}