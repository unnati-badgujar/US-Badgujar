package Array;
//Find the Dublicate number.
public class Dublicate {
	public static void main(String[] args) 
	{
		int a[]=new int[]{1,2,1,5,4,3,3,2};
		int count=0;
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			count=0;
			flag=false;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					
					for(int k=i-1;k>a.length;k--)
					{
						if(a[i]==a[k])
						{
							flag=true;
						}
					}
				}
			}
			if(flag==false)
			{
				System.out.println(a[i]+" = "+count);
			}
		}
	}

}
