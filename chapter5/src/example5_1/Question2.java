package example5_1;
/*
 * ���� IEReit.java�� ����� �����ϸ� ������ ����
 * num<0�̶�� "0�̸�" ���
 * 0<=num<100 �̶�� "0�̻� 100�̸�" ���
 * 100<=num�̶�� "100�̻�"���
 * 
 * �̸� ������ ���� ���� ����ȭ�Ͽ� ����� �̿������� ������ �����غ���
 * num<0�̶�� "0�̸�"���
 * 0<=num<100�̶�� "0�̻� 100�̸�"���
 * 100<=num<200�̶�� "100�̻� 200�̸�"���
 * 200<=num<300�̶�� "200�̻� 300�̸�"���
 * 300<=num�̶�� "300�̻�"���
 */
public class Question2 {
	public static void main(String[] args) {
		int num=120;
		
		if(num<0)
			System.out.println("0�̸�");
		else if(num<100)
			System.out.println("0�̻� 100�̸�");
		else if(num<200)
			System.out.println("100�̻� 200�̸�");
		else if(num<300)
			System.out.println("200�̻� 300�̸�");
		else
			System.out.println("300�̻�");
	}
}
