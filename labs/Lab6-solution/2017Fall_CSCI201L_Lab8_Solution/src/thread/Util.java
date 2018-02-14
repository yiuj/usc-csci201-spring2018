package thread;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Util{
	public static String getDate(){
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.sss");
		Date date = new Date();
		String time = dateFormat.format(date); //2016/11/16 12:08:43
		return time;
	}
	public static void print(String s){
		System.out.println(s);
	}
}


