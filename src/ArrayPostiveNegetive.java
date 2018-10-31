import java.util.Scanner;

public class ArrayPostiveNegetive {
public static void main(String[] args) {
	ArrayPostiveNegetive an= new ArrayPostiveNegetive();
	
	Scanner s= new Scanner(System.in);
	System.out.println("enter no of values");
	int n= s.nextInt();
	int arr[]=new int[n] ;
	int poscount=0;
	int negcount=0;
	
	System.out.println("enter "+n+" values ");
	for(int i=0;i<n;i++){
		arr[i]=s.nextInt();
		
if((arr[i]&1)>0){
			
	poscount++;
			}

			else{
				negcount++;
		
	}
	
	
	
	
	
}
	System.out.println("pos count is:"+poscount);
	System.out.println("neg count is:"+negcount);
	s.close();
}
}

