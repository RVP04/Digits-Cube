import java.util.*;
import java.lang.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		ArrayList<String> number = new ArrayList<String>();
		
		while(n>0)
		{
		    number.add(String.valueOf(n%10));
		    n=n/10;
		}
       Collections.reverse(number);
       ArrayList<String> output = new ArrayList<String>();
        for(int i=0;i<number.size();i++)
        {
            int temp =  Integer.parseInt(number.get(i));
            System.out.print((int)Math.pow(temp,3));
        }
	}
}
