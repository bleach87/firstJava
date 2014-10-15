/*
 * 예제 SCE.java의 실행결과를 보면 변수 num2의 값이 증가되지 않음을 확인할 수 있는데, 이는 SCE에
 * 의해서 두번이나 등장하는 연산문 'num2+=10'이 전혀 실행되지 않기 때문이다.
 * 그렇다면 예제를 어떻게 수정해야 num2의 값이 증가되겠는가?
 */

package example4_1;
public class question2 {
	public static void main(String[] args) {
		
		int num1=0, num2=0;
		boolean result;

		num1+=10;
		num2+=10;
		result = (num1+=10)<0 && (num2+=10)>10;
		System.out.println("result="+result);
		System.out.println("num1="+num1+",num2="+num2);

		num1+=10;
		num2+=10;
		result = (num1+=10)>0 || (num2+=10)>0;
		System.out.println("result="+result);
		System.out.println("num1="+num1+",num2="+num2);
	}
}
