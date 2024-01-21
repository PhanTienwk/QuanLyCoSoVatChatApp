package model;

import java.util.Date;

public class NhanVien extends Nguoi{
    private String maNhanVien;
    private Byte chucVu;

    public NhanVien(String maNhanVien, String hoTen, Date ngSinh, Byte gioiTinh, String diaChi, String email, Byte chucVu) {
        super(hoTen, ngSinh, gioiTinh, diaChi, email);
        this.maNhanVien = maNhanVien;
        this.chucVu = chucVu;
    }

    public NhanVien() {
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public Byte getChucVu() {
        return chucVu;
    }

    public void setChucVu(Byte chucVu) {
        this.chucVu = chucVu;
    }
    
    
}
