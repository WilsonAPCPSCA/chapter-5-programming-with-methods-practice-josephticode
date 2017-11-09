import java.util.Scanner;
	public class timeEnglish {

		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			System.out.println("Input the current hour.");
			int hours = in.nextInt();
			System.out.println("Input the time in minutes.");
			int minutes = in.nextInt();
			System.out.println(getTimeName(hours,minutes));
		}
		
		public static String getTimeName (int hours, int minutes){
			String wordHours = " ";
			String time = " ";
			if (hours == 1){
				 wordHours = "One";
			}else if (hours == 2){
				 wordHours = "Two";
			}else if (hours == 3){
				 wordHours = "Three";
			}else if (hours == 4){
				 wordHours = "Four";
			}else if (hours == 5){
				 wordHours = "Five";
			}else if (hours == 6){
				 wordHours = "Six";
			}else if (hours == 7){
				 wordHours = "Seven";
			}else if (hours == 8){
				 wordHours = "Eight";
			}else if (hours == 9){
				 wordHours = "Nine";
			}else if (hours == 10){
				 wordHours = "Ten";
			}else if (hours == 11){
				 wordHours = "Eleven";
			}else if (hours == 12){
				 wordHours = "Twelve";
			}
			
			
			if (minutes == 00){
				time = wordHours + " O'Clock";
			}else if (minutes == 15){
				time = "Quarter past " + wordHours;
			}else if (minutes == 30){
				time = "Half past " + wordHours;
			}else if (minutes == 45 && hours != 12){
				hours++;
				if (hours == 1){
					 wordHours = "One";
				}else if (hours == 2){
					 wordHours = "Two";
				}else if (hours == 3){
					 wordHours = "Three";
				}else if (hours == 4){
					 wordHours = "Four";
				}else if (hours == 5){
					 wordHours = "Five";
				}else if (hours == 6){
					 wordHours = "Six";
				}else if (hours == 7){
					 wordHours = "Seven";
				}else if (hours == 8){
					 wordHours = "Eight";
				}else if (hours == 9){
					 wordHours = "Nine";
				}else if (hours == 10){
					 wordHours = "Ten";
				}else if (hours == 11){
					 wordHours = "Eleven";
				}else if (hours == 12){
					 wordHours = "Twelve";
				}
				time = "Quarter till " + wordHours;
			}else {
				time = wordHours + " and " + minutes + " minutes.";
			}return time;
		} 
	}

