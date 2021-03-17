/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Haydar abi
 */
public class StringlernKiyaslanmasi {
    public static void main(String[] args) {
        String str1 = "merhaba java";
		String str2 = "    MerHAba java    \n\t"; 
                boolean b = str1.equalsIgnoreCase(str2.trim());
                if(b) {
                    System.out.println("IKI string esit"); }
                    else {
                            System.out.println("esit degil");
                }
                str1 = "jave";
                str2 = " java";
                int muqayise = str1.compareTo(str2);
                System.out.println(muqayise);
                if (muqayise == 0) {
                    System.out.println("esit");
                }
                else if (muqayise > 0) {
                    System.out.println("st1 str2 debn buyuk");}
                else {
                    System.out.println("st1 str2 debn kucuk");
                    
                }
                str1 = "WELCOME be aMERICA";
                str2 = "aMERICA";
               System.out.println(str1.startsWith("WEL"));
                System.out.println(str1.endsWith(str2));
                System.out.println(str1.contains("de"));
    }
}
