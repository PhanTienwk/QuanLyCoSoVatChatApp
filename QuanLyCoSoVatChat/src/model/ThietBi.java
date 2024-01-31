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
    private int trangThai;
    private Byte thuocTinh;

    public ThietBi() {
    }

    public ThietBi(String maThietBi, String tenThietBi, String maPhong, int idLoaiTB, int trangThai, Byte thuocTinh) {
        this.maThietBi = maThietBi;
        this.tenThietBi = tenThietBi;
        this.maPhong = maPhong;
        this.idLoaiTB = idLoaiTB;
        this.trangThai = trangThai;
        this.thuocTinh = thuocTinh;
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

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public Byte getThuocTinh() {
        return thuocTinh;
    }

    public void setThuocTinh(Byte thuocTinh) {
        this.thuocTinh = thuocTinh;
    }
    
}
