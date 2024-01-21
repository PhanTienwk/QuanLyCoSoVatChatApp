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
    private String loaiThietBi;

    public LoaiThietBi() {
    }

    public LoaiThietBi(int idLoaiTB, String loaiThietBi) {
        this.idLoaiTB = idLoaiTB;
        this.loaiThietBi = loaiThietBi;
    }

    public int getIdLoaiTB() {
        return idLoaiTB;
    }

    public void setIdLoaiTB(int idLoaiTB) {
        this.idLoaiTB = idLoaiTB;
    }

    public String getLoaiThietBi() {
        return loaiThietBi;
    }

    public void setLoaiThietBi(String loaiThietBi) {
        this.loaiThietBi = loaiThietBi;
    }
    
    
    
}
