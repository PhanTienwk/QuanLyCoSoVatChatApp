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
public class SinhVien extends Nguoi{
    private String maSinhVien;

    public SinhVien() {
    }

    public SinhVien(String maSinhVien, String hoTen, Date ngSinh, Byte gioiTinh, String diaChi, String email) {
        super(hoTen, ngSinh, gioiTinh, diaChi, email);
        this.maSinhVien = maSinhVien;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    
    
    
}
