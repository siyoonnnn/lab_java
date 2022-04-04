import java.util.Scanner;

class lap_java_day1 {
	  public static void main(String[] args) {
		  Scanner a = new Scanner(System.in) ;
		  String b;
		  int c;
		  int d;
		  int e;
		  System.out.println("이름을 입력하세요");
		  b=a.next();
		  System.out.println("학번을 입력하세요");
		  c=a.nextInt();
		  System.out.println("번호를 입력하세요");
		  d=a.nextInt();
		  System.out.println("나이를 입력하세요");
		  e=a.nextInt();
		  System.out.println("학번:"+c+"이름:"+b+"번호:"+d+"나이:"+e);
	  	}
	  }