import java.util.Scanner;
public class romanNumerals {
/* close enough
 * Could not make the code output numbers greater than 100 with different numbers in the tens and ones place
 *  :(
 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input your roman numeral.");
		int num = in.nextInt();
		int x= num; 
		while ( num > 0 ){
			num = num/10;
			romanDigit(num, "X", "L");
		}
		romanDigit(x, "I", "V");
	}
	
	public static String  romanDigit (int n , String one, String five){
		String digit = "";
		if ((n%10<5)&&(n%10>0)){
			for (int i = 0; i <= n%10; i++ ){
				System.out.print(one);
			}
		}else if (n%10 >= 5){
			System.out.print(five);
			for (int i = 1; i <= (n%10)-5; i++){
				System.out.print(one);
			}
		}
		return digit;
		
	}// input your return here;
}
