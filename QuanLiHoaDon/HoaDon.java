package QuanLiHoaDon;

public class HoaDon {
    private String ma;
    private String ngaySanXuat;
    private String tenKhachHang;
    private int tienThanhToan;

    public HoaDon(){}
    
    public HoaDon(String ma, String ngaySanXuat, String tenKhachHang, int tienThanhToan) {
        this.ma = ma;
        this.ngaySanXuat = ngaySanXuat;
        this.tenKhachHang = tenKhachHang;
        this.tienThanhToan = tienThanhToan;
    }

    public String getMa() {
        return ma;
    }
    public void setMa(String ma) {
        this.ma = ma;
    }
    public String getNgaySanXuat() {
        return ngaySanXuat;
    }
    public void setNgaySanXuat(String ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }
    public String getTenKhachHang() {
        return tenKhachHang;
    }
    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }
    public int getTienThanhToan() {
        return tienThanhToan;
    }
    public void setTienThanhToan(int tienThanhToan) {
        this.tienThanhToan = tienThanhToan;
    }

    

}
