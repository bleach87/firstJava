/*
 * ���� SCE.java�� �������� ���� ���� num2�� ���� �������� ������ Ȯ���� �� �ִµ�, �̴� SCE��
 * ���ؼ� �ι��̳� �����ϴ� ���깮 'num2+=10'�� ���� ������� �ʱ� �����̴�.
 * �׷��ٸ� ������ ��� �����ؾ� num2�� ���� �����ǰڴ°�?
 */

package example4_1;
public class question2 {
	public static void main(String[] args) {
		
		int num1=0, num2=0;
		boolean result;

		num1+=10;
		num2+=10;
		result = (num1+=10)<0 && (num2+=10)>10;
		System.out.println("result="+result);
		System.out.println("num1="+num1+",num2="+num2);

		num1+=10;
		num2+=10;
		result = (num1+=10)>0 || (num2+=10)>0;
		System.out.println("result="+result);
		System.out.println("num1="+num1+",num2="+num2);
	}
}
