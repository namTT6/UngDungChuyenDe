package vn.edu.tdc.fit.chuyende2.model;

public class danhMucSanPham {
    public danhMucSanPham(int id, int hinhAnh, String tenDanhMucSanPham) {
        this.id = id;
        this.hinhAnh = hinhAnh;
        this.tenDanhMucSanPham = tenDanhMucSanPham;
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

    public String getTenDanhMucSanPham() {
        return tenDanhMucSanPham;
    }

    public void setTenDanhMucSanPham(String tenDanhMucSanPham) {
        this.tenDanhMucSanPham = tenDanhMucSanPham;
    }

    private int id;
    private int hinhAnh;
    private String tenDanhMucSanPham;

}
