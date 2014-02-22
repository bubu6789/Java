


import java.util.Calendar;
import java.util.Date;





//現在日期+時間+

String dateTime = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss").format(new Date());   


//得到星期
String[] dayInt = new String[] { "日", "一", "二", "三", "四", "五", "六" };//星期幾
int day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);//今天是星期的第几天
time += " 星期" + dayInt[day - 1];
System.out.println(time);



------------------------------------------------------------時鐘
java.util.Timer timer1= new java.util.Timer();
timer1.schedule(new TimerTask(){
	public void run() {
        System.out.println(new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss").format(new Date()));
 } }, 0,1000);

----------------------------------------------------------------