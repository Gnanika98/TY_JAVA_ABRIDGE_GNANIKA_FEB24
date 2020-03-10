package com.capgemini.assignment.day3;

public class LongArray {
	public static void main(String[] args) {
		long[] d = new long[3];
		d[0] = 3;
		d[1] = 6;
		d[2] = 8000;
		printArrayData(d);
		long[] a=getArrayData();
		printArrayData(a);
	}
		static void printArrayData(long[] d) {
		for (int i = 0; i < 3; i++)
			System.out.println(d[i]);
	}
		static long[] getArrayData() {
			long[] values= {2,5,73};
			return values;
		}
}

