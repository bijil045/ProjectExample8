import java.util.*;
public class ArrayReadNames {
	static boolean search(String[] ar,String s){
		for(int i=0;i<ar.length;i++){
			if(ar[i].equals(s)){
			return true	;
			}
			
		}
		return false;
	}
public static void main(String[] args) {
	ArrayReadNames an= new ArrayReadNames();
	Scanner sc= new Scanner(System.in);
	System.out.println("enter no of values");
	int n= sc.nextInt();
	String ar[]=new String[n];
	System.out.println("enter "+n+" stringvalues ");
	for(int i=0;i<n;i++){
		ar[i]=sc.next();
		
	}
	System.out.println(" Array values: ");
	for(int i=0;i<ar.length;i++){
		System.out.println(i+" -"+ar[i]);
	}
	boolean rs=search(ar,"bijil");
	if(rs){
		System.out.println("bijil is there");
		
	}
	else{
		System.out.println("bijil is not der");
	}
	
}
}
