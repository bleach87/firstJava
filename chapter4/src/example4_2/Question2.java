package example4_2;
/*
 * ����2
 * int�� ���� 15678�� �����ʿ��� �� ��° ��Ʈ�� �ټ� ��° ��Ʈ�� ���� ��� �Ǵ��� Ȯ���Ͽ� 
 * ����ϴ� ���α׷��� �ۼ��� ����
 */
public class Question2 {
	public static void main(String[] args) {
		int num=15678;
		
		System.out.println(num>>2 & 1);
		System.out.println(num>>4 & 1);
	}
}
