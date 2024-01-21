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
public class MuonTB {
    private int idPhieuMuon;
    private Date ngayMuon;
    private String maTBMuon;
    private String maSVMuon;
    private String maNVXuat;
    private Byte trangThai;

    public MuonTB() {
    }

    public MuonTB(int idPhieuMuon, Date ngayMuon, String maTBMuon, String maSVMuon, String maNVXuat, Byte trangThai) {
        this.idPhieuMuon = idPhieuMuon;
        this.ngayMuon = ngayMuon;
        this.maTBMuon = maTBMuon;
        this.maSVMuon = maSVMuon;
        this.maNVXuat = maNVXuat;
        this.trangThai = trangThai;
    }

    public Date getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(Date ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    

    public int getIdPhieuMuon() {
        return idPhieuMuon;
    }

    public void setIdPhieuMuon(int idPhieuMuon) {
        this.idPhieuMuon = idPhieuMuon;
    }

    public String getMaTBMuon() {
        return maTBMuon;
    }

    public void setMaTBMuon(String maTBMuon) {
        this.maTBMuon = maTBMuon;
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

    public Byte getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Byte trangThai) {
        this.trangThai = trangThai;
    }
    
    
}
