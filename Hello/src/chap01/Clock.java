package chap01;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Clock { 
	public String now() { // 현재시간을 출력
		SimpleDateFormat sdf = new SimpleDateFormat("HH시mm분ss초");
		return sdf.format(new Date());
	}

}
