package interview;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateFormat df= new SimpleDateFormat("yyyy/MM/dd HH:MM;SS");
		Date d= new Date();
		String s= df.format(d);
		System.out.println(s);
		

	}

}
