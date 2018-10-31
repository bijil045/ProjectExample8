
public class MergeZigzag {
public static void main(String[] args) {
	Arrays a= new Arrays();
	int x[]=	a.readArr();
	int	y[]=a.readArr();
	int z[]=a.zigzag(x, y);
	System.out.println(" enter the merged array");
	a.displayArray(z);
}
}
