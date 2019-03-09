public class segitiga{
    public static void main(String[] args){
        float alas, tinggi, luas;
        int sisi, keliling;

        alas        = 5.0f;
        tinggi      = 7.0f;
        luas        = alas * tinggi * 0.5f;
        sisi        = 5;
        keliling    = sisi + sisi + sisi;

        System.out.println("\n----- Menghitung Luas Segitiga -----\n");
        System.out.println("Alas\t\t: "+alas);
        System.out.println("Tinggi\t\t: "+tinggi);
        System.out.println("Luas\t\t: "+luas);
        System.out.println("\n----- Menghitung Keliling Segitiga -----\n");
        System.out.println("Sisi\t\t: "+sisi);
        System.out.println("Keliling\t: "+keliling);
    }
}