public class Caveats {
    // a collection of hacks and caveats
    public static void main(String[] args) {
        // get numeric value


    }

    /*

    1. convert int to char
        int n = 25;
        char ch = (char) (n + '0');

    2. Arrays as list, used when we have to combine multiples lists, only for list not Array
         Arrays.asList(list1, list2, list2)
         // its return type is List<T>

     3. Take absolute value of int
         Math.abs(n)

     4. If we want to create an ArrayList with the initial size
        ArrayList<ArrayList<Integer>> adj2 = new ArrayList<>(n + 1);

     5. Fill arrays with the default value
        int[] nums = new int[5];
        Arrays.fill(nums, -1);

     6. Arrays copy of range
        int[] nums = {1, 2, 3, 4, 5, 6};
        int[] arr1 = Arrays.copyOfRange(nums, 0, n - 1);


     7. Sort array based on comparator,
     int[] arr = {4, 5, 2, 9, 0};
     Arrays.sort(arr, (a, b) -> b - a); descending
     Arrays.sort(arr, (a, b) -> a - b); ascending

     Arrays.sort(arr, (a, b) -> b - a);
     Arrays.sort(arr, (a, b) -> a - b);

     and if the 2-d array
     int[][] nums = {
        { 1, 4, 8 },
        {3, 5, 9 }
     };

     Arrays.sort(nums, (a, b) -> b[2] - a[2]); descending
     Arrays.sort(nums, (a, b) -> a[2] - b[2]);

     8. Comparator
        https://www.geeksforgeeks.org/comparator-interface-java/
        https://www.w3schools.com/java/java_advanced_sorting.asp

        class Meeting {
        int start;
        int end;

        public Meeting(int start, int end){
            this.start = start;
            this.end = end;
        }

        int n = start.length;

        Meeting[] meetings = new Meeting[n];

        // Create Meeting objects and store start and end times
        for(int i = 0; i < n; i++){
            Meeting meeting = new Meeting(start[i], end[i]);
            meetings[i] = meeting;
        }

        // Sort meetings by end time
        Arrays.sort(meetings, Comparator.comparingInt(m -> m.end));
        Arrays.sort(meetings, Comparator.comparingInt(m -> m.end));
        // id descending
        Arrays.sort(meetings, Comparator.comparingInt(m -> m.end).reversed());

      9. reverse the array
         ArrayList<Integer> ans = new ArrayList<>();
         Collections.reverse(ans);

      10. sort List
          List<Integer> list = new ArrayList<>();
          Collections.sort(list);

       11. create List from set
           Set<Integer> set = new HashSet<>();
           List<Integer> list = new ArrayList<>(set);

       12. Converting int to long
            int a = 30;
            long b = (long) a;

        13. clone the array
            int[] arr1 = {2, 3, 4, 5, 6};
            int[] arr2 = arr1.clone();

         14. Convert string into char array
             String a = "abc";
             char[] chars = s.toCharArray();

         15. covert char to integer
         int temp = Character.getNumericValue(s.charAt(k));

         16. string substring
         s.substring(i, j+1);

         17. check if two arrays are equal
             int[] arr1 = {1, 2, 3, 4, 5}
             int[] arr2 = {1, 2, 3, 4, 5}
             bool isEqual = Arrays.equals(arr1, arr2);

         18. Convert number to char
            int count = 10;
            char ch = (char) ('0' + count);

         19. how to iterate in stack
            Stack<ListNode> st = new Stack<>();
            while (!st.isEmpty()) {
             temp.next = st.pop();
             temp = temp.next;
         }

         20. HashSet<ListNode> nodes_set = new HashSet<>(); // check what is it

         21. remove item from set,
             Set<Integer> set = new HashSet<>()
             set.remove(1) -> here 1 is the number in the set, not the index

          22. check Arrays.asList
          List<List<Integer>> ans = new ArrayList<>();
          ans.add(Arrays.asList(arr[i - 1], arr[i]));

          23. Stack - https://www.programiz.com/java-programming/stack

          24. Set<String> operators = new HashSet<>(Arrays.asList("+", "-", "*", "/"));

          25. convert string to int
              String str = "2";
              Integer.parseInt(str);

          26. sum of n natual numbers
               int sum = n * ( n + 1 ) / 2;

          27. clone the array
              int[] arr1 = {1, 2, 3, 4};
              int[] arr2 = arr1.clone();

          28. convert int to string
              String str = Integer.toString(2);

          29. Get first character in a string
               let say
               char ch = 'a';
               String str = "applea";
               int first = str.indexOf(ch); -> 0
               int last = str.lasIndexOf(ch): -> 4

           30. add number to string or convert to sting
           "" + 2

           35. StringBuilder str = new StringBuilder();
               str.deleteCharAt(i) -- delete char at index

           36. Sort the intervals by start time
               Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

           37. Sorting in descending order
                int[][] jobs
                Arrays.sort(jobs, (a, b) -> b[2] - a[2]);

           38. Arrays.fill(array, -1 ) // it will fill it with -1

           39. Arrays.sort() , can't be used with ArrayList
           Collections.sort(meetings, Comparator.comparingInt(m -> m.end));
           or
           meetings.sort(Comparator.comparingInt(m -> m.end));

           40. // Convert the result list to a 2D array and return
            return res.toArray(int[][]::new);

            41. sort Arraylist
                Collections.sort()

           42. Check character of string is alpha numeric
                Character.isLetterOrDigit('char);
                // is will give false for white space and special characters, eg - @, #, $, %, ^, &, *, (, ), _, +, =, {, }, [, ], |, \, :, ;, ", ', <, >, ,, ., ?, /

            43. Convert character to lowercase
                Character.toLowerCase('C');









}



     */
  
}
