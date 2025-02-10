package Recursion.SubSquence;

import java.util.ArrayList;

public class SubSequence {

    public static void main(String[] args) {
        String str = "abc";
//        printSubSeq(str, "");
        ArrayList<String> ans = subSeq(str, "");
        System.out.println(ans);
    }

    static ArrayList<String> subSeq(String str, String subString){
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(subString);
            return list;
        }

        char ch = str.charAt(0);
        ArrayList<String> left =  subSeq(str.substring(1), subString + ch);
        ArrayList<String> right =  subSeq(str.substring(1), subString);
        left.addAll(right);
        return left;
    }

    static ArrayList<String> subSeqASCII(String str, String subString){
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(subString);
            return list;
        }

        char ch = str.charAt(0);
        ArrayList<String> first =  subSeqASCII(str.substring(1), subString + ch);
        ArrayList<String> second =  subSeqASCII(str.substring(1), subString);
        ArrayList<String> third = subSeqASCII(str.substring(1), subString + (ch + 0));
        first.addAll(second);
        first.addAll(third);
        return first;
    }

    static void printSubSeq(String str, String subString){
        if(str.isEmpty()){
            System.out.println(subString);
            return;
        }

        char ch = str.charAt(0);
        // here we are either taking it or not taking it
        printSubSeq(str.substring(1), subString);
        // subString + ch will create a new string
        printSubSeq(str.substring(1), subString + ch);
    }


}
