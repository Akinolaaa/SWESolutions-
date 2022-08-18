package com.SWE_Solutions;

public class BBWISE {

    public String sumOfSeries(int n) {
		if(n<=1) {
			return "1.00";
		}
		int deno=1;
		double sum =0;
		for(int i=0;i<n;i++) {
			sum += (float) 1/deno;
			deno += 3;
		}
		String output = String.format("%.2f", sum);
		return output;
	}
	public static void main(String[] args) {
		Printer p = new Printer();
		
		System.out.println(p.sumOfSeries(1));
		System.out.println(p.sumOfSeries(2));
		System.out.println(p.sumOfSeries(5));
	}
}
