class quickSort{
  void qsortseg(int [] a, int start, int end){
    if(start >= end-1) return;
    int pivotPos = partition(a, start, end);
    qsortseg(a, start, pivotPos);
    qsortseg(a, pivotPos(), end);
  }

  int partition(int [] a, int start, int end){
    int startIndex = start;
    int endIndex = end-1;
    int pivotValue = a[start];
    while (startIndex < endIndex){
      while ((startIndex < endIndex) && (pivotValue <= a[endIndex]))
	endIndex--;
	a[startIndex] = a[endIndex];
	while((startIndex < endIndex) && (pivotValue > a[startIndex]))
	  startIndex++;
	  a[endIndex] = a[startIndex];
    }
    a[startIndex] = pivotValue;
    return startIndex;
  }

  void qsort(int [] a){
    qsortseg(a, 0, a.length);
  }
}
