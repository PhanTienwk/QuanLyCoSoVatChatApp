/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Phan Tien
 */
public class Phong {
    private String maPhong;
    private String tenPhong;
    private String dayPhong;

    public Phong() {
    }

    public Phong(String maPhong, String tenPhong, String dayPhong) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.dayPhong = dayPhong;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public String getDayPhong() {
        return dayPhong;
    }

    public void setDayPhong(String dayPhong) {
        this.dayPhong = dayPhong;
    }
    
    
}
