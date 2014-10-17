/* 두 개의 정수를 전달받아서, 두 수의 사칙연산 결과를 출력하는 메소드와
 * 이 메소드를 호출하는 main 메소드를 정의해 보자. 단 나눗셈은
 * 몫과 나머지를 각각 출력해야 한다.
 */
package example6;

public class Question1_1 {

	static int result;
	
	public static void main(String[] args) {
		Calculator(5,2);
	}
	
	
	public static void Calculator(int v1, int v2){
		
		System.out.println(v1 + "+" + v2 + "=" + (v1+v2));
		System.out.println(v1 + "-" + v2 + "=" + (v1-v2));
		System.out.println(v1 + "*" + v2 + "=" + (v1*v2));
		System.out.println(v1 + "/" + v2 + "=" + (v1/v2));
		System.out.println(v1 + "%" + v2 + "=" + (v1%v2));
				
		}
	}


