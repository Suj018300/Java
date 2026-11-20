import java.util.*;

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
//		System.out.println(isValidPalindrome("A man, a plan, a canal: Panama"));

//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("Enter number of Green balls: ");
//		int g = sc.nextInt();
//
//		System.out.print("Enter number of Yellow balls: ");
//		int y = sc.nextInt();
//
//		System.out.print("Enter number of Red balls: ");
//		int r = sc.nextInt();
//
//		BallArrangement.arrange(g, y, r, ' ');
//
//		System.out.println("Output: " + BallArrangement.count);
//
//		sc.close();
//		int[] arr = {22, 24, 55,22 ,12, 8};
//		System.out.println(fib(4));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers in the array:");
		int n = sc.nextInt();
		System.out.println("Enter the array list : ");
		int[] arr = new int[n];
		for (int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i =0; i<arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i ],0)+1);
		};
		for ( int i : map.keySet()) {
			System.out.println(i + "->" + map.get(i) + "times");
		};
//		System.out.println("Enter the total sum to two numbers in array: ");
//		int[] res=  firstSecond(arr);
//		int target = sc.nextInt();
//		System.out.println(missing(arr));

    }

	public static void freq(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i =0; i<arr.length; i++) {
			map.put(i, map.getOrDefault(i,0)+1);
		};
		for ( int i : map.keySet()) {
			System.out.println(i + "->" + map.get(i) + "times");
		};
	}



	public static int missing (int[] arr ) {

		int last = arr.length+1;
		int eSum = last * (last + 1)/2;
		int aSum = 0;
		for (int num:arr) {
			aSum+=num;
		}
		int res = eSum - aSum;
		return res;
	}


	public static int[] sum(int[] arr, int target) {

        Map<Integer, Integer> map = new HashMap<>();
		for (int i =0; i<= arr.length; i++) {
			int res1 = target - arr[i];
			if (map.containsKey(res1)) {
				return new int[] {map.get(res1), i};
			}
			map.put(arr[i], i);
		}

		return new int[] {};
	}



	public static boolean isDuplicate(int[] arr) {

		Set<Integer> hashSet = new HashSet<>();
		for ( int num: arr) {
			if (!hashSet.add(num)) {
				return true;
			}
		}

		return false;

	};



	public static int[] firstSecond(int[] arr) {

		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;

		for(int i =0; i<arr.length; i++) {
			if (arr[i]>largest) {
				smallest=largest;
				largest=arr[i];
			} else if (arr[i]>smallest && arr[i] != largest) {
				smallest=arr[i];
			}
		}

		return new int[]{largest, smallest};

	};






	public static int reverse(int n ) {

		int rev =0;
		while (n !=0) {
            int x = 0;
            int digit = x%10;
			if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE) {
				return 0;
			};
			rev = (rev*10) + digit;
			n = n/10;
		}

        return rev;
    };


	public static int fib(int n) {
		if (n <= 1) {
        return n;
    }
    return fib(n-1) + fib(n-2);
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

//	static void reverse(int b) {
//
//		int reverse = 0;
//		while(b !=0) {
//			int digit = b%10;
//			if (reverse>Integer.MAX_VALUE/10 || reverse<Integer.MIN_VALUE/10) {
//				return;
//			};
//			reverse = (reverse*10) + digit;
//			b =b/10;
//		}
//		System.out.println(reverse);
//	}

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

