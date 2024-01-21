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
    private int idDKMuon;
    private Date ngayMuon;
    private int idLoaiTB;
    private String maSVMuon;

    public DangKyMuon() {
    }

    public DangKyMuon(int idDKMuon, Date ngayMuon, int idLoaiTB, String maSVMuon) {
        this.idDKMuon = idDKMuon;
        this.ngayMuon = ngayMuon;
        this.idLoaiTB = idLoaiTB;
        this.maSVMuon = maSVMuon;
    }

    public int getIdDKMuon() {
        return idDKMuon;
    }

    public void setIdDKMuon(int idDKMuon) {
        this.idDKMuon = idDKMuon;
    }

    public Date getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(Date ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public int getIdLoaiTB() {
        return idLoaiTB;
    }

    public void setIdLoaiTB(int idLoaiTB) {
        this.idLoaiTB = idLoaiTB;
    }

    public String getMaSVMuon() {
        return maSVMuon;
    }

    public void setMaSVMuon(String maSVMuon) {
        this.maSVMuon = maSVMuon;
    }
    
    
}
