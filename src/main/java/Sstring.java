/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Haydar abi
 */
public class Sstring {
    public static void main(String[] args) {
        String yazi = "benim ismim sadi evren seker";
        int ilkbosluk = yazi.indexOf("seker");
        System.out.println(yazi.toUpperCase());
        System.out.println(ilkbosluk);
        String ilkelime = yazi.substring(ilkbosluk);
        System.out.println(ilkelime);
      int sonbosluk = yazi.lastIndexOf("i ");
        System.out.println(sonbosluk);
        String sonkelime = yazi.substring(22);
        System.out.println(sonkelime);
        char ch = yazi.charAt(10);
        System.out.println(ch);
        System.out.println(yazi.length());
        System.out.println(yazi.indexOf("sadi", 5));
        System.out.println(yazi.lastIndexOf("ismim", 20));
        System.out.println(yazi.startsWith("be"));
        System.out.println(yazi.endsWith("r"));
        System.out.println(yazi.contains("evren"));
        System.out.println(yazi.contains("z"));
     
    }
}
