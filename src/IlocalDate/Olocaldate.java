package IlocalDate;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Olocaldate {

	public static void main(String[] args) {
		Date S=new Date();
		System.out.println(S);
		LocalDate j= LocalDate.now();
		System.out.println(j);
		LocalDateTime k= LocalDateTime.now();
		System.out.println(k);

	}

}
