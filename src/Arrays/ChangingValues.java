package Arrays;

public class ChangingValues {

	public static void main(String[] args) {
		int[]a= {4,5,7,8};
        int[]b= {2,3,4,10};
        int[]c = {5,6,7,8};
          a[0]=1;a[1]=8;
          b[2]=11;b[3]=70;
          c[3]=10;c[2]=45;
           
    for( int i=0 ;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	for( int i=0 ;i<b.length;i++)
	{
		System.out.println(b[i]);
	}
	for(int i=0;i<c.length;i++)
	{
		System.out.println(c[i]);
	}
		// TODO Auto-generated method stub

	}

}
