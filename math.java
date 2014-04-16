import java.util.Arrays;
class Fibonacci{
	public static int [ ] f (int n) {
	// returns the first n+1 fibonacci numbers
	int l=0;
	int a=0;
	int [] array=new int[n];
	//condition part...
		for(int i=0; i<n;i++){
			if(n==0){
				a=0;
			}
			else if(n==1){
				a=1;
			}
			else if (n>1){
				a = f(n-1) + (n-2);
			}
		array[l++]=a;	
	
		}
	return array;
	}
	public static void main(String[] args){
	Prime test=new Prime();
	System.out.println(Arrays.toString(f(0)));
	System.out.println(Arrays.toString(f(1)));
	System.out.println(Arrays.toString(f(2)));
	System.out.println(Arrays.toString(f(3)));
	System.out.println(Arrays.toString(f(4)));
		}
}


import java.util.Arrays;
class Prime{
	public static int [] prime (int n) {
	// returns the first n+1 prime numbers
	int k;
	int l=0;
	int [] array=new int[n+1];

		for (k=0;k<n+1;k++){
			//System.out.print(k + ", ");
			array[l++]=k;	
					}
	
	return array;
	}
	public static void main(String[] args){
	Prime test=new Prime();
	System.out.println(Arrays.toString(prime(5)));
	System.out.println(Arrays.toString(prime(10)));
	System.out.println(Arrays.toString(prime(13)));
		}
}


import java.util.Arrays;
class Unique{
	public static int[] sort(int sortedArray[]){
	int j=0;
	int z=0;
	int [] array=new int[sortedArray.length-z];
	
	for(int i=1;i<sortedArray.length;i++){
		if(sortedArray[i]==sortedArray[i++]){
			z=z+1;
				}		
		else if(array[j]!=sortedArray[i-1]){			
			array[j]=sortedArray[i-1];
			j=j++;			
				}
		}
	System.out.println(z);
	return array;
	}
	public static void main(String[] args){
		Unique parameter=new Unique();
		int array[]={1,1,1,4,4,5,6,6,7};
		System.out.println(Arrays.toString(sort(array)));
		
	}
}
