import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo {
	
	public static void main(String args[])
	{
		 String df = new SimpleDateFormat("yyyy/MM/dd/hh:ss").format(new Date());
		 System.out.println(df);
	}

}
