import java.io.IOException;
import java.util.Scanner;

public class Calc {
	public static void main(String[] args) throws IOException {
		System.out.println("��������ʽ(��������)");
		Scanner sc=new Scanner(System.in);
		double num1=sc.nextDouble();
		char character=(char)System.in.read();
		double num2=sc.nextDouble();
		switch(character){
		case '+':double resultPlus=num1+num2;
		System.out.println("���Ϊ:"+resultPlus);break;
		case '-':double resultSub=num1-num2;
		System.out.println("���Ϊ:"+resultSub);break;
		case '*':double resultMul=num1*num2;
		System.out.println("���Ϊ:"+resultMul);break;
		case '/':
		if(num2==0)
		{
			System.out.println("��������Ϊ0");break;
		}
		else
		{
			double resultDiv=num1/num2;
		    System.out.println("���Ϊ:"+resultDiv);break;
		}
		}	
	}
}
