package model;

import java.util.Date;


public class Nguoi {
    private String hoTen;
    private Date ngaySinh;
    private Byte gioiTinh;
    private String diaChi;
    private String email;

    public Nguoi() {
    }

    public Nguoi(String hoTen, Date ngaySinh, Byte gioiTinh, String diaChi, String email) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.email = email;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Byte getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Byte gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
