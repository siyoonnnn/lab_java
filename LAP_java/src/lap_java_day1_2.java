import java.util.Scanner;

public class lap_java_day1_2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int a;
		int b;
		double c;
		String d;
		
		System.out.println("������ 1,�Ǽ��� 2,���ڿ��̸� 3 �� ���ÿ�");
		a = sc.nextInt();
		if(a==1) {
			System.out.println("������ �Է��ϼ���");
			b = sc.nextInt();
			System.out.println(b);
		}else if(a==2){
			System.out.println("�Ǽ��� �Է��ϼ���");
			c = sc.nextDouble();
			System.out.println(c);
		}else{
			System.out.println("���ڿ��� �Է��ϼ���");
			d = sc.next();
			System.out.println(d);
		}
	}
}