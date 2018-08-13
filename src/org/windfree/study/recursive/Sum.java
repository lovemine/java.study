package org.windfree.study.recursive;

public class Sum {
    public static void main(String[] args) {
        System.out.println(("sum:" + add(10)));
    }

    public static int add(int n ) {
        if(n == 1) {
            return 1;
        }
        return n + add(n-1);
    }
}
