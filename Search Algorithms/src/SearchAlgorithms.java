public class SearchAlgorithms {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test1 = {1,2,3,4,5,6,7,8,9,10};
		int[] test2= {0,4,5,6,12,15,17,23,29};
		System.out.println(binSearch(test1,3)); //2
		System.out.println(linSearch(test1,3)); //2
		
		System.out.println(binSearch(test2,23)); //2
		System.out.println(linSearch(test2,23)); //2
		
		System.out.println(binSearch(test2,25)); //2
		System.out.println(linSearch(test2,25)); //2
		
		System.out.println(binSearch(test1,10)); //2
		System.out.println(linSearch(test1,1)); //2
		
		System.out.println(binSearch(test1,1)); //2
		
	}
	
	public static int linSearch(int[] number, int query)
	{ 
		for(int a=0;a<number.length;a++)
		{
			if(number[a]==query)
			{
				return a;
			}
		}
		return -1;
	}
	
	public static int binSearch(int[] number, int query)
	{
		
		int l=0;
		int r=number.length-1; 
		while(l<=r)
		{
			int mid = l+(r-l)/2;
			
			if(number[mid]==query)
			{
				return mid;
			}
		   
			if(number[mid]<query)
			{
				l= mid+1;
			}
			
			if (number[mid]>query)
			{
				r= mid-1;
			}
		}
		return -1;
	}
	
}