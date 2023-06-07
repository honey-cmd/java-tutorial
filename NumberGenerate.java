/**
 * 
 */
package day1;

/**
 * @author ASUS
 *
 */
public class NumberGenerate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int i, j, k, n = 7;

		for (i = 1; i <= n; i++) {
			for (j = 1; j < i; j++) {
				System.out.print(' ');
			}

			for (k = i; k <= n; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
		for (i = n - 1; i >= 1; i--) {
			for (j = 1; j < i; j++) {
				System.out.print(' ');
			}
			for (k = i; k <= n; k++) {
				System.out.print(k + " ");
			}

			System.out.println();
		}

	}

}
