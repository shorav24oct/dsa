package com.gfg.Sorting;

public class Intersection {

	public static void main(String[] args) {
		int[] a = { 5, 10, 20, 20 };
		int[] b = { 2, 10, 20, 20 };
		intersect(a, b, a.length, b.length);
	}

	private static void intersect(int[] a, int[] b, int m, int n) {
		int i = 0, j = 0;

		while (i < m && j < n) {

			if (i > 0 && a[i] == a[i - 1]) {
				i++;
				continue;
			}

			if (a[i] < b[j])
				i++;
			else if (a[i] > b[j])
				j++;
			else {
				System.out.print(a[i] + " ");
				i++;
				j++;
			}
		}

	}

}
