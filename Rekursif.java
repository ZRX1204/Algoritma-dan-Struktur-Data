/*Algoritma dan Struktur Data
Roihan Kusuma Wardana 20200040049*/

import java.util.Scanner;

public class Rekursif{
	public static void main(String[] args) {
		System.out.println("--------------------");
		System.out.println("      PILIH ");
		System.out.println("--------------------");
		Scanner input = new Scanner (System.in);
		
		int pil = 0;
		
		System.out.println("1. Pangkat");
		System.out.println("2. Deret Fibonaci");
		System.out.println("3. deret angka");
		System.out.println("4. Cetak Nama");
		System.out.println("Masukan [1-4]");
		pil = input.nextInt();
		
		switch (pil){
			case  1 :
				System.out.println("Masukan bilangan : ");
				int a = input.nextInt();
				System.out.println("Masukan pangkat : ");
				int b = input.nextInt();
				System.out.println(a+ " pangkat " +b +" = " +Math.pow(a, b));
				break;
			 
			case 2 :
				int f_n, f_n_1, f_n_2, n;
				System.out.println("Mengambil nilai fibonaci ke : ");
				n = input.nextInt();
				
				f_n_2 = 0;
				f_n_1 = 1;
				f_n = 1;
				
				for(int i=1; i<n; i++){
					System.out.println("Nilai ke- " +i + "adalah " + f_n);
					f_n = f_n_1 + f_n_2;
					f_n_2 = f_n_1;
					f_n_1 = f_n;
				}
				break;
				
			case 3 :
				for (int i = 0; i <= 100; i++) {
					System.out.print(i);
					System.out.println("");
				}
				break;
			case 4 :
				for (int i=0; i<100; i++) {
					System.out.println((i+1)+".Roihan Kusuma Wardana");
				}
				break;
			
		}
		

		
	}
}
