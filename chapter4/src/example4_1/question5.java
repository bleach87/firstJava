/*
 * A={(25+5)+(36/4)-72}*5, B={(25*5)+(36-4)+71}/4, C=(128/4)*2 �� ��,
 * A>B>C�̸� true, �׷��� ������ false�� ����ϴ� ���α׷��� �ۼ��϶�
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
