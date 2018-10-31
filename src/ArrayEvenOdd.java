import java.util.Scanner;

public class ArrayEvenOdd {
	
public static void main(String[] args) {
	ArrayEvenOdd an= new ArrayEvenOdd();
	
	Scanner sc= new Scanner(System.in);
	System.out.println("enter no of values");
	int n= sc.nextInt();
	int ar[]=new int[n] ;
	int oddcount=0;
	int evencount=0;
	
	System.out.println("enter "+n+" values ");
	for(int i=0;i<n;i++){
		ar[i]=sc.nextInt();
		
if((ar[i]&1)==1){
			
	oddcount++;
			}

			else{
				evencount++;
		
	}
	
	
	
	
	
}
	System.out.println("odd count is:"+oddcount);
	System.out.println("even count is:"+evencount);
	sc.close();
}
}