package prob2;

import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		System.out.print( "숫자를 입력하세요: " );
		
		int inputNumber = scanner.nextInt();

		/* 여기에 구현 코드를 작성 합니다. */
		if( inputNumber % 2 == 0 )
		{
			int sum = 0;
			for( int i = 0; i <= inputNumber; )
			{
				sum += i;
				i += 2;
			}
			System.out.println(sum);
		}
		else
		{
			int sum = 0;
			for( int i = 1; i <= inputNumber; )
			{
				sum += i;
				i+=2;
			}
			System.out.println("홀수"+sum);
		}
		
		
		scanner.close();
	}

}
