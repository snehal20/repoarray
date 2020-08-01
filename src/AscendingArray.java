
public class AscendingArray 
{
	
	public static void main(String[] args)
	{
		int[] arr = new int[8];
		arr[0]=20;
		arr[1]=14;
		arr[2]=48;
		arr[3]=9;
		arr[4]=5;
		arr[5]=3;
		arr[6]=25;
		arr[7]=7;

		System.out.println("Before swapping");

		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("After swapping of array ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}





