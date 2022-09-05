package latihan;
import java.util.*;

public class TestWeek1 {
	public static void main(String[] args) {
		
		Random rand = new Random();
		int[] intArr = {3,8,5,2,1,9,10};
		int intB = rand.nextInt(0, 11);
		boolean isFound = true;
		
		for(int i=0;i<intArr.length;i++)
		{
			if(intB==intArr[i])
			{
				System.out.println("Angka "+intB+" ditemukan , pada index ke "+i);
				isFound = false;
				break;
			}
		}
		
		if(isFound)
		{
			System.out.println("Angka  "+intB+" yang anda cari tidak ditemukan !! ");			
		}
	}
}
