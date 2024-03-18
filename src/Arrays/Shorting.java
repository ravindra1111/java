package Arrays;

public class Shorting {

	public static void main(String[] args) {
		int[]a= {1,3,5,7,8,6,4,2,0};
		for(int i=0;i<a.length;i++) {
	    for(int h=i+1;h<a.length;h++) {
				if(a[i]>a[h]) {
				int	c=a[i];
					a[i]=a[h];
					a[h]=c	;	
				}
				
			}
		   System.out.println(a[i]);
		}
		// TODO Auto-generated method stub

	}

}
