import java.util.Scanner;

public class Area {
	public static void main(String[] args) {
		System.out.println("1.����   2.������   3.Բ");
		System.out.println("��ѡ��ͼ��:");
		Scanner sc=new Scanner(System.in);
		int choose=sc.nextInt();
		if(choose==1)
		{
			System.out.println("��������εĿ�");
			double width=sc.nextDouble();
			System.out.println("��������εĳ�");
			double length=sc.nextDouble();
			double s=width*length;
			System.out.println("���ε����Ϊ:"+s);
		}
		else if(choose==2)
		{
			System.out.println("�����������ε������߳�:");
			double length1=sc.nextDouble();
			double length2=sc.nextDouble();
			double length3=sc.nextDouble();
			if((length1+length2>length3)&&(length2+length3>length1)&&(length1+length3>length2))
			{
				double p=(length1+length2+length3)/2;
			    double s=Math.sqrt(p*(p-length1)*(p-length2)*(p-length3));
			    System.out.println("�����ε����Ϊ:"+s);
			}
			else
			{
				System.out.println("enter wrong");
			}

		}
		else if(choose==3)
		{
			System.out.println("������Բ�İ뾶");
			double r=sc.nextDouble();
			double s=r*r*3.1415926;
			System.out.println("Բ�����Ϊ:"+s);
		}
		else
			System.out.println("��������");
	}
}
