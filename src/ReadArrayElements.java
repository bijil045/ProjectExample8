
public class ReadArrayElements {
	public static void main(String[] args) {
	Arrays a= new Arrays();
	//System.out.println(" read array elements :");
	int [] n=a.readArr();
	//a.displayArray(n);
	int sm=a.smallestArray(n);
	System.out.println("smallest is :"+sm);
	}
}
