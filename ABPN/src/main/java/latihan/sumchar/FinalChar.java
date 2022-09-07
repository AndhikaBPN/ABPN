package latihan.sumchar;
import java.util.*;

public class FinalChar {

    public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
         char max = 57;
         char min = 48;
         char pengurangan = 46;
         char[] charArr;
         int sum = 0;

         System.out.print("INPUT: ");
         String strInput = sc.nextLine();
         charArr = strInput.toCharArray();


         for(int i=0; i<strInput.length(); i++){
             if(charArr[i]>=min && charArr[i]<=max){
                 sum += charArr[i] - pengurangan;
             }
         }

         System.out.println("OUTPUT: " + sum);
    }
}