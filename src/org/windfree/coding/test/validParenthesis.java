package org.windfree.coding.test;

import java.util.Stack;

public class validParenthesis {
    public  static void main(String[] args) {
        String input = "{()}";
        validParenthesis v = new validParenthesis();
        System.out.println(v.solve( input) );
        input = "()[]{}";
        System.out.println(v.solve( input) );
        input = "(]";
        System.out.println(v.solve( input) );
        input = "([)]";
        System.out.println(v.solve( input) );
    }

    private boolean solve(String input ) {
        if (input.length() % 2 != 0) return false;
        Stack<String> stack = new Stack<String>();
        char[] arr = input.toCharArray();
        String temp;
        for(char c : arr) {
            String str = Character.toString(c);
            switch(str) {
                case "{":
                case "(":
                case "[":
                    stack.push(str);
                    break;
                case "}":
                     temp = stack.peek();
                    if (temp.equals("{")) {
                        stack.pop();
                    }
                    break;
                case "]":
                     temp = stack.peek();
                    if (temp.equals("[")) {
                        stack.pop();
                    }
                    break;
                case ")":
                     temp = stack.peek();
                    if (temp.equals("(")) {
                        stack.pop();
                    }
                    break;
            }
        }
        if (stack.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
