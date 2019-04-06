package vn.edu.tdc.fit.chuyende2.model;

import java.io.Serializable;

public class gioHang implements Serializable{
    public gioHang() {

    }
    public gioHang(int idsp, String tensp, long gia, int hinhAnh, int soLuong, String kichthuoc) {
        this.idsp = idsp;
        this.tensp = tensp;
        this.gia = gia;
        this.hinhAnh = hinhAnh;
        this.soLuong = soLuong;
        this.kichthuoc = kichthuoc;
    }

    public int getIdsp() {
        return idsp;
    }

    public void setIdsp(int idsp) {
        this.idsp = idsp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public long getGia() {
        return gia;
    }

    public void setGia(long gia) {
        this.gia = gia;
    }

    public int getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(int hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getKichthuoc() {
        return kichthuoc;
    }

    public void setKichthuoc(String kichthuoc) {
        this.kichthuoc = kichthuoc;
    }

    private int idsp;
    private String tensp;
    private long gia;
    private int hinhAnh;
    private int soLuong;
    private String kichthuoc;

    @Override
    public String toString() {
        return "\n ID: " + idsp + "\n Tên sản phẩm: " + tensp + "\n Giá sản phẩm: " + gia + "\n Hình ảnh: " + hinhAnh + "\n Số lượng: " + soLuong + "Kích thước: \n" + kichthuoc;
    }
}
