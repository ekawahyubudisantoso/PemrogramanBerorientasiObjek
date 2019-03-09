public class lingkaran{
    public static void main(String[] args){
        float phi, luas, keliling;
        int jari, diameter;

        phi         = 3.14f;
        jari        = 5;
        luas        = phi * jari * jari;
        diameter    = jari + jari;
        keliling    = phi * diameter;

        System.out.println("\n----- Menghitung Luas Lingkaran -----\n");
        System.out.println("Phi\t\t: "+phi);
        System.out.println("Jari-jari\t: "+jari);
        System.out.println("Luas\t\t: "+luas);
        System.out.println("\n----- Menghitung Keliling Lingkaran -----\n");
        System.out.println("Jari-jari\t: "+jari);
        System.out.println("Diameter\t: "+diameter);
        System.out.println("keliling\t: "+keliling);
    }
}