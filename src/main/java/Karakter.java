import java.util.Scanner;
public class Karakter {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
     char ch = input.next().charAt(0);
		
		
		if ('A' <= ch && ch <= 'Z') {
			System.out.println(ch + " buyuk harf");
		} else if ('a' <= ch && ch <= 'z')
			System.out.println(ch + " kucuk harf");
		else if ('0' <= ch && ch <= '9')
			System.out.println(ch + " rakam");
	}

        
    
}
