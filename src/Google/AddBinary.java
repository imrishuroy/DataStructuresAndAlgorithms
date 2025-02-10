package Google;

public class AddBinary {

    public static void main(String[] args) {

        String a = "10110";
        String b = "10101";
        String result = addBinary(a, b);
        System.out.println("Result " + result);

    }

    public static String addBinary(String a, String b){
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;

        int carry = 0;

        while (i >= 0 || j >= 0 || carry == 1){
            int sum = carry;
            if(i >= 0){
//                int value = a.charAt(i--) - '0';
//                System.out.println(value);
////                sum += a.charAt(i--) - '0';
//                sum += value;
                sum += a.charAt(i--) % 2;
            }
            if(j >= 0){
                sum += b.charAt(j--) - '0';
            }
            result.insert(0, sum % 2);
            carry = sum / 2;
        }
        return result.toString();
    }
}
