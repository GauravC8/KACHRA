import java.util.Scanner;
public class smallandlarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {10,5,2,11,25,66,45};
		Scanner scan=new Scanner(System.in);
		String choice = scan.nextLine();
		int smallest =0,largest = 0;
		switch(choice)
		{
		case "large":
			for(int i=0;i<ar.length;i++)
			{
				if(ar[i]>largest)
					{
						largest=ar[i];
					}
			}
			System.out.println("Largest number is : "+ largest);
			break;
		case "small":
			for(int i=0;i<ar.length;i++)
			{
				if(ar[i]<smallest)
					{
						smallest = ar[i];
					}
			}
			System.out.println("Smallest number is : "+smallest);
			break;
			default:
				System.out.println("Wrong Input or choose largest or smallest");
		}

	}

}
