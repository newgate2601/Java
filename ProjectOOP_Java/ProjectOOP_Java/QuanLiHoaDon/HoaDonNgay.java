package QuanLiHoaDon;

public class HoaDonNgay extends HoaDon implements IHoaDon{
    private int soNgayThue;

    public HoaDonNgay(){}

    public HoaDonNgay(int soNgayThue) {
        this.soNgayThue = soNgayThue;
    }

    public HoaDonNgay(String ma, String ngaySanXuat, String tenKhachHang, int tienThanhToan, int soNgayThue) {
        super(ma, ngaySanXuat, tenKhachHang, tienThanhToan);
        this.soNgayThue = soNgayThue;
    }

    public int getSoNgayThue() {
        return soNgayThue;
    }

    public void setSoNgayThue(int soNgayThue) {
        this.soNgayThue = soNgayThue;
    }

    @Override
    public int getTienTT() {
        if(soNgayThue < 7){
            return 300*soNgayThue;
        }
        else{
            return (int)0.9*300*soNgayThue;
        }
    }

    

}
