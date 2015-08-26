package t2;

public class JavaOperator {
	public static void main(String[] args) {
		int m = 6;
		int n = 7;
		loop:for(int i = 0;i<n;i++){
			for(int j = 0;j<m;j++){
				System.out.println("i"+i);
				System.out.println("j"+j);
				if(3==j){
					return;
				}
			}
		}
		return;
	}
}
