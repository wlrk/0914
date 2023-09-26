import java.util.Scanner;

public class Change_money {

	public static void main(String[] args) {
		int [] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1}; // 돈 단위 입력
		String [] names = {"50000", "10000", "5000", "1000", "500", "100", "50", "10", "1"}; //돈 단위를 array 이름으로 지정
		
		Scanner stdin = new Scanner(System.in);
		System.out.print("input price(won): "); //가격 입력
		int num = stdin.nextInt(); //가격 인식
		
		
		for (int i=0; i < unit.length; i++) //주어진 돈 단위 개수만큼 계산 반복
			{
				int a = num / unit[i] ; //돈을 단위만큼 나눠서 필요한 개수 계산
				int b = num % unit[i] ; //남은 돈 계산
				if (a==0)
					System.out.print(""); //해당 돈 단위의 돈이 필요하지 않을 때 출력하지 않음
				else 
					System.out.println(unit[i]+ " : "+ a); //해당 돈 다위의 돈이 필요한 만큼 출력
					
			
				num = b ; //num에 남은 돈 입력
			}
	
	}

}
