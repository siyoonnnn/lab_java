import java.util.Scanner;

public class lap_java_day1_2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int a;
		int b;
		double c;
		String d;
		
		System.out.println("정수면 1,실수면 2,문자열이면 3 을 고르시오");
		a = sc.nextInt();
		if(a==1) {
			System.out.println("정수를 입력하세요");
			b = sc.nextInt();
			System.out.println(b);
		}else if(a==2){
			System.out.println("실수를 입력하세요");
			c = sc.nextDouble();
			System.out.println(c);
		}else{
			System.out.println("문자열을 입력하세요");
			d = sc.next();
			System.out.println(d);
		}
	}
}