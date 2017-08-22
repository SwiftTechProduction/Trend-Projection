/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trendprojection;

import java.util.Scanner;

/**
 *
 * @author Lukas
 */
public class TrendProjection 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        //Inisialisasi Periode Waktu
        double alpha = 0.2;
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Harga Mei 2015 (Minggu Pertama): ");
        int x1 = 1; //periode waktu pertama
        int y1 = scanner.nextInt();
        
        int x1kuadrat = x1*x1;
        int x1y1 = x1*y1;
        
        System.out.print("Masukkan Harga Mei 2015 (Minggu Ketiga): ");
        int x2 = 2; //periode waktu kedua
        int y2 = scanner.nextInt();
        
        int x2kuadrat = x2*x2;
        int x2y2 = x2*y2;
        
        System.out.print("Masukkan Harga Juni 2015 (Minggu Pertama): ");
        int x3 = 3;
        int y3 = scanner.nextInt();
        
        int x3kuadrat = x3*x3;
        int x3y3 = x3*y3;
        
        System.out.print("Masukkan Harga Juni 2015 (Minggu Ketiga): ");
        int x4 = 4;
        int y4 = scanner.nextInt();
        
        int x4kuadrat = x4*x4;
        int x4y4 = x4*y4;
        
        System.out.print("Masukkan Harga Juli 2015 (Minggu Pertama): ");
        int x5 = 5;
        int y5 = scanner.nextInt();
        
        int x5kuadrat = x5*x5;
        int x5y5 = x5*y5;

        System.out.print("Masukkan Harga Juli 2015 (Minggu Ketiga): ");
        int x6 = 6;
        int y6 = scanner.nextInt();
        
        int x6kuadrat = x6*x6;
        int x6y6 = x6*y6;
        
        System.out.print("Masukkan Harga Agustus 2015 (Minggu Pertama): ");
        int x7 = 7;
        int y7 = scanner.nextInt();
        
        int x7kuadrat = x7*x7;
        int x7y7 = x7*y7;
        
        System.out.print("Masukkan Harga Agustus 2015 (Minggu Ketiga): ");
        int x8 = 8;
        int y8 = scanner.nextInt();
        
        int x8kuadrat = x8*x8;
        int x8y8 = x8*y8;
        
        System.out.print("Masukkan Harga September 2015 (Minggu Pertama): ");
        int x9 = 9;
        int y9 = scanner.nextInt();
        
        int x9kuadrat = x9*x9;
        int x9y9 = x9*y9;
        
        System.out.print("Masukkan Harga September 2015 (Minggu Ketiga): ");
        int x10 = 10;
        int y10 = scanner.nextInt();
        
        int x10kuadrat = x10*x10;
        int x10y10 = x10*y10;
        
        System.out.print("Masukkan Harga Oktober 2015 (Minggu Pertama): ");
        int x11 = 11;
        int y11 = scanner.nextInt();
        
        int x11kuadrat = x11*x11;
        int x11y11 = x11*y11;
        
        System.out.print("Masukkan Harga Oktober 2015 (Minggu Ketiga): ");
        int x12 = 12;
        int y12 = scanner.nextInt();
        
        int x12kuadrat = x12*x12;
        int x12y12 = x12*y12;
        
        System.out.print("Masukkan Harga November 2015 (Minggu Pertama): ");
        int x13 = 13;
        int y13 = scanner.nextInt();
        
        int x13kuadrat = x13*x13;
        int x13y13 = x13*y13;
        
        System.out.print("Masukkan Harga November 2015 (Minggu Ketiga): ");
        int x14 = 14;
        int y14 = scanner.nextInt();
        
        int x14kuadrat = x14*x14;
        int x14y14 = x14*y14;
        
        System.out.print("Masukkan Harga Desember 2015 (Minggu Pertama): ");
        int x15 = 15;
        int y15 = scanner.nextInt();
        
        int x15kuadrat = x15*x15;
        int x15y15 = x15*y15;
        
        System.out.print("Masukkan Harga Desember 2015 (Minggu Ketiga): ");
        int x16 = 16;
        int y16 = scanner.nextInt();
        
        int x16kuadrat = x16*x16;
        int x16y16 = x16*y16;
        
        System.out.print("Masukkan Harga Januari 2016 (Minggu Pertama): ");
        int x17 = 17;
        int y17 = scanner.nextInt();
        
        int x17kuadrat = x17*x17;
        int x17y17 = x17*y17;
        
        System.out.print("Masukkan Harga Januari 2016 (Minggu Ketiga): ");
        int x18 = 18;
        int y18 = scanner.nextInt();
        
        int x18kuadrat = x18*x18;
        int x18y18 = x18*y18;
        
        System.out.print("Masukkan Harga Februari 2016 (Minggu Pertama): ");
        int x19 = 19;
        int y19 = scanner.nextInt();
        
        int x19kuadrat = x19*x19;
        int x19y19 = x19*y19;
        
        System.out.print("Masukkan Harga Februari 2016 (Minggu Ketiga): ");
        int x20 = 20;
        int y20 = scanner.nextInt();
        
        int x20kuadrat = x20*x20;
        int x20y20 = x20*y20;
        
        System.out.print("Masukkan Harga Maret 2016 (Minggu Pertama): ");
        int x21 = 21;
        int y21 = scanner.nextInt();
        
        int x21kuadrat = x21*x21;
        int x21y21 = x21*y21;
        
        System.out.print("Masukkan Harga Maret 2016 (Minggu Ketiga): ");
        int x22 = 22;
        int y22 = scanner.nextInt();
        
        int x22kuadrat = x22*x22;
        int x22y22 = x22*y22;
        
        System.out.print("Masukkan Harga April 2016 (Minggu Pertama): ");
        int x23 = 23;
        int y23 = scanner.nextInt();
        
        int x23kuadrat = x23*x23;
        int x23y23 = x23*y23;
        
        System.out.print("Masukkan Harga April 2016 (Minggu Ketiga): ");
        int x24 = 24;
        int y24 = scanner.nextInt();
        
        int x24kuadrat = x24*x24;
        int x24y24 = x24*y24;
        
        System.out.print("Masukkan Harga Mei 2016 (Minggu Pertama): ");
        int x25 = 25;
        int y25 = scanner.nextInt();
        
        int x25kuadrat = x25*x25;
        int x25y25 = x25*y25;
        
        System.out.print("Masukkan Harga Mei 2016 (Minggu Ketiga): ");
        int x26 = 26;
        int y26 = scanner.nextInt();
        
        int x26kuadrat = x26*x26;
        int x26y26 = x26*y26;
        
        int jumlahx = x1 + x2 + x3 + x4 + x5 + x6 + x7 + x8 + x9 + x10 + x11 + x12 + x13 + x14 + x15 + x16 + x17 + x18 + x19 + x20 + x21 + x22 + x23 + x24 + x25 + x26;
        int jumlahy = y1 + y2 + y3 + y4 + y5 + y6 + y7 + y8 + y9 + y10 + y11 + y12 + y13 + y14 + y15 + y16 + y17 + y18 + y19 + y20 + y21 + y22 + y23 + y24 + y25 + y26;
        
        int jumlahkuadrat = x1kuadrat + x2kuadrat + x3kuadrat + x4kuadrat + x5kuadrat + x6kuadrat + x7kuadrat + x8kuadrat + x9kuadrat + x10kuadrat + x11kuadrat + x12kuadrat + x13kuadrat + x14kuadrat + x15kuadrat + x16kuadrat + x17kuadrat + x18kuadrat + x19kuadrat + x20kuadrat + x21kuadrat + x22kuadrat + x23kuadrat + x24kuadrat + x25kuadrat + x26kuadrat;

        int jumlahxy = x1y1 + x2y2 + x3y3 + x4y4 + x5y5 + x6y6 + x7y7 + x8y8 + x9y9 + x10y10 + x11y11 + x12y12 + x13y13 + x14y14 + x15y15 + x16y16 + x17y17 + x18y18 + x19y19 + x20y20 + x21y21 + x22y22 + x23y23 + x24y24 + x25y25 + x26y26;
        
        int n = 26; //jumlah data 
        int rata2x = jumlahx/n;
        int rata2y = jumlahy/n;
        
        int b = (jumlahxy - (n * jumlahx * jumlahy)) / (jumlahkuadrat - (n * rata2x * rata2x));
        int a = rata2y - (b*rata2x);

        int y = a + b*27; //27 itu periode waktu pada bulan berikut nya
        
        System.out.println(y);
    }
}
