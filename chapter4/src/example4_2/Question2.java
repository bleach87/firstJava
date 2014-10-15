package example4_2;
/*
 * 문제2
 * int형 정수 15678의 오른쪽에서 세 번째 비트와 다섯 번째 비트가 각각 어떻게 되는지 확인하여 
 * 출력하는 프로그램을 작성해 보자
 */
public class Question2 {
	public static void main(String[] args) {
		int num=15678;
		
		System.out.println(num>>2 & 1);
		System.out.println(num>>4 & 1);
	}
}
