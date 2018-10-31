
public class ArrayBIggest {
public static void main(String[] args) {
	Arrays a= new Arrays();
	//System.out.println(" read array elements :");
	int [] n=a.readArr();
	a.displayArray(n);
int x=	a.biggestArray(n);
System.out.println(" biggest integer is :"+x);
//	int[] c=a.countEO(n);
//	System.out.println("count "+a.countEO(n));

}
}
