
public class sortingArray4105056004 extends sortingArray 
{

	public static void main(String[] args) 
	{
		int a[] = {1,6,4,8,7,11,5,21,10,3,5,7,12,19,15,20};
		int b[];
		sortingArray4105056004 test = new sortingArray4105056004();
		b = test.sorting(a);
		
		for(int i = 0; i < a.length; i++)
			System.out.print((int)b[i]+ " ");
	}

	@Override
	public int[] sorting(int[] A) {
		
		int gap = 1, i, j, len = A.length;
		int temp;
		while (gap < len / 3)
			gap = gap * 3 + 1; 
		for (; gap > 0; gap /= 3)
			for (i = gap; i < len; i++) 
			{
				temp = A[i];
				for (j = i - gap; j >= 0 && A[j] > temp; j -= gap)
					A[j + gap] = A[j];
				A[j + gap] = temp;
			}
		
		
		
		return A;
	}

}
