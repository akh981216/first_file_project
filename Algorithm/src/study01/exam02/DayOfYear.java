package study01.exam02;
import java.util.Scanner;

public class DayOfYear {
	static int[][] mday = {
			{31,28,30,31,30,31,31,30,31,30,31}
			,{31,29,30,31,30,31,31,30,31,30,31}
	};
	
	static int isLeap(int year) {
		return (year%4==0&&year%100 !=0||year%400==0)?1:0;
	}
	
	static int dayOfYear(int y, int m, int d) {
		int days = d;
		
		for(int i=1; i<m; i++)
			days +=mday[isLeap(y)][i-1];
		return days;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int retry;
		
		System.out.println("그 해 경과 일수를 구합니다.");
		do {
			System.out.print("년:"); int year = stdIn.nextInt();
			System.out.print("월:"); int month = stdIn.nextInt();
			System.out.print("일:"); int day = stdIn.nextInt();
			
			System.out.printf("그 해 %d일째입니다. \n",dayOfYear(year,month,day));
			
			System.out.println("한 번 더 할까여? (1yes, 2, no");
			retry = stdIn.nextInt();
		}while(retry==1);		
	}
}
