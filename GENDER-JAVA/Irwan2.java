/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menentukanjeniskelamin;
import java.util.*;
import java.lang.Math;

public class Irwan2 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String GENDER;
        
        System.out.println("MENENTUKAN JENIS KELAMIN");
        System.out.println("MASUKKAN JENIS KELAMIN :");
        GENDER = input.nextLine();
        if (GENDER.equals("LAKI-LAKI")) {
            System.out.println("ANDA LAKI-LAKI");
        } else {
            if (GENDER.equals("PEREMPUAN")) {
                System.out.println("ANDA PEREMPUAN");
            } else {
                System.out.println("GENDER TIDAK DIKETAHUI");
            }
        }
    }
    
}