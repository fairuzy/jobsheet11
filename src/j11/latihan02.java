/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j11;
import java.util.Scanner;
/**
 *
 * @author Yusi Fayed
 */
public class latihan02 {
    private static void tampiljudul(String identitas){
        System.out.println("Identitas : "+ identitas);
        
        System.out.println("\nConvert Kalimat Alay Angka (Vokal ke Angka)\n");
        
    }
    
    public static void main(String[] args) {
        String identitas = "Fairuzy Al Fayed/ X RPL 2 / 12";
        tampiljudul(identitas);
        String kalimat = tampilInput();
        String convert = vocal2Angka(kalimat);
        tampilPerKata(kalimat, convert);
        tampilHasil(convert);
    }
      public static String tampilInput() {
        Scanner baca = new Scanner(System.in);
        
        System.out.println("Masukkan kalimat: ");
        String kalimat = baca.nextLine();
        System.out.println("KAlimat asli: " + kalimat);
        
        return kalimat;
    }    
        
    public static String vocal2Angka(String kalimat)
    {     char [][] arConvert = 
        {{'a','4'},{'i','1'},{'u','2'},{'e','3'},{'o','4'}};
        
        kalimat = kalimat.toLowerCase();
        for(int i = 0; i < arConvert.length; i++)
            kalimat.replace(arConvert[i][0], arConvert[i][1]);
        
        return kalimat;
        String convert = vocal2Angka(kalimat);
    }
      public static void tampilPerKata(String kalimat, String convert) {
        String[] arrKal = kalimat.split(" ");
        String[] arrCon = convert.split(" ");
        
        for(int i = 0; i < arrKal.length; i++) 
        {
            System.out.println(arrKal[i] + " => " + arrCon[i]);
            tampilPerkata(kalimat, convert);
        }
    }
    
        
    