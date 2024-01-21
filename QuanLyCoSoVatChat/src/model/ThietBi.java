/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Phan Tien
 */
public class ThietBi {
    private String maThietBi;
    private String tenThietBi;
    private String maPhong;
    private int idLoaiTB;
    private Byte trangThai;

    public ThietBi() {
    }

    public ThietBi(String maThietBi, String tenThietBi, String maPhong, int idLoaiTB, Byte trangThai) {
        this.maThietBi = maThietBi;
        this.tenThietBi = tenThietBi;
        this.maPhong = maPhong;
        this.idLoaiTB = idLoaiTB;
        this.trangThai = trangThai;
    }

    public String getMaThietBi() {
        return maThietBi;
    }

    public void setMaThietBi(String maThietBi) {
        this.maThietBi = maThietBi;
    }

    public String getTenThietBi() {
        return tenThietBi;
    }

    public void setTenThietBi(String tenThietBi) {
        this.tenThietBi = tenThietBi;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public int getIdLoaiTB() {
        return idLoaiTB;
    }

    public void setIdLoaiTB(int idLoaiTB) {
        this.idLoaiTB = idLoaiTB;
    }

    public Byte getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Byte trangThai) {
        this.trangThai = trangThai;
    }
    
    
}
