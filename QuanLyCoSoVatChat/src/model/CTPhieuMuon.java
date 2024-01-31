/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Phan Tien
 */
public class CTPhieuMuon {
    private int maPhieuMuon;
    private String maTBMuon;
    private int trangThai;

    public CTPhieuMuon() {
    }

    public CTPhieuMuon(int maPhieuMuon, String maTBMuon, int trangThai) {
        this.maPhieuMuon = maPhieuMuon;
        this.maTBMuon = maTBMuon;
        this.trangThai = trangThai;
    }

    public int getMaPhieuMuon() {
        return maPhieuMuon;
    }

    public void setMaPhieuMuon(int maPhieuMuon) {
        this.maPhieuMuon = maPhieuMuon;
    }

    public String getMaTBMuon() {
        return maTBMuon;
    }

    public void setMaTBMuon(String maTBMuon) {
        this.maTBMuon = maTBMuon;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
    
    
}
