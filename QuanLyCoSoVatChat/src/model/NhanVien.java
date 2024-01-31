/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Phan Tien
 */
public class NhanVien extends Nguoi{
    private String maNhanVien;
    private Byte chucVu;

    public NhanVien(String maNhanVien, String hoTen, Date ngaySinh, Byte gioiTinh, String diaChi, String email,Byte chucVu) {
        super(hoTen, ngaySinh, gioiTinh, diaChi, email);
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
