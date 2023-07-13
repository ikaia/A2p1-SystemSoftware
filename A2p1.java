import java.util.Scanner;

public class A2p1 {
	
public static void MathFunctions(int n, int m) { //Method to print A2p1 Math
	
	if (n==1) {
		System.out.println(1);
		m=m+1;
		System.out.printf("Length of the list: %d", m);
		return;
	}
	else if (n%2==1){
		System.out.print(n + ",");
		MathFunctions((((3*n)+1)/2),m+1); //Odd Numbers
	}
	else{
		System.out.print(n + ",");
		MathFunctions((n/2),m+1); //Even Numbers
	}
}

public static void main(String[] args) {
	if(args.length!=1) {
		System.out.println("Need one command line argument for an integer.");
		System.exit(0);
	}
	int a=Integer.parseInt(args[0]); //accepts one command line argument a which is assumed to be positive integer at least 2
	if(a<2) {
		System.out.println("Must be positive integer of at least 2");
		System.exit(0);
	}
	System.out.printf("Iterated list for %d is:", a); //The length of the list should also be printed
	System.out.println();
	MathFunctions(a,0);
}
	
}