/*
 * Tugas Algoritma dan Struktur Data
 * Roihan Kusuma Wardana (20200040049)
 */

public class HotelAmaris {

    public static void main(String[] args) {
        String Kamar [][] = {
        {"1", "2", "3", "4", "X"},
        {"1", "2", "3", "4", "5"},
        {"1", "2", "3", "4", "5"},
        {"1", "2", "3", "X", "5"},
    };
    int KamarKosong = 0;
    for(int j=0; j<Kamar.length; j++){
        for(int i=0; i<Kamar[j].length; i++){
            if (Kamar[j][i].equals("X")){
                System.out.println("Tamu berada dilantai " + (j+1) + " kamar " + (i+1));
            }else{
                KamarKosong += 1;
            }
        }
    }
        System.out.println("***************************************");
        System.out.println("Jumlah kamar yang tersedia " + KamarKosong);
}
}
