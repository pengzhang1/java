import java.util.Scanner;

public class Area {
	public static void main(String[] args) {
		System.out.println("1.矩形   2.三角形   3.圆");
		System.out.println("请选择图形:");
		Scanner sc=new Scanner(System.in);
		int choose=sc.nextInt();
		if(choose==1)
		{
			System.out.println("请输入矩形的宽");
			double width=sc.nextDouble();
			System.out.println("请输入矩形的长");
			double length=sc.nextDouble();
			double s=width*length;
			System.out.println("矩形的面积为:"+s);
		}
		else if(choose==2)
		{
			System.out.println("请输入三角形的三条边长:");
			double length1=sc.nextDouble();
			double length2=sc.nextDouble();
			double length3=sc.nextDouble();
			if((length1+length2>length3)&&(length2+length3>length1)&&(length1+length3>length2))
			{
				double p=(length1+length2+length3)/2;
			    double s=Math.sqrt(p*(p-length1)*(p-length2)*(p-length3));
			    System.out.println("三角形的面积为:"+s);
			}
			else
			{
				System.out.println("enter wrong");
			}

		}
		else if(choose==3)
		{
			System.out.println("请输入圆的半径");
			double r=sc.nextDouble();
			double s=r*r*3.1415926;
			System.out.println("圆的面积为:"+s);
		}
		else
			System.out.println("输入有误");
	}
}
