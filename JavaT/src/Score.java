import java.util.Scanner;


public class Score {
	public static void main(String[] args) {
		System.out.println("«Î ‰»Î≥…º®:");
		Scanner sc=new Scanner(System.in);
		double Rscore=sc.nextDouble();
		int score=(int)Rscore/10;
		switch(score){
		case 10:
		case 9:System.out.println("A");break;
		case 8:System.out.println("B");break;
		case 7:System.out.println("C");break;
		case 6:System.out.println("D");break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:System.out.println("E");break;
		default:System.out.println("error enter");break;
		}
	}
}
