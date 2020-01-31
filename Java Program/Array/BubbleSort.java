package Array;
//7. WAP sort array elements in ascending order using bubble sort.
public class BubbleSort 
{
	//This method sorts the input array in asecnding order
     public static void bubbleSortInAscendingOrder( int numbers[])
    {
        int temp;
         for(int i = 0; i < numbers.length; i++)
        {
            for(int j = 1; j < numbers.length -i ; j++)
            {
                //if numbers[j-1] > numbers[j], swap the elements
                if(numbers[j-1] > numbers[j])
                {
                    temp = numbers[j-1];
                    numbers[j-1]=numbers[j];
                    numbers[j]=temp;
                }
            }
        }
    }
	public static void main(String[] args) 
	{
		int a[] = {6,7,3,2,1};
		//Displaying the numbers before sorting
        System.out.print("Before sorting, numbers are ");
        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
 
        //Sorting in ascending order using bubble sort
        bubbleSortInAscendingOrder(a);
 
        //Displaying the numbers after sorting
        System.out.print("Before sorting, numbers are ");
        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
 
        
  
	}

}
