import java.util.Scanner;

public class ArraySum {
	
public static void main(String[] args) {
	ArraySum an= new ArraySum();
	
	Scanner sc= new Scanner(System.in);
	System.out.println("enter no of values");
	int n= sc.nextInt();
	int ar[]=new int[n] ;
	int sum=0;
	System.out.println("enter "+n+" values ");
	for(int i=0;i<n;i++){
		ar[i]=sc.nextInt();
		sum=sum+ar[i];
	}
	
	System.out.println(sum);
	
	sc.close();
	
}
}
