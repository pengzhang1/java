import java.io.IOException;
import java.util.Scanner;

public class Calc {
	public static void main(String[] args) throws IOException {
		System.out.println("请输入算式(单个输入)");
		Scanner sc=new Scanner(System.in);
		double num1=sc.nextDouble();
		char character=(char)System.in.read();
		double num2=sc.nextDouble();
		switch(character){
		case '+':double resultPlus=num1+num2;
		System.out.println("结果为:"+resultPlus);break;
		case '-':double resultSub=num1-num2;
		System.out.println("结果为:"+resultSub);break;
		case '*':double resultMul=num1*num2;
		System.out.println("结果为:"+resultMul);break;
		case '/':
		if(num2==0)
		{
			System.out.println("除数不能为0");break;
		}
		else
		{
			double resultDiv=num1/num2;
		    System.out.println("结果为:"+resultDiv);break;
		}
		}	
	}
}
