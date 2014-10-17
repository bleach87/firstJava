/* 자연수 1부터 시작해서 모든 홀수와 3의 배수인 짝수를 더해 나간다. 그리고
 * 그 합이 언제 (몇을 더했을 때_) 1000을 넘어서는지, 그리고 1000을 넘어선 값은
 * 얼마가 되는지 계산하여 출력하는 프로그램을 작성해보자. 단 프로그램내에서
 * 반복문을 필요로 한다면 반드시 while문을 무한루프로 구성해야 한다.
 */

package example5_6;

public class Question2 {

	public static void main(String[] args) {

		int num = 1;
		int sum = 0;

		while (true) {
			
			if (num % 2 != 0) {
				sum += num;
			} else {
				if (num % 3 == 0)
					sum += num;

			}
			if (num > 1000) {
				System.out.println("초과된 값" + sum);
				System.out.println(num + "더할때 1000을 넘는다");
				break;

			}
			num++;
		}

	}

}
