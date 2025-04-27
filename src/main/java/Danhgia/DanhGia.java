package Danhgia;

public class DanhGia {
    public static String diemChu(double diem) {
        if (diem < 0 || diem > 10) return "diem khong hop le";
        if (diem >= 8.5) return "A";
        else if (diem >= 8.0) return "B+";
        else if (diem >= 7.0) return "B";
        else if (diem >= 6.5) return "C+";
        else if (diem >= 5.5) return "C";
        else if (diem >= 5.0) return "D+";
        else if (diem >= 4.0) return "D";
        else return "F";
    }

    public static String xepHangTN(double diem) {
        if (diem < 0 || diem > 10) return "diem khong hop le";
        if (diem >= 9.0) return "xuat sac";
        else if (diem >= 8.0) return "gioi";
        else if (diem >= 6.5) return "kha";
        else return "trung binh";
    }
}