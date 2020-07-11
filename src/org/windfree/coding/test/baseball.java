package org.windfree.coding.test;

import java.util.Stack;

public class baseball {
    public static void main(String[] args) {
        String[] input= { "5","-2","4","C","D","9","+","+"};
        baseball b = new baseball();
        b.solve(input);
    }

    private void solve(String[] input) {
        Stack<Integer> numStack = new Stack<Integer>();
        for(int i = 0; i < input.length; i++) {
            if(isNumber(input[i])) {
                numStack.push(Integer.parseInt(input[i]));
            } else {
                switch(input[i]) {
                    case "C":
                        numStack.pop();
                        break;
                    case "D":
                        numStack.push(numStack.peek() * 2);
                        break;
                    case "+":
                        int temp = numStack.pop();
                        int peekNum = numStack.peek();
                        int sum = temp + peekNum;
                        numStack.push(temp);
                        numStack.push(sum);
                        break;
                    default:
                        break;
                }
            }
        }
        int result = 0;
        while(!numStack.isEmpty()) {
            System.out.println(numStack.peek());
            result += numStack.pop();
        }
        System.out.println("sum : " + result);
    }

    private boolean isNumber(String s) {
        try {
            Integer.parseInt(s);
            return true;
        }catch(NumberFormatException e) {
            return false;
        }
    }
}
