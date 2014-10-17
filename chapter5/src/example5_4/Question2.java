package example5_4;
/* 1부터 100까지 출력을 하고 난 다음에, 다시 거꾸로 100에서 1까지 출력을 하는
 * 프로그램을 작성해 보자. 단 while문과 do~while문을 각각 한번씩 사용해서
 * 구현해야 하낟.
 */
public class Question2 {

	public static void main(String[] args) {

		int num = 1;
		
		while(num <= 100){
			System.out.println(num++);
		}
		do{
			System.out.println(--num);

		}while(num>1);
	}
}
