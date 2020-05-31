package org.windfree.lang.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2 {
	public static void main(String[] args) {
		List<Integer> lstSysA = new ArrayList<Integer>();
		lstSysA.add(2);
		lstSysA.add(2);
		lstSysA.add(4);
		
		List<Integer> lstSysB = new ArrayList<Integer>();
		lstSysB.add(2);
		lstSysB.add(3);
		lstSysB.add(4);
		
		double sumA = 0; 
		for(Integer i : lstSysA) {
			sumA += 8 / i;
		}
		
		double sumB = 0; 
		for(Integer i : lstSysB) {
			sumB += 8 / i;
		}
		
		
		System.out.println("A: " + sumA);
		System.out.println("B: " + sumB);
		
		double targetB = sumA + sumA * 0.3;
		System.out.println("target:" + targetB);
		
		
		double addSum = targetB - sumA;
		
		int add = (int) (8 / addSum);
		System.out.println("add :" + add);
	}
	
	
	
}
