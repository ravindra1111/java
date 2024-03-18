package Arrays;
import java.util.Scanner;
public class SCArrays {

	public static void main(String[] args) {
		ascending();
		decending();
		
	}

		public static void ascending() {
			System.out.println("Enter the size");
			
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int a[]=new int[n];
			System.out.println("Enter the array");
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			for(int i=0;i<a.length;i++) {
				int c;
				 for(int h=i+1;h<a.length;h++) {
					if(a[i]>a[h]) {
						c=a[i];
						a[i]=a[h];
						a[h]=c	;	
					}
					
				}
			   System.out.println(a[i]);
			}
			
		}
		public static void decending() {
			System.out.println("STOP");
			{
				System.out.println("Enter the size");
				
				Scanner sc=new Scanner(System.in);
				int n=sc.nextInt();
				int a[]=new int[n];
				System.out.println("Enter the array");
				for(int i=0;i<n;i++) {
					a[i]=sc.nextInt();
				}
				for(int i=0;i<a.length;i++) {
					int c;
					 for(int h=i+1;h<a.length;h++) {
						if(a[i]<a[h]) {
							c=a[i];
							a[i]=a[h];
							a[h]=c	;	
						}
						
					}
				   System.out.println(a[i]);
				}
			
		}

		




		}
}


