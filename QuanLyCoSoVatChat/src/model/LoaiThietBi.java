/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Phan Tien
 */
public class LoaiThietBi {
    private int idLoaiTB;
    private String loaiTB;

    public LoaiThietBi() {
    }

    public LoaiThietBi(int idLoaiTB, String loaiTB) {
        this.idLoaiTB = idLoaiTB;
        this.loaiTB = loaiTB;
    }

    public int getIdLoaiTB() {
        return idLoaiTB;
    }

    public void setIdLoaiTB(int idLoaiTB) {
        this.idLoaiTB = idLoaiTB;
    }

    public String getLoaiTB() {
        return loaiTB;
    }

    public void setLoaiTB(String loaiTB) {
        this.loaiTB = loaiTB;
    }
    
    
    
}
