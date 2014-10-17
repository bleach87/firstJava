/* 예제 ContinueBasic.java의 내부에 존재하는 while문을 for문으로
 * 변경해서 예제를 재 구현해 보자
 */
package example5_6;

public class Question1 {

	public static void main(String[] args) {

		int count = 0;
		
		for(int i = 1; i < 100; i++){
			if(i%5 != 0 || i%7 != 0)
				continue;
			
			count++;
			System.out.println(i);
			
			System.out.println("count : " + count);
		}
	}

}
