/*
 * Problem: Subdomain Visit Count
 * LeetCode: 811
 * Difficulty: Medium
 * Topics: Array, Hash Table, String
 *
 * Description:
 * Given an array of count-paired domains, calculate the total visit count
 * for each subdomain and return the results as a list of strings.
 *
 * Approach:
 * Use a HashMap to store the visit count of each domain and its subdomains.
 * For every domain, extract the visit count and repeatedly remove the
 * leftmost subdomain using indexOf('.') and substring().
 * Update the frequency of each resulting subdomain in the HashMap.
 * Finally, construct the result list using the stored domain counts.
 *
 * Time Complexity: O(n * m)
 * Space Complexity: O(n * m)
 */


class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {

        HashMap<String, Integer> map = new HashMap<>();
        for(String cpdomain: cpdomains){
            String[] parts = cpdomain.split(" ");
            int c = Integer.parseInt(parts[0]);
            String domain = parts[1];
            while(true){
                map.put(domain, map.getOrDefault(domain,0)+c);

                int index = domain.indexOf('.');
                if(index==-1){
                    break;
                }

                domain = domain.substring(index+1);
            }
        }

        List<String> res = new ArrayList<>();

        for(String domain: map.keySet()){
            res.add(map.get(domain)+" "+domain);
        }

        return res;
        
    }
}