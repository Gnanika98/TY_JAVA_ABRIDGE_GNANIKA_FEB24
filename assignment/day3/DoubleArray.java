package com.capgemini.assignment.day3;

public class DoubleArray {
	public static void main(String[] args) {
		double[] d = new double[3];
		d[0] = 3.4;
		d[1] = 6.1;
		d[2] = 8.1;
		printArrayData(d);
		double[] a=getArrayData();
		printArrayData(a);
	}
		static void printArrayData(double[] d) {
		for (int i = 0; i < 3; i++)
			System.out.println(d[i]);
	}
		static double[] getArrayData() {
			double[] values= {2.3,5.6,7.3};
			return values;
		}
}
