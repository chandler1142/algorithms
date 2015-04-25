package com.chandler.offer;

/**
 *	����һ������A[0,1,2,3,...,n-1]���빹��һ������B[0,1,2,...,n-1]������B�е�Ԫ��B[i] = A[0]*...*A[i-1]*A[i+1]*...*A[n-1]
 *	Ҫ����ʹ�ó��� 
 *
 */
public class offer52 {
	
	public static void solution(double[] a,double[] b) {
		
		if(a.length == b.length && b.length > 1) {
			
			b[0] = 1;
			for(int i=1;i<a.length;i++) {
				b[i] = b[i-1] * a[i-1];
			}
			
			double temp = 1;
			for(int j=a.length-2;j>=0;j--) {
				temp *= a[j+1];
				b[j] *= temp;
			}
		}
		
	}
	
	public static void main(String[] args) {
		double[] a = {2,1,3,4,5};
		double[] b = new double[5];
		solution(a,b);
		for(double c:b) System.out.print(c+ "  ");
	}
	
}
