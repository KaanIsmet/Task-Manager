package timeStamp;

import java.util.Date;
import java.text.SimpleDateFormat;

public class TimeStamp {

	private String date;

	public TimeStamp() {
		date = new SimpleDateFormat("MM/dd/yyyy h:mm:ss a").format(new Date());
	}


	public String getDate() {
		return date;
	}
}










