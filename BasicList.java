import java.util.Scanner;

public class BasicList {
	
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	int[] su=new int[5];
	
	for(int i=0; i<su.length; i++) {
		System.out.print("원하는 숫자를 입력하세요");
		su[i]=scan.nextInt();
	}
	for(int k: su) {
		System.out.println(k);
		}
	}

}



