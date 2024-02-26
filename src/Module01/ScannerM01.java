package Module01;
import java.util.Scanner;


public class ScannerM01 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		
		boolean ContLoop = true;
		
		while(ContLoop == true)
		{
			System.out.print("Enter Name Test");
			String Input = Scan.nextLine();
			
			if(Input == "e")
			{
				ContLoop = false;
			}
		}
	}

}
