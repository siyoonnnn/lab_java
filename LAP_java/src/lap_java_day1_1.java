import java.util.Scanner;

public class lap_java_day1_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		int score = sc.nextInt();
		if(score>90) {
			System.out.println("A등급");
		}
		else if(score>80) {
			System.out.println("B등급");
		}
		else {
			System.out.println("C등급");
		}
		}
}
	