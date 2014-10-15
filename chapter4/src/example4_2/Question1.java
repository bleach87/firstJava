package example4_2;
/*
 * 문제 1
 * 정수 7의 비트열을 기반으로 2의 보수를 취하면 -7이 됨을 앞서 설명하였다. 실제로 그런지
 * 정수 7에 대한 2의 보수를 계산하여 출력하는 프로그램을 작성해 보자.
 */
public class Question1 {
public static void main(String[] args) {
	int num1=7;
	num1 = ~num1;
	num1+=1;
	
	System.out.println(num1);
}
}
