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
public class DangKyMuon {
    private int maDangKy;
    private Date ngayMuon;
    private String maPhong;
    private int idLoaiThietBi;
    private String maSVMuon;

    public DangKyMuon() {
    }

    public DangKyMuon(int maDangKy, Date ngayMuon, String maPhong, int idLoaiThietBi, String maSVMuon) {
        this.maDangKy = maDangKy;
        this.ngayMuon = ngayMuon;
        this.maPhong = maPhong;
        this.idLoaiThietBi = idLoaiThietBi;
        this.maSVMuon = maSVMuon;
    }

    public int getMaDangKy() {
        return maDangKy;
    }

    public void setMaDangKy(int maDangKy) {
        this.maDangKy = maDangKy;
    }

    public Date getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(Date ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public int getIdLoaiThietBi() {
        return idLoaiThietBi;
    }

    public void setIdLoaiThietBi(int idLoaiThietBi) {
        this.idLoaiThietBi = idLoaiThietBi;
    }

    public String getMaSVMuon() {
        return maSVMuon;
    }

    public void setMaSVMuon(String maSVMuon) {
        this.maSVMuon = maSVMuon;
    }
    
}
