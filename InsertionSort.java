/* Elif Tuygan
10976028
COMP 231 - Project 1
InsertionSort Algorithm in Java
*/



/* 
 * Data definition for a subarray of an array:
 * array's first element is "a" and there is "b" element in this array.
 * first subarray starts with a and until to b [a, b-1]
 * it continues in same way until array ends. 
 */


public class Project1 { // beginning of class
	
	/*
	 * InsertionSort is a sorting algorithm. It checks elements of array one by one,
	 *  and if first element is bigger than second, it changes places of this two elements.
	 *  That continues until last element of array.

	 * Name: InsertionSort
	 * Input: int array
	 * Output: int array[sorted] 
	 */
		
	
		public static int[]  InsertionSort(int [] myArray)
		{
		
		int Key; // Key is the holding element of myArray list
		int i;   // i is the i. element of myArray list
		int j;   // j is the j. element of myArray list
	
			
			for(j = 1; j< myArray.length; j++) 
				
				//it start with j = 1, it will be second element of our array, by this way it will
				//start to compare second element ("j") with first element ("i" = j-1) of array.
			{
			   Key = myArray[j];
			   i = j -1;		
			
			   while ((i > -1) && 	myArray[i] > Key)
			   	{
				   myArray[i + 1] = myArray[i];
				   i = i - 1;
				   
				   // it continues until i = -1, when i = -1 while loop ends 
				   
			    }//End of while loop
			   
			   myArray[i+1] = Key;

			}//End of for loop

			
			return myArray;			
		}//End of method

/////////////////////////////////////////////////////////////
		
		/*
		 * Name: isSorted
		 * Input: array
		 * Output: boolean
		 * 
		 * isSorted functions check elements of array, if array is sorted it gives true, else false.
		 */
		
		public boolean isSorted(int[] array)
		{
		
		int item = 0;
		
		// item start with "0" (which is array's first element)
		// and checks each element of array one by one until array ends.
		
		while (item < array.length - 1)
		{
			if (array[item] > array[item + 1])
			{
				return false;
				
			}//end of if condition
			
			else
			{
				item++;				
			
			}//end of else condition
		
		}//end of while loops
		
		return true;
		
	}//end my method
		
		
		
//////////////////////////////////////////////////
		
		
	/* PrintSorted function takes each element of new sorted array and write it in array format
	 * and print it using main method.	
	 */
		
		public static void PrintSorted(int[] myArray) 
		{ 
			int i;
			
			for(i = 0; i < myArray.length; i++)
			{ 
				System.out.print("[" + myArray[i]+ " " +"]"); 
			}//end of for loop
		}//end of method

       

		public static void main (String[]args){
		
			
			// examples
			
			int [] array1={1,2,3,4,5};
			int [] array2={3,6,8,10,4};
			int [] array3={10,20,40,5,20};
			int [] array4={35,3,10,200};

			
			
			Project1 Insertion = new Project1();
			

			
			System.out.print("Before sorting: ");
			PrintSorted(array1);
			System.out.println();
			System.out.println(Insertion.isSorted(array1));
			System.out.print("\n"+"After sorting: ");
			PrintSorted(Project1.InsertionSort(array1));
			System.out.println("\n");
			

			System.out.print("Before sorting: ");
			PrintSorted(array2);
			System.out.println();
			System.out.println(Insertion.isSorted(array2));
			System.out.print("\n"+"After sorting: ");
			PrintSorted(Project1.InsertionSort(array2));
			System.out.println("\n");		
			

			System.out.print("Before sorting: ");
			PrintSorted(array3);
			System.out.println();
			System.out.println(Insertion.isSorted(array3));
			System.out.print("\n"+"After sorting: ");
			PrintSorted(Project1.InsertionSort(array3));
			System.out.println("\n");

			
			
			System.out.print("Before sorting: ");
			PrintSorted(array4);
			System.out.println();
			System.out.println(Insertion.isSorted(array4));
			System.out.print("\n"+"After sorting: ");
			PrintSorted(Project1.InsertionSort(array4));
			System.out.println("\n");
			
		}//end of method 

	} //end of class





