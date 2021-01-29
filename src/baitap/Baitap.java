/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

import java.util.Scanner;

/**
 *
 * @author Thuc
 */
public class Baitap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap ho ten :");
        String hoTen = s.nextLine();
        System.err.println("Nhap diemTB: ");
        double diemTB = s.nextDouble();
        
        System.out.printf("SV: %s ; diemSV: %.2f \n" ,hoTen , diemTB);
        //bai2
        
        System.out.println("Nhap chieu dai : ");
        double chieuDai = s.nextDouble();
        System.out.println("Nhap chieu rong : ");
        double chieuRong = s.nextDouble();
        double dienTich = chieuDai * chieuRong ;
        double chuVi = (chieuDai + chieuRong)*2;
        double canhNho = Math.min(chieuDai,chieuRong);
        
        System.out.printf("Dien tich: %.2f ; Chu vi: %.2f ;Canh nho nhat: %.2f \n", dienTich ,chuVi ,canhNho);
        //bai3
        
        System.out.println("Nhap canh: ");
        double canh = s.nextDouble();
        double V = canh * canh * canh;
        
       System.out.printf("The tich: %.2f \n",V);
       //bai4
        
        System.out.println("Nhap a: ");
        int a = s.nextInt();
        System.out.println("Nhap b: ");
        int b = s.nextInt();
        System.out.println("Nhap c: ");
        int c = s.nextInt();
        
        float delta = b*b-4*a*c;
        float canDelta = (float)Math.sqrt(delta);
        System.out.printf("Delta : %.1f ; Can Delta : %.1f", delta,canDelta);
        // TODO code application logic here
    }
    
}
