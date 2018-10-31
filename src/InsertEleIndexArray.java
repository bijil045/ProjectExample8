import java.util.*;
public class InsertEleIndexArray {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	Arrays a= new Arrays();
	int x[]=a.readArr();
	System.out.println("enter the array");
	a.displayArray(x);
	System.out.println("element and index");
	int ele= s.nextInt();
	int i= s.nextInt();
	x=a.insertArr(ar, ele, in);
	System.out.println("after insert: ");
	a.displayArray(x);
}
}
