package stack;

import java.io.*;
import java.util.*;

public class SimpleTextEditor {

    /*public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String outputString = "";
        Stack<String> stack = new Stack<>();
        stack.push(outputString);
        List<Character> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String append = null;
            int show = 0;
            int del = 0;
            String inp = br.readLine();
            String arr[] = inp.split(" ");
            int opt = Integer.parseInt(arr[0]);
            switch (opt) {
                case 1:
                    append = arr[1];
                    outputString += append;
                    stack.push(outputString);
                    break;
                case 2:
                    del = Integer.parseInt(arr[1]);
                    outputString = outputString.substring(0, outputString.length() - del);
                    stack.push(outputString);
                    break;
                case 3:
                    show = Integer.parseInt(arr[1]);
                    //result.add(outputString.charAt(show - 1));
                    System.out.println(outputString.charAt(show - 1));
                    break;
                case 4:
                    stack.pop();
                    outputString = stack.peek();
            }
        }
*//*        try {
            for(Character j:result)
                System.out.println(j);
        } catch (Exception e) {

        }*//*
    }*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<String> stack = new Stack();
        String opString ="";
        stack.push(opString);
        for(int i =0 ; i<n; i++)
        {
            String[] input = (br.readLine()).split(" ");
            int operation = Integer.parseInt(input[0]);

            switch(operation){
                case 1:
                    opString +=input[1];
                    stack.push(opString);
                    break;
                case 2:
                    int del =  Integer.parseInt(input[1]);
                    opString = stack.peek();
                    opString = opString.substring(0, opString.length()-del);
                    stack.push(opString);
                    break;
                case 3:
                    int c =  Integer.parseInt(input[1]);
                    opString = stack.peek();
                    System.out.println(opString.charAt(c-1));
                    break;
                case 4:
                    stack.pop();
                    opString = stack.peek();
            }
        }
    }
    /*Input :
            8
            1 abc
3 3
        2 3
        1 xy
3 2
        4
        4
        3 1*/
}
