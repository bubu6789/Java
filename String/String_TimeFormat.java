




	public static String getNowTime(){
		
		return  new SimpleDateFormat("HH:mm:ss").format(new Date());   
		
	}
	public static String getNowDate(){
		
		return  new SimpleDateFormat("yyyy-MM-dd").format(new Date());   
		
	}
	public static String getNowDateTime(){
		
		return  new SimpleDateFormat("yyyy¦~MM¤ëdd¤é HH:mm:ss").format(new Date());   
		
	}
	
	public static String getNowHHMMTime(){
		
		return  new SimpleDateFormat("HHmm").format(new Date());   
		
	}