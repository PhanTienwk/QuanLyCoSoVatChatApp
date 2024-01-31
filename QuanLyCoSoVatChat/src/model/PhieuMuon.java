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
public class PhieuMuon {
    private int maPhieuMuon;
    private Date ngayMuon;
    private String maPhong;
    private String maSVMuon;
    private String maNVXuat;

    public PhieuMuon() {
    }

    public PhieuMuon(int maPhieuMuon, Date ngayMuon, String maPhong, String maSVMuon, String maNVXuat) {
        this.maPhieuMuon = maPhieuMuon;
        this.ngayMuon = ngayMuon;
        this.maPhong = maPhong;
        this.maSVMuon = maSVMuon;
        this.maNVXuat = maNVXuat;
    }

    public int getMaPhieuMuon() {
        return maPhieuMuon;
    }

    public void setMaPhieuMuon(int maPhieuMuon) {
        this.maPhieuMuon = maPhieuMuon;
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

    public String getMaSVMuon() {
        return maSVMuon;
    }

    public void setMaSVMuon(String maSVMuon) {
        this.maSVMuon = maSVMuon;
    }

    public String getMaNVXuat() {
        return maNVXuat;
    }

    public void setMaNVXuat(String maNVXuat) {
        this.maNVXuat = maNVXuat;
    }
    
    
}
