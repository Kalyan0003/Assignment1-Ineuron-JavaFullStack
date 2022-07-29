
public class Question4 {

	public static void main(String[] args) {
		int n=7;
		for(int i=1;i<=n;i++) {
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
       for(int j=1;j<=2*n;j++) {
    	   System.out.print("*");
       }
	}

}
