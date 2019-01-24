import java.util.Scanner;
import java.lang.Math;

public class ArrayMedian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y, z;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of first array: ");
		x = s.nextInt();
		System.out.println("Enter the length of second array: ");
		y = s.nextInt();
		z = x + y;
		int[] a = new int[x];
		int[] b = new int[y];
		int[] c = new int[z];
		System.out.println("Enter the elements of first array: ");
		for (int i = 0; i < x; i++) {
			a[i] = s.nextInt();
		}
		System.out.println("Enter the elements of second array: ");
		for (int i = 0; i < y; i++) {
			b[i] = s.nextInt();
		}
		int i = 0, j = 0, k = 0;

		while (i < a.length && j < b.length)
			c[k++] = a[i] < b[j] ? a[i++] : b[j++];

		while (i < a.length)
			c[k++] = a[i++];

		while (j < b.length)
			c[k++] = b[j++];

		int len = c.length;
		int median;
		if (len % 2 != 0) {
			median = (int) ((c[(len / 2) - 1] + c[(len / 2)]) / 2);
		} else {
			median = c[len / 2];
		}
		/*System.out.println(median + "*");
		for (i = 0; i < len; i++)
			System.out.print(c[i] + " ");*/
		System.out.println("The element at index " + median + " is: " + c[median-1]);

	}
}
