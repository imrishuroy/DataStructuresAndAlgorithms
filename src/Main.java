import java.util.*;

public class Main {
    public static void main(String[] args) {

            int[] nums = {4, 4, 5, 5, 6, 7};

        // Step 1: Count frequencies using a HashMap
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for (int num : nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        // Step 2: Find the most frequent and second most frequent elements
        int maxFreq = 0, secMaxFreq = 0;
        int maxEle = Integer.MAX_VALUE, secEle = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();

            // If current element has a higher frequency than the max frequency
            if (freq > maxFreq) {
                secMaxFreq = maxFreq;
                secEle = maxEle;

                maxFreq = freq;
                maxEle = num;
            }
            // If current element ties with the max frequency, choose the smaller element
            else if (freq == maxFreq) {
                maxEle = Math.min(maxEle, num);
            }
            // If current element has a frequency higher than second max
            else if (freq > secMaxFreq) {
                secMaxFreq = freq;
                secEle = num;
            }
            // If current element ties with second max frequency, choose the smaller element
            else if (freq == secMaxFreq) {
                secEle = Math.min(secEle, num);
            }
        }

        // Step 3: Return the result, or -1 if no second most frequent element exists
        System.out.print(secMaxFreq == 0 ? -1 : secEle);

//        char[] chars = {'a', 'b', 'c', 'a'};
//        int max = 0;
//
//        for(int i = 0; i < chars.length; i++){
//            if(chars[i] > max){
//                max = chars[i];
//            }
//        }
//
//        int[] arr = new int[max + 1];
//        System.out.println(max);
//        for(int i = 0; i < chars.length; i++){
//            arr[chars[i]]++;
//        }
//
//        int value = (int) 'a';
//
//        System.out.println(arr[value]);








//
//
//        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5, 5};
//
//        mostFrequentElement(arr);




//        reverse(arr, 5);
//
//        System.out.println(Arrays.toString(arr));
//
//        int a = 1;
//        int b = 2;
//        swap(a, b);
//        // print a and b
//        System.out.println(a);
//        System.out.println(b);







//        ArrayList<Integer> arr = new ArrayList<>();
//
//        arr.add(1);
//        arr.add(2);
//        arr.add(3);
//
//        Collections.sort(arr); // by default sort in accenting order
//
//        Collections.sort(arr, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                if(o1 > o2){
//                    // Keep the order
//                    return -1;
//                }
//                else if(o1 < o2){
//                    // change the order
//
//                    return 1;
//                }
//                // do nothing
//                return 0;
//            }
//        });
//
//        // OR
//
//        // we need a positive number to reverse the order
//        Collections.sort(arr, (num1, num2) -> num2 - num1); // lambda func
//        System.out.println(arr);

    }

    public static void  reverse(int[] arr, int n) {

        for (int i = 0; i < n/2; i++){
            swap(arr[i], arr[n - 1 -i]);
        }
    }
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    public  static int mostFrequentElement(int[] nums) {
        int fh = 0;


        HashMap<Integer, Integer> frequency = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(frequency.get(nums[i]) != null){
                frequency.put(nums[i], frequency.get(nums[i]) + 1);
                if(frequency.get(nums[i]) > fh){
                    fh = nums[i];
                }
            }else{
                frequency.put(nums[i], 1);
            }
        }

        System.out.println(fh);

        int ans = nums[0];
        int maxFrequency = 0;

        // Print keys and values
        for (int i : frequency.keySet()) {
            System.out.println("key: " + i + " value: " + frequency.get(i));

            if(frequency.get(i) > maxFrequency){
                maxFrequency = frequency.get(i);
            }




        }


        return 0;


    }


}









































