package example5_4;
/* 1부터 99까지의 합을 구하는 프로그램을 작성하되 while 문을
 * 이용해서 작성해보자.
 */
public class Question1 {

	public static void main(String[] args) {

		int num = 0;
		int num2 = 0;
		
		while(num < 100){
			
			num2 += num;
			num++;
		}
		System.out.println(num2);
	}
}
