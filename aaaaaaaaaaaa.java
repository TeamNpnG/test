package day01;

public class aaaaaaaaaaaa {

	static int user[] = new int[3];
	static int count = 0;
	public static void main(String[] args) {
		
		foo(0);
		foo(1);
		System.out.println(output);
		
	}
	
	public static String output = "";
	public static void foo(int x) {
		output += "1";
		try {
			if(x==1) {
				throw new Exception();
			}
		}catch(Exception e) {
			output += "2";
		}finally {
			output += "3";
		}
		output +="4";
	}
	
	
	
	
	
	
	
	
	public static void dartGame(){

		int dart = dartInit();
		String score = scoreInit();
		String event = eventInit();

		if(score.equals("S")) {
			if(event.equals("*")) {
				if(user[0] == 0) {
					dart *= 2;

				}else {
					user[count] *= 2;
					dart *= 2;
				}
			}else if(event.equals("#")) {
				dart *= -1;
			}
		}else if(score.equals("D")){

			int tmp = dart;
			dart *= tmp;

			if(event.equals("*")) {
				if(user[0] == 0) {
					dart *= 2;

				}else {
					user[count] *= 2;
					dart *= 2;
				}
			}else if(event.equals("#")) {
				dart *= -1;
			}
		}else if(score.equals("T")){

			int tmp = dart;
			dart *= tmp;
			dart *= tmp;
			if(event.equals("*")) {
				if(user[0] == 0) {
					dart *= 2;

				}else {
					user[count] *= 2;
					dart *= 2;
				}
			}else if(event.equals("#")) {
				dart *= -1;
			}
		}
		user[count] = dart;
		count++;

		for(int i = 0; i<user.length ; i++){


			if(user[i] == 0){
				System.out.println("0");
			}else {
				System.out.println(user[i]+" ");
			}
		}
	}

	public static int dartInit(){
		return (int)(Math.random()*10)+1;
	}
	public  static String scoreInit(){
		int scoreInit = (int)(Math.random()*3)+1;
		if(scoreInit == 1){
			return "S";
		}else if (scoreInit == 2){
			return "D";
		}else{
			return "T";
		}
	}
	public static String eventInit(){
		int eventInit = (int)(Math.random()*3)+1;
		if(eventInit == 1){
			return "*";
		}else if (eventInit == 2){
			return "#";
		}else{
			return " ";
		}
	}


}
