package example4_2;
/*
 * 문제 3
 * <<연산은 대부분의 경우에 피연산자의 값에 2의 배수를 곱하는 결과를 보인다. 그러나 MSB를 변경시켜서
 * 전혀 엉뚱한 결과를 보이는 경우도 있다. 음의 정수와 양의 정수를 하나씩 예로 들어서
 * 엉뚱한 결과가 언제 어떻게 발생하는 지 설명하고, 이를 증명하기 위한 간단한 프로그램도 작성해보자
 */
public class Question3 {
	public static void main(String[] args) {
		int num=7;
		int bitset=1<<30;
		num|=bitset;		//num= num | bitset
		System.out.println(num);
		System.out.println(num<<1);
		
		num=-12;
		bitset=~0;
		bitset ^= (1<<30);		//bitset = bitset ^ (1<<30)
		num &= bitset;			//num= num & bitset
		System.out.println(num);
		System.out.println(num<<=1);
	}
}
