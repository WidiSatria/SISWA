package TEST;
//Driver Class
public class SiswaTester {
    public static void main(String[] args) {
        //membuat Object
        //namaClass namaObject = new
        //Constructor();
        Siswa widi = new Siswa();
        Siswa felix = new Siswa();
        Siswa fadli = new Siswa();
        Siswa royyan = new Siswa();
        Siswa arka = new Siswa();
        Siswa natanz = new Siswa();

        widi.id = 34;
        widi.nama = "Widi";
        widi.ipk = 99.00;

        felix.id = 14;
        felix.nama = "Felix";
        felix.ipk = 88.99;

        fadli.id = 19;
        fadli.nama = "Fadli";
        fadli.ipk = 95.00;

        royyan.id = 1;
        royyan.nama = "Royyan";
        royyan.ipk = 82.85;

        arka.id = 17;
        arka.nama = "Arka";
        arka.ipk = 78.46;

        natanz.id = 27;
        natanz.nama = "Natanz";
        natanz.ipk = 99.90;

        widi.print();
        felix.print();
        fadli.print();
        royyan.print();
        arka.print();
        natanz.print();
    }
}
