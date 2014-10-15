/*
 * int형 변수 num1, num2, num3가 각각 10,20,30으로 초기화되어 있는 상황에서 
 * 다음 문장을 실행하면 각각의 변수에는 얼마가 저장되겠는가??
 * num1=num2=num3
 * 
 * 저장이 되는 값을 확인하는 코드를 작성하고, 그러한 결과를 보이는 이유에 대해서 설명해 보자.
 */

package example4_1;
public class question1 {

	public static void main(String[] args) 
	{
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		
		num1=num2=num3;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
	}
}
