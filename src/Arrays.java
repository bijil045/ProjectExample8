import java.util.*;
public class Arrays {
public int[] readArr(){
	Scanner sc= new Scanner(System.in);
	System.out.println("enter no of values");
	int n= sc.nextInt();
	int ar[]=new int[n] ;
	System.out.println("enter "+n+" values ");
	for(int i=0;i<n;i++){
		ar[i]=sc.nextInt();
		}
	return ar;
}
public void displayArray(int[] ar){
	System.out.println(" Array values: ");
	for(int i=0;i<ar.length;i++){
		//System.out.println(i+" -"+ar[i]);
		System.out.println(ar[i]);
		if(i<ar.length-1){
			System.out.println(" ,");
		}
	}
	System.out.println();
}
 int biggestArray(int[] ar){
	 int big=ar[0];
	for(int i=0;i<ar.length;i++){
		if(big<ar[i]){
			big=ar[i];
		}
		}
	return big;
}
 int[] countEO(int ar[]){
	 int count[]=new int[2];
	 for(int i=0;i<ar.length;i++){
		 count[ar[i]%2]++;
	 }
	 return count;
 }
 void perEO(int ar[])
 {
	int c[]= countEO(ar);
	System.out.println("percentage of even:"+((double)c[0]/ar.length)*100);
	System.out.println("percentage of odd:"+((double)c[1]/ar.length)*100);
 }
 int smallestArray(int[] ar){
			 int small=ar[0];
			for(int i=0;i<ar.length;i++){
				if(ar[i]<small){
				small=ar[i];
			}
			}
		return small;
	}
 int[] merge(int x[],int y[]){
	 int z[]=new int[x.length+y.length];
	 for(int i=0;i<x.length;i++){
		 z[i]=x[i];
	 }
	 for(int i=0;i<y.length;i++){
		 z[x.length+i]=x[i];
	 }
	 return z;
 }
 int []zigzag(int x[],int y[]){
	 int z[]=new int[x.length+y.length];
	 int i=0,k=0;
	 while(i<x.length&&i<y.length){
		 z[k]=x[i];
		 k++;
		 z[k]=y[i];
		 k++;
		 i++;
	 }
	 while(i<x.length){
		 z[k++]=x[i++];
		 }
	 while(i<y.length){
		 z[k++]=y[i++];
			 } 
	 return z;
 }
 int []mergesort(int x[],int y[]){
	 int z[]=new int[x.length+y.length];
	 int i=0,k=0,j=0;
	 while(i<x.length&&j<y.length){
		 if(x[i]<y[j]){
		 z[k++]=x[i++];}
		 else{
			 z[k++]=y[j++];
		 }
		 }
	 while(i<x.length){
		 z[k++]=x[i++];
		 }
	 while(j<y.length){
		 z[k++]=y[j++];
			 } 
	 return z;
 }
public int [] insertArr(int [] ar,int ele,int in) {
	if(in<0||in<=ar.length){
		System.out.println("index not in the range");
		return ar;
	}
	int na[]= new int[ar.length+1];
	na[in]=ele;
	for(int i=0;i<ar.length;i++){
		if(i<in){
			na[i]=ar[i];
		}
		else{
			na[i]=ar[i+1];
		}
		
	}
	return na;
}
int []delarr(int ar[],int in){
	if(in<0||in<=ar.length){
		return ar;
	}
	int na[]= new int[ar.length-1]; 
	for(int i=0;i<ar.length-1;i++){
		if(i<in){
			na[i]=ar[i];
		}
		else{
			na[i]=ar[i+1];
		}
	}
	return na;
}
int[] union(int x[],int y[]){
	int z[]= new int[x.length+y.length];
	int k=0;
	for(int i=0;i<x.length;i++){
	z[k++]=x[i];
	}
	for(int i=0;i<y.length;i++){
		int find=1;
		for(int j=0;i<x.length;j++)
		{
		if(y[i]==x[j]){
			find=0;
			break;
		}
		}
		if(find==1){
			z[k++]=y[i];	
		}
		}
	int nu[]=new int[k];
	for(int i=0;i<k;i++){
		nu[i]=z[i];
	}
	return nu ;
	
}
int[] intersection(int x[],int y[]){
	int z[]= new int[x.length];
	int k=0;
		for(int i=0;i<x.length;i++){
		
		for(int j=0;i<y.length;j++)
		{
		if(y[i]!=x[j]){
		z[k++]=x[i];
			break;
		}
		}
		
		}
	int nu[]=new int[k];
	for(int i=0;i<k;i++){
		nu[i]=z[i];
	}
	return nu ;
}
int[] minus(int x[],int y[]){
	int z[]= new int[x.length];
	int k=0;
		for(int i=0;i<x.length;i++){
		int find=1;
		for(int j=0;i<y.length;j++)
		{
		if(y[i]!=x[j]){
		find=0;
			break;
		}
		}
		if(find==1){
			z[k++]=x[i];
		}
		}
	int nu[]=new int[k];
	for(int i=0;i<k;i++){
		nu[i]=z[i];
	}
	return nu ;
}
void displayPairSum(int ar[],int n){
	for(int i=0;i<ar.length;i++){

		for(int j=i+1;i<ar.length;j++)	{
	if(ar[i]+ar[j]==n){
		System.out.println(ar[i]+"  "+ar[j]);
	}
		}
		}
	
}
int	biggestSumConNumbr(int a[])
{
	int big= a[0]+a[1];
	for(int i=0;i<a.length;i++){
		if(a[i]+a[i+1]>big){
			big=a[i]+a[i+1];
				
	}
	}
	return big;
	} 
/*Shape biggestShapeArea(Shape sh[]){
	Shape big= sh[0];
	for(int i=0;i<sh.length;i++){
		if(sh[i].getArray()>big.getArray()){
			big=sh[i];
		}
		
	}
	return big;
}*/
interface Shape{
	double getArray();
}

}
