package GUI;

public class Mahasiswa {
    private String nama;
    private String nim;

    public Mahasiswa() {
    }


    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {

        return nama;
    }

    public void setNama(String nama) {

        this.nama = nama;
    }

    public String getNim() {

        return nim;
    }

    public void setNim(String nim) {

        this.nim = nim;
    }

    public String JenjangPendidikan() {
        char JP = this.nim.charAt(0);
        if (JP == '1') {
            return "Jenjang Pendidikan = S1(Sarjana)";
        } else if (JP == '2') {
            return "Jenjang Pendidikan = S2(Magister)";
        } else {
            return JP == '3' ? "Jenjang Pendidikan = S3(Doktor)" : "Tidak ditemukan";
        }
    }

    public String TahunMasuk() {
        char TM1 = this.nim.charAt(1);
        char TM2 = this.nim.charAt(2);
        if (TM1 == '2' && TM2 == '0') {
            return "Tahun Masuk = 2020";
        } else if (TM1 == '2' && TM2 == '1') {
            return "Tahun Masuk = 2021";
        } else {
            return TM1 == '2' && TM2 == '2' ? "Tahun Masuk = 2022" : "Default";
        }
    }

    public String MenentukanFakultas() {
        char MK = this.nim.charAt(3);
        if (MK == '1') {
            return "Fakultas = Tarbiyah dan Keguruan";
        } else if (MK == '2') {
            return "Fakultas = Syari'ah dan Hukum";
        } else if (MK == '3') {
            return "Fakultas  = Ushuluddin";
        } else if (MK == '4') {
            return "Fakultas = Dakwah dan Komunikasi";
        } else if (MK == '5') {
            return "Fakultas = Sains dan Teknologi";
        } else if (MK == '6') {
            return "Fakultas = Psikologi";
        } else if (MK == '7') {
            return "Fakultas = Ekonomi dan Ilmu Sosial";
        } else {
            return MK == '8' ? "Fakultas = Pertanian dan Peternakan" : "Tidak ditemukan";
        }
    }

    public String MenentukanJurusan() {
        char MJ1 = this.nim.charAt(4);
        char MJ2 = this.nim.charAt(5);
        if (MJ1 == '0' && MJ2 == '1') {
            return "Jurusan = Teknik Informatika";
        } else if (MJ1 == '0' && MJ2 == '2') {
            return "Jurusan = Teknik Industri";
        } else if (MJ1 == '0' && MJ2 == '3') {
            return "Jurusan = Sistem Informasi";
        } else if (MJ1 == '0' && MJ2 == '4') {
            return "Jurusan = Matematika";
        } else {
            return MJ1 == '0' && MJ2 == '5' ? "Jurusan = Teknik Elektro" : "Tidak ditemukan";
        }
    }

    public String JenisKelamin() {
        char JK = this.nim.charAt(6);
        if (JK == '1') {
            return "Jenis Kelamin = Laki-laki";
        } else {
            return JK == '2' ? "Jenis Kelamin = Perempuan" : "Error";
        }
    }

    public String NomorUrutMahasiswa() {
        char NUM1 = this.nim.charAt(7);
        char NUM2 = this.nim.charAt(8);
        char NUM3 = this.nim.charAt(9);
        char NUM4 = this.nim.charAt(10);
        return "Nomor Urut Mahasiswa = " + NUM1 + NUM2 + NUM3 + NUM4;
    }
}


