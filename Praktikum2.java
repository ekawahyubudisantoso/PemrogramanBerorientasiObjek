class Mobil{
    String warna;
    int tahunProduksi;
}

public class Praktikum2{
    public static void main(String[] args){
        String nim, nama;
        int ntgs, nuts, nuas;
        double pntgs, pnuts, pnuas, na;
        
        nim     = "A11.2017.10707";
        nama    = "Galuh Ajeng Prameswari";
        ntgs    = 80;
        nuts    = 90;
        nuas    = 87;
        pntgs   = 0.2 * ntgs;
        pnuts   = 0.35 * nuts;
        pnuas   = 0.45 * nuas;
        na      = pntgs + pnuts + pnuas;

        Mobil avanza = new Mobil();

        avanza.warna = "Hitam";
        avanza.tahunProduksi = 2006;

        System.out.println("");
        System.out.println("----- Tugas 1 -----");
        System.out.println("");
        System.out.println("Warna           : "+avanza.warna);
        System.out.println("Tahun Produksi  : "+avanza.tahunProduksi);
        System.out.println("");
        System.out.println("----- Tugas 2 -----");
        System.out.println("");
        System.out.println("NIM         : "+nim);
        System.out.println("Nama        : "+nama);
        System.out.println("Nilai Tugas : "+ntgs+" 20% "+pntgs);
        System.out.println("Nilai UTS   : "+nuts+" 35% "+pnuts);
        System.out.println("Nilai UAS   : "+nuas+" 45% "+pnuas);
        System.out.println("Nilai Akhir : "+na);
        System.out.println("");
    }
}