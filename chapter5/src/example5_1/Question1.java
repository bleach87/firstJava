package example5_1;

/*
 * 다음 예제에서는 두개의 if문을 사용하고 있다. 이를 하나의 if문만 사용하는 방식으로 변경해 보자.
 * 
 * int num=120;
 * 
 * if(num>0)
 * {
 * if((num%2)==0)
 * System.out.println("양수이면서 짝수");
 * }
 */
public class Question1 {
	public static void main(String[] args) {
		int num = 120;

		if (num > 0 && (num%2)==0) 
				System.out.println("양수이면서 짝수");
		
	}
}
