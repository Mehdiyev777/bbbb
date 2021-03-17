/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Haydar abi
 */
public class String1 {
    public static void main(String[] args) {
        String yazi = "Merhaba java!";
	
		System.out.println(yazi.length());
		
		System.out.println(yazi.charAt(0));
		System.out.println(yazi.charAt(12));
		 //System.out.println(yazi.charAt(13)); //
		
		String yazi2 = " java cok guzel";
		
		String yazi3 = yazi.concat(yazi2);
		System.out.println(yazi3);

		System.out.println(yazi + yazi2);
		
		System.out.println(yazi.toUpperCase());
		System.out.println(yazi.toLowerCase());
		
		yazi = "    \t\t\t\n     #22dkfj     dkjf       \t\t\n\\    ";
		
		System.out.println(yazi.trim());
		
		
		char ch = yazi.charAt(yazi.length() - 1);
		System.out.println(ch);
		
	}

}

    }
}
