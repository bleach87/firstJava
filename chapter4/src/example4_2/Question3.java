package example4_2;
/*
 * ���� 3
 * <<������ ��κ��� ��쿡 �ǿ������� ���� 2�� ����� ���ϴ� ����� ���δ�. �׷��� MSB�� ������Ѽ�
 * ���� ������ ����� ���̴� ��쵵 �ִ�. ���� ������ ���� ������ �ϳ��� ���� ��
 * ������ ����� ���� ��� �߻��ϴ� �� �����ϰ�, �̸� �����ϱ� ���� ������ ���α׷��� �ۼ��غ���
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
