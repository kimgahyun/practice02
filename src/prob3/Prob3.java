package prob3;
import java.util.Scanner;


public class Prob3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner( System.in );
		System.out.print( "문자열을 입력하세요:" );
		
		String s = scanner.nextLine();
		
		/*  나머지 코드를 구현합니다. */
		char[] a = s.toCharArray();

		System.out.println(a[0]);
	
		for( int i = 1; i < a.length; i++ )
		{			
			for( int j = 0; j < i; j++)
			{
				System.out.print(a[j]);
			}
			System.out.print( a[i] );
			System.out.println();			
		}
		
		scanner.close();
	}
}
