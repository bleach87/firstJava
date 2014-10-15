package example5_1;
/*
 * 예제 IEReit.java의 기능을 정리하면 다음과 같다
 * num<0이라면 "0미만" 출력
 * 0<=num<100 이라면 "0이상 100미만" 출력
 * 100<=num이라면 "100이상"출력
 * 
 * 이를 다음과 같이 보다 세분화하여 출력이 이워지도록 예제를 변경해보자
 * num<0이라면 "0미만"출력
 * 0<=num<100이라면 "0이상 100미만"출력
 * 100<=num<200이라면 "100이상 200미만"출력
 * 200<=num<300이라면 "200이상 300미만"출력
 * 300<=num이라면 "300이상"출력
 */
public class Question2 {
	public static void main(String[] args) {
		int num=120;
		
		if(num<0)
			System.out.println("0미만");
		else if(num<100)
			System.out.println("0이상 100미만");
		else if(num<200)
			System.out.println("100이상 200미만");
		else if(num<300)
			System.out.println("200이상 300미만");
		else
			System.out.println("300이상");
	}
}
