


import java.util.Calendar;
import java.util.Date;





//�{�b���+�ɶ�+

String dateTime = new SimpleDateFormat("yyyy�~MM��dd�� HH:mm:ss").format(new Date());   


//�o��P��
String[] dayInt = new String[] { "��", "�@", "�G", "�T", "�|", "��", "��" };//�P���X
int day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);//���ѬO�P�����ĤL��
time += " �P��" + dayInt[day - 1];
System.out.println(time);



------------------------------------------------------------����
java.util.Timer timer1= new java.util.Timer();
timer1.schedule(new TimerTask(){
	public void run() {
        System.out.println(new SimpleDateFormat("yyyy�~MM��dd�� HH:mm:ss").format(new Date()));
 } }, 0,1000);

----------------------------------------------------------------