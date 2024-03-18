package Arrays;

public class Ascending {
	public static void main(String[]args)
	{
	ascending();
	decending();
	
}

	public static void ascending() {
		int[]a= {1,3,5,7,8,6,4,2,0};
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
		System.out.println("Enter the size");
		int[]a= {1,3,5,7,8,6,4,2,0};
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


