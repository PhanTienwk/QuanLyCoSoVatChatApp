package model;

import java.util.Date;

public class Nguoi {
    private String hoTen;
    private Date ngSinh;
    private Byte gioiTinh;
    private String diaChi;
    private String email;

    public Nguoi() {
    }

    public Nguoi(String hoTen, Date ngSinh, Byte gioiTinh, String diaChi, String email) {
        this.hoTen = hoTen;
        this.ngSinh = ngSinh;
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

    public Date getNgSinh() {
        return ngSinh;
    }

    public void setNgSinh(Date ngSinh) {
        this.ngSinh = ngSinh;
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
