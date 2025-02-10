import java.util.*;

public class ArraysPractices {

    public static void main(String[] args) {

        int[] characters = new int[256];
        String name = "Iamreapting";

        for(int i = 0; i < name.length(); i++){
            if(characters[name.charAt(i)] == 1){
                System.out.println("repeating character " + name.charAt(i));
                break;
            }else{
                characters[name.charAt(i)]++;
            }
        }



















//        int[] nums = {10, 5, 2, 7, 1, 9};
//        int k = 15;
//
//        int n = nums.length;
//        Map<Integer, Integer> preSumMap = new HashMap<>();
//        int sum = 0;
//        int maxLen = 0;
//        for(int i = 0; i < n; i++){
//            sum += nums[i];
//
//            if(sum == k){
//                maxLen = Math.max(maxLen, i+1);
//            }
//
//            int rem = sum - k;
//
//            if(preSumMap.containsKey(rem)){
//                int len = i - preSumMap.get(rem);
//                maxLen = Math.max(maxLen, len);
//            }
//
//            if(!preSumMap.containsKey(sum)){
//                preSumMap.put(sum, i);
//            }
//        }

//        System.out.println("max len " + maxLen);

//        int[] nums = {100, 4, 200, 1, 3, 2};
//        int n = nums.length;
//        int ans = 0;
//        int count = 1;
//
//        Arrays.sort(nums);
//        int left = 0;
//        int right = 1;
//        while(right < n){
//            int first = nums[left];
//            int second = nums[right];
//            if(first + 1 == second){
//                System.out.println("count " + count);
//                count++;
//                ans = Math.max(ans, count);
//            }else{
//                ans = Math.max(ans, count);
//                count = 0;
//            }
//            left++;
//            right++;
//        }



//        return new int[]{repeating, missing};





//        int[] nums = {1, 2, 3, 6, 7, 5, 7};
//
//        int n = nums.length;
//        HashMap<Integer, Integer> map = new HashMap<>();
//        Arrays.sort(nums);
//        int[] ans = new int[2];
//
//        for(int i = 0; i < n; i++){
//            System.out.println(i+1);
//            if(i+1 != nums[i] && ans[1] == 0){
//                // missing number
//                ans[1] = i+1;
//            }
//
//            if(map.containsKey(nums[i])){
//                ans[0] = nums[i];
//            }else{
//                map.put(nums[i], 1);
//            }
//        }
//
//        System.out.println(Arrays.toString(ans));

        




//       int[] nums = {7, 0, 0, 1, 7, 7, 2, 7, 7};
//       int n = nums.length;
//       HashMap<Integer, Integer> map = new HashMap<>();
//
//
//
//
//       for(int i = 0; i < n; i++){
//           map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
//       }
//
//       int max = Integer.MIN_VALUE;
//       int ans = nums[0];
//
//       for(int key: map.keySet()){
//           if(map.get(key) > n/2){
////               max = Math.max(max, map.get(key));
//               if(max < map.get(key)){
//                   max = map.get(key);
//                   ans = key;
//               }
//           }
//
//       }
//
//
//       System.out.println(map);
//       System.out.println(max);
//       System.out.println(ans);



//        int[] nums = {1, -2, 3, 5, 7, 9};
//        int target = 7;
//        int n = nums.length;
//
//        Set<List<Integer>> set = new HashSet<>();
//        // List<List<Integer>> ans = new ArrayList<>();
//        for(int i = 0; i < n; i++){
//            for(int j = i + 1; j < n; j++){
//                Set<Long> hashset = new HashSet<>();
//                for(int k = j + 1; k < n; k++){
//                    long sum = (long) nums[i] + nums[j] + nums[k];
//                    long fourth = target - sum;
//
//                    if(hashset.contains(fourth)){
//                        // List<Integer> temp = new ArrayList<>();
//                        // temp.add(nums[i]);
//                        // temp.add(nums[j]);
//                        // temp.add(nums[k]);
//                        // temp.add((int) fourth);
//                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], (int) fourth);
//
//                        Collections.sort(temp);
//                        set.add(temp);
//                    }else{
//                        hashset.add((long) nums[k]);
//                    }
//                }
//            }
//        }

//        List<List<Integer>> ans = new ArrayList<>();
//        ans.addAll(set);
//        // List<List<Integer>> ans = new ArrayList<>(set);
//        System.out.println(ans);

        // tree sum
//        int[] nums = {2, -2, 0, 3, -3, 5};
//
//        int n = nums.length;
//
//        // set to store unique triplets
//        Set<List<Integer>> tripletSet = new HashSet<>();
//
//        // check all possible triplets
//        for(int i = 0; i < n; i++){
//
//            // set to store elements seen so far in the loop
//            Set<Integer> hashset = new HashSet<>();
//
//            for(int j = i + 1; j < n; j++){
//
//                // Set to store elements seen so far in the loop
//                int third = - (nums[i] + nums[j]);
//                // find id third elements exists in hashset
//                if(hashset.contains(third)){
//                    // Found a triplet that sums up to target
//                    List<Integer> temp = new ArrayList<>();
//                    temp.add(nums[i]);
//                    temp.add(nums[j]);
//                    temp.add(third);
//
//                    Collections.sort(temp);
//                    tripletSet.add(temp);
//                }
//                hashset.add(nums[j]);
//            }
//
//        }
//
//        List<List<Integer>> ans = new ArrayList<>(tripletSet);
//        System.out.println(ans);





        // 2 sum
//        int[] nums = {1, 6, 2, 10, 3};
//        int target = 7;
//
//
//        int n = nums.length;
//        int[] ans = new int[2];
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        for(int i = 0; i < n; i++){
//            int temp = target - nums[i];
//            if(map.containsKey(temp)){
//                ans[0] = i;
//                ans[1] = map.get(temp);
//                System.out.println(ans);
//            }else {
//                map.put(nums[i], i);
//            }
//        }
//
//        System.out.println(ans);





//        int[] nums1 = {1, 2, 3, 4, 5};
//        int[] nums2 = {1, 2, 7};
//
//        List<Integer> ansList = new ArrayList<>();
//        int[] visited = new int[nums2.length];
//
//        for(int i = 0; i < nums1.length; i++){
//            for(int j = 0; j < nums2.length; j++){
//                if(nums1[i] == nums2[j] && visited[j] == 0){
//                    ansList.add(nums1[i]);
//                    visited[j] = 1;
//                    break;
//                }else if(nums2[j] > nums1[i]){
//                    break;
//                }
//            }
//        }
//
//        System.out.println(Arrays.toString(visited));
//
//        int[] ans = new int[ansList.size()];
//        for(int i = 0; i < ansList.size(); i++){
//            ans[i] = ansList.get(i);
//        }
//
//        System.out.println(Arrays.toString(ans));




//        int[] nums1 = {1, 2, 3, 4, 5};
//        int[] nums2 = {1, 2, 7};
//
//        ArrayList<Integer> temp = new ArrayList<Integer>();
//        HashMap<Integer, Integer> frequency = new HashMap<>();
//        for (int num : nums1) {
//            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
//        }
//        for (int num : nums2) {
//            if(frequency.containsKey(num)) {
//                temp.add(num);
//
//            }
//        }
//        // convert set to array
//        int[] result = new int[temp.size()];
//        int i = 0;
//        for (int num : temp) {
//            result[i++] = num;
//        }
//        System.out.println(Arrays.toString(result));



        // set
//        Set<Integer> set = new TreeSet<>();
//        for (int num : nums1) {
//            set.add(num);
//        }
//        for(int num: nums2){
//            set.add(num);
//        }
//
//        // convert set to array
//        int[] result = new int[set.size()];
//        int i = 0;
//        for (int num : set) {
//            result[i++] = num;
//        }
















//        int[] nums = {1,1,0,1,1,1,1,1,1,1};
//
//        ArrayList<Integer> temp = new ArrayList<Integer>();
//        int count = 0;
//
//        for(int i = 0; i < nums.length; i++){
//            if(nums[i] == 1){
//                count = count +1;
//            }else{
//                if(count > 0){
//                    temp.add(count);
//                    count = 0;
//                }
//
//            }
//        }
//        if(count > 0){
//            temp.add(count);
//        }
//        if(!temp.isEmpty()){
//            Collections.sort(temp);
//            System.out.println(temp.get(temp.size() -1));
//        }
//
//        System.out.println(temp);
    }
}
