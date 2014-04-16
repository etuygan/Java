class CormenMergeSort{

	//methods
	static void Merge(int [] A, int start, int mid, int end){
		start = 0;
		mid = A.length / 2;
		end = A.length - 1;
		int n1 = mid - start + 1;
		int n2 = end - mid;
		int [] L = new int [n1 + 1];
		int [] R = new int [n2 + 1];

		for(int i = 1; i <= mid; i++){
			L[i] = A[start + i - 1];
		}
		for(int j = 1; j <= mid; j++){
			R[j] = A[end + j];
		}

		int sentinel = L[n1 + 1] = R[n2 + 1];
		int i = 1;
		int j = 1;

		for(int k = start; k <= A.length; k++){
			if(L[i] <= R[j]){
				A[k] = L[i];
				i++;
			}
			else{
				A[k] = R[j];
				j++;
			}
		}
	}

	static void MergeSort(int [] A, int start, int end){
		if(start < end){
			int mid = (start + end) / 2;
			MergeSort(A, start, mid);
			MergeSort(A, mid + 1, end);
			Merge(A, start, mid, end);
		}
	}

	static void main(String[] args){
		int [] array = {2,7,4,6,1,3,8,5,9,0};
		System.out.println(MergeSort(array, 0, 10));
	}
}
