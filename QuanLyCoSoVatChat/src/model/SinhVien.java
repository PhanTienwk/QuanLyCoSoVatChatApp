package model;

import java.util.Date;

public class SinhVien extends Nguoi{
    private String maSinhVien;

    public SinhVien() {
    }

    public SinhVien(String maSinhVien, String hoTen, Date ngaySinh, Byte gioiTinh, String diaChi, String email) {
        super(hoTen, ngaySinh, gioiTinh, diaChi, email);
        this.maSinhVien = maSinhVien;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }
    
    
}
