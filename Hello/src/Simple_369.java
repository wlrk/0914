import java.util.Scanner;

public class Simple_369 {
	public static void main(String args[])
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter integer value 1~99 : ");
		int num = stdin.nextInt(); // 숫자 입력
		int T = num/10;    //10의 자리
		int O = num%10;    //1의 자리
		
		boolean TIs369 = T == 3 || T == 6 || T == 9;  //10의자리 3,6,9 유무
        boolean OIs369 = O == 3 || O == 6 || O == 9;  //1의 자리 3,6,9 유무

        if (TIs369 && OIs369) {
            System.out.println("박수짝짝");
        } //일, 십의 자리 둘다 3,6,9 존재
        
        else if (TIs369 || OIs369) {
            System.out.println("박수짝");
        } //일, 십의 자리 중 하나만 3,6,9, 존재
        
        else {
            System.out.println("No 3, 6, or 9");
        } //3,6,9 아무것도 없을 때
	}

}
