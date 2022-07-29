
public class Question3 {

	public static void main(String[] args) {
		int n=7;
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");				
			}
			int sp=2*(n-i);
			for(int j=1;j<=sp;j++) {
				System.out.print(" ");				
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");				
			}
			
			
			System.out.println();
		}
		for(int i =1;i<=(n-1);i++) {
			for(int j=1;j<=2*n;j++) {
				if(i==n-1|| j==1 || j==2*n)
					System.out.print("*");
				else
					System.out.print(" ");
					
			}
			System.out.println();
		}

	}

}
