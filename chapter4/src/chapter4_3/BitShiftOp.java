package chapter4_3;
public class BitShiftOp {

	public static void main(String[] args) {
		System.out.println(2<<1);		//4 출력
		System.out.println(2<<2);		//8 출력
		System.out.println(2<<3);		//16출력
		
		System.out.println(8>>1);		//4출력
		System.out.println(8>>2);		//2출력
		System.out.println(8>>3);		//1출력
		
		System.out.println(-8>>1);		//-4출력
		System.out.println(-8>>2);		//-2출력
		System.out.println(-8>>3);		//-1출력
		
		System.out.println(-8>>>1);		//2147483644출력
	}
}
