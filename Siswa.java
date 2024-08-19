package TEST;

public class Siswa {
    int Id;
    String nama;
    double ipk;
    public int id;

    //Constructor
    public Siswa() {
        Id = 0;
        nama = "Kosong";
        ipk = 0.0;
        
    }

    //Getter
    //Setter
    //Method
    public void print() {
        System.out.println("ID : " + id);
        System.out.println("Nama : " + nama);
        System.out.println("IPK : " + ipk);

    }
}
