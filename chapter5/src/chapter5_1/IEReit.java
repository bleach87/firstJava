package chapter5_1;
public class IEReit {

	public static void main(String[] args) {
		int num=120;
		
		if(num<0)
		{
			System.out.println("0미만");
		}
		else{
			if(num<100){
				System.out.println("0이상 100미만");
			}
			else{
				System.out.println("100 이상");
			}
		}
	}
}
