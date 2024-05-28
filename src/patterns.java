public class patterns {
	public static void fn(int n) {
	    for (int i = 0; i < 2 * n; i++) {
	        if (i < n) {
	            for (int j = 0; j <= i; j++) {
	                System.out.print("* ");
	            }
	        } else {
	            for (int k = n - 1; k > i - n; k--) {
	                System.out.print("* ");
	            }
	        }
	        System.out.println(); // Move to the next line after printing each row of asterisks
	    }
	}
	public static void fn2(int n) {
		for(int i=0;i<n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=n;k>=n-i;k--) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}
	public static void fn3(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print("  ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print(j+" ");
			}
			for(int k=2;k<=i;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
	public static void fn5(int n) {
		
	}
    public static void main(String[] args) {
        fn3(5);
    }
}
