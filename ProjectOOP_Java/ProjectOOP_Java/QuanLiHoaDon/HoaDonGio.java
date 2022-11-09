package QuanLiHoaDon;

public class HoaDonGio extends HoaDon implements IHoaDon{
    private int soGioThue;

    public HoaDonGio(){};

    public HoaDonGio(int soGioThue) {
        this.soGioThue = soGioThue;
    }

    public HoaDonGio(String ma, String ngaySanXuat, String tenKhachHang, int tienThanhToan, int soGioThue) {
        super(ma, ngaySanXuat, tenKhachHang, tienThanhToan);
        this.soGioThue = soGioThue;
    }

    public int getSoGioThue() {
        return soGioThue;
    }

    public void setSoGioThue(int soGioThue) {
        this.soGioThue = soGioThue;
    }

    @Override
    public int getTienTT() {
        if(soGioThue < 5){
            return 50*soGioThue;
        }
        else{
            return (int)0.7*50*soGioThue;
        }
    }

    
    

}
