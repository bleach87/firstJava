/* 1부터 10까지 곱해서 그 결과를 출력하는 프로그램을 
 * for 문을 이용해서 작성해보자
 */
package example5_5;

public class Question1 {

	public static void main(String[] args) {
		
		int num1 = 1;
		
		for(int i = 1; i <= 10; i++){
			num1 *= i;
		}
		System.out.println(num1);
	}

}
