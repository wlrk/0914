
public class Calc {

	public static void main(String[] args) {
		double sum = 0.0;
		
		for (int i=0; i<args.length; i++)
			sum+=Double.parseDouble(args[i]);
		System.out.println("합계 : "+sum);

	}

}
//run configurations -> arguments를 통해 숫자 입력하면 합계 계산