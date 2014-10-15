/*
 * A={(25+5)+(36/4)-72}*5, B={(25*5)+(36-4)+71}/4, C=(128/4)*2 일 때,
 * A>B>C이면 true, 그렇지 않으면 false를 출력하는 프로그램을 작성하라
 */
package example4_1;
public class question5 {

	public static void main(String[] args) {

		int A=((25+5)+(36/4)-72)*5;
		int B=((25*5)+(36-4)+71)/4;
		int C=(128/4)*2;
		
		if(A>B && B>C){
			System.out.println(true);			
		}
		else System.out.println(false);
	}
}
