package com.chandler.offer;

/**
 * ����Ϊn ����������������ֶ���0��n-1�ķ�Χ�ڣ���������Щ�������ظ��ģ�����֪���м��������ظ��ˣ�
 * Ҳ��֪��ÿ�������ظ��˼��Ρ��ҳ�����������һ���ظ������֡� ��2��3��1��0��2��5��3�� ����2����3
 * 
 * */
public class offer51 {
	
	/*
	 * �ռ临�Ӷ�Ϊ1
	 */
	public static int solution1(int[] array, int n) {
		
		if (array == null || n <= 0)
			return -1;

		for (int i = 0; i < n; i++) {
			if (array[i] > n - 1)
				return -1;
		}
		
		int duplication = -1;

		for (int i = 0; i < n; ++i) {

			while (i != array[i]) {
				if (array[i] == array[array[i]]) {
					duplication = array[i];
					return duplication;
				}
				int temp = array[i];
				array[i] = array[temp];
				array[temp] = temp;
			}

		}
		return -1;
	}

	public static void main(String[] args) {
		int[] array = {2,3,1,0,2,5,3};
		int duplication = solution1(array,7);
		System.out.println(duplication);
	}
}
