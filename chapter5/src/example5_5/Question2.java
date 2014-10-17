/* 구구단 중 5단을 출력하는 프로그램을 for 문을 이용해서 작성하자
 */
package example5_5;

public class Question2 {

	public static void main(String[] args) {
		int num = 5;
		for(int i = 1; i < 10; i++){
			System.out.println(num+"+"+i+"="+num * i);
		}
	}

}
