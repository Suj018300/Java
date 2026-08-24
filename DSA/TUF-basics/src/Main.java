//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static void modify(int b) {
        b = b + 10;
    }

    public static void main(String[] args) {
        int a = 5;
		int b = 84756;
		int c = 1234567;
		System.out.println(isValidPalindrome("A man, a plan, a canal: Panama"));
    }

	public static boolean isValidPalindrome(String s) {
		int i =0;
		int j = s.length() -1;
		s = s.toLowerCase();
		while (i < j) {
			char c = s.charAt(i);
			char d = s.charAt(j);
			if (!isAlphaNumeric(c)) {
				i++;
				continue;
			}
			if (!isAlphaNumeric(d)) {
				j--;
				continue;
			}
			if (c != d) {
				return false;
			}
			i++;
			j--;
		}

        return true;
    };

	public static boolean isAlphaNumeric(char c) {
		return Character.isLetter(c) || Character.isDigit(c);
	}

	public static boolean isArmstrong(int n) {
		int sum=0;
		int a=0;
		int num=n;
		String s= Integer.toString(num);
		int l= s.length();
		while(n>0){
			a=n%10;
			double pow=Math.pow(a,l);
			sum+=(int)pow;
			n=n/10;
		}
		if(num==sum){
			return true;
		}else{
			return false;
		}
	}

	public static int GCD(int n1, int n2) {
		while (n2 != 0) {
			int temp = n2;
			n2 = n1 % n2;
			n1 = temp;
		}
		return Math.abs(n1);
	}

	static void isPalindrome(int a) {

		int rev =0;
		while(a > rev) {
			int digit = a%10;
			rev = (rev*10)+digit;
			a /=10;
		};

        System.out.println(a == rev || a == rev/10);

	};

	static void reverse(int b) {

		int reverse = 0;
		while(b !=0) {
			int digit = b%10;
			if (reverse>Integer.MAX_VALUE/10 || reverse<Integer.MIN_VALUE/10) {
				return;
			};
			reverse = (reverse*10) + digit;
			b =b/10;
		}
		System.out.println(reverse);
	}

	static void counter(int n) {
	    int count = (int)(Math.log10(n)+1);
	    System.out.println(count);
    }

    static void pattern11(int n) {
	    for (int i=0; i<2*n-1; i++) {
		    for (int j=0; j<2*n-1; j++) {
			    int iValue = i <n ? i : 2*n-2-i;
			    int jValue = j <n ? j : 2*n-2-j;
			    int minValue = Math.min(iValue, jValue);
			    System.out.print(n-minValue);
			    if (j!=2*n-2) System.out.print(" ");
		    }
		    System.out.println();
	    }
    }
    
    static void pattern10(int n) {
	    int spaces= 2*n-2;
	    for (int i= 1; i<=2*n-1; i++) {

		    int star = i;
		    if (i > n) star=2*n-i;
		    
		    for (int j=1; j<=star; j++) {
			    System.out.print("*");
		    }
		    for (int k=1; k<=spaces; k++) {
			    System.out.print(" ");
		    }
		    for (int l=1; l<=star; l++) {
			    System.out.print("*");
		    }
		    System.out.println();
		    if (i<n) {
			    spaces-=2;
		    } else {
			    spaces+=2;
		    }

	    }
    }

    static void pattern9(int n) {
	    int space =0;
        for (int row = 0; row <=n; row++) {

		// Stars
	    for (int col= 1; col<=n-row; col++) {
		    System.out.print("*");
	    }
	    // Spaces
	    for (int s=1; s<=space; s++) {
		    System.out.print(" ");
	    }
	    // Stars2
	    for (int col2=1; col2<=n-row; col2++) {
		    System.out.print("*");
	    }
	    space+=2;
	    
            System.out.println();
        }

	int space2=n+3;
	for (int row2=1; row2<=n; row2++) {
	
		// Stars
	    for (int col= 1; col<=row2; col++) {
		    System.out.print("*");
	    }
	    // Spaces
	    for (int s=1; s<=space2; s++) {
		    System.out.print(" ");
	    }
	    // Stars2
	    for (int col2=1; col2<=row2; col2++) {
		    System.out.print("*");
	    }
	    space2-=2;
	    
            System.out.println();
	}
    }

    static void pattern8(int n) {
        for (int row = 1; row <=n; row++) {
		char chr = (char)('A' + n);
		chr = (char)(chr - row);

	    for (int col2= 1; col2<=row; col2++) {
		    System.out.print(chr);
		    chr++;
	    }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        for (int row = 0; row <n; row++) {
            for (int s = n-1; s > row; s--) {
                System.out.print(" ");
            }

            for (int col = 0; col <=row;  col++) {
		    char chr = (char) ('A'+col);
                System.out.print(chr);
            }

	    for (int col2= 1; col2<=row; col2++) {
		    char chr2 = (char) ('A'+row-col2);
		    System.out.print(chr2);
	    }
            System.out.println();
        }
    }

    static void pattern6(int n) {

        for (int row = 1; row <=n; row++) {
		char chr = 'A';

            for (int col =1; col <=row; col++) {
		    System.out.print((char)(chr + row -1));
	    }

            System.out.println();
        }
    }

    static void pattern5(int n) {
	    int counter = 1;

        for (int row = 1; row <=n; row++) {

            for (int col = 1; col <=row; col++) {
		    System.out.print(counter+ " ");
		    counter++;
	    }

            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <=n; row++) {

		int tempCol = 0;
            for (int col = 1; col <= row; col++) {
		    System.out.print(col);
		    tempCol=col;
	    }
	    for (int s = 2*row-n+1; s <= n; s++) {
		    System.out.print(" ");
	    }
	    for (int col2 = tempCol; col2 >= 1; col2--) {
		    System.out.print(col2);
	    }

            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 1; row <=n; row++) {	
		int totalColInRows = row > n ? 2*n-row : row;

            for (int col = 1; col <= totalColInRows;  col++) {
                if (col%2 ==1) {
			System.out.print(1);
		} else {
			System.out.print(0);
		};
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 1; row <=2*n; row++) {	
		int totalColInRows = row > n ? 2*n-row : row;
		int totalSpaces = n-totalColInRows;
            for (int s = 1; s <= totalSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalColInRows*2-1;  col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern1(int n) {
        for (int row = 1; row <=n; row++) {
            for (int s = 1; s <= n-row; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= (2*row-1);  col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

