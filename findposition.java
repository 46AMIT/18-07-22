import java.util.Scanner;
public class findposition
{
     public static void main(String []args)
     {
     Scanner amit=new Scanner(System.in);
	int n;   
	System.out.println("Enter the size of the array");
	n=amit.nextInt();    
	int arr[]=new int[n]; 
	System.out.println("Enter the array");  
	for(int i=0;i<n;i++)     
	{
		arr[i]=amit.nextInt();
	}         
		for(int i=0;i<n;i++)     
		{
			for(int j=i+1;j<n;j++)    
			{
				if(arr[i]<arr[j])     
				{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
		}
		System.out.println("Second Largest element is "+arr[1]);   
		System.out.println("Second Smallest element is "+arr[n-2]);  
    }
}