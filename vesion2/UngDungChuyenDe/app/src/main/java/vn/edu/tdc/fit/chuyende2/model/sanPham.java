package vn.edu.tdc.fit.chuyende2.model;

import java.io.Serializable;

public class sanPham implements Serializable{
    public sanPham(int id, int hinhAnh, String tenSanPham, String giaTien, String moTa, int idSanPham) {
        this.id = id;
        this.hinhAnh = hinhAnh;
        this.tenSanPham = tenSanPham;
        this.giaTien = giaTien;
        this.moTa = moTa;
        this.idSanPham = idSanPham;
    }

    public sanPham() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(int hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(String giaTien) {
        this.giaTien = giaTien;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(int idSanPham) {
        this.idSanPham = idSanPham;
    }

    int id;
    int hinhAnh;
    String tenSanPham;
    String giaTien;
    String moTa;
    int idSanPham;


}
