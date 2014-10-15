package example5_2;
/*
 * CondOp.java 예제를 조건 연산자를 사용하지 않고, 대신에 if~else를 사용하는 형태로
 * 바꾸어 보자
 * int num1=50, num2=100;
		int big, diff;
		
		big=(num1>num2) ? num1:num2;
		System.out.println(big);
		
		diff = (num1>num2) ? num1-num2 : num2-num1;
		System.out.println(diff);
 */
public class Question1 {
	public static void main(String[] args) {
		int num1=50, num2=100;
		
		if(num1>num2)
			System.out.println(num1);
		else
			System.out.println(num2);
		
		if(num1>num2)
			System.out.println(num1-num2);
		else
			System.out.println(num2-num1);
	}
}
