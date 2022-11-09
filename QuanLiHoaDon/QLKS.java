package QuanLiHoaDon;

import java.util.ArrayList;
import java.util.Scanner;

public class QLKS implements IChucNang{
    private ArrayList<HoaDon> list;
    Scanner sc = new Scanner(System.in);

    public QLKS(){
        list = new ArrayList<>();
    }

    public QLKS(ArrayList<HoaDon> list) {
        this.list = list;
    }

    @Override
    public void nhapHoaDonTheoNgay() {
        System.out.print("Nhap ma:    ");
        String ma = sc.nextLine();

        System.out.print("Nhap ngay san xuat:   ");
        String ngaySanXuat = sc.nextLine();

        System.out.print("Nhap ten khach hang:  ");
        String tenKhachHang = sc.nextLine();

        System.out.print("Nhap tien:  ");
        int tienThanhToan = sc.nextInt();

        System.out.print("Nhap so gio thue:    ");
        int soGioThue = sc.nextInt();

        list.add(new HoaDonGio(ma, ngaySanXuat, tenKhachHang, tienThanhToan, soGioThue));

        sc.nextLine(); 
    }

    @Override
    public void nhapHoaDonTheoGio() {
        System.out.print("Nhap ma:    ");
        String ma = sc.nextLine();

        System.out.print("Nhap ngay san xuat:   ");
        String ngaySanXuat = sc.nextLine();

        System.out.print("Nhap ten khach hang:  ");
        String tenKhachHang = sc.nextLine();

        System.out.println("Nhap tien:  ");
        int tienThanhToan = sc.nextInt();

        System.out.print("Nhap so ngay thue:    ");
        int soNgayThue = sc.nextInt();

        list.add(new HoaDonNgay(ma, ngaySanXuat, tenKhachHang, tienThanhToan, soNgayThue));

        sc.nextLine();

    }

    @Override
    public void xuatHoaDon() {
        for(int i = 0 ; i < list.size(); i ++){
            System.out.print(list.get(i).getMa()+" "+
                            list.get(i).getNgaySanXuat()+" "+ 
                            list.get(i).getTenKhachHang()+" "+
                            list.get(i).getTienThanhToan()+" ");

            if( list.get(i) instanceof HoaDonNgay ){
                HoaDonNgay hoaDonNgay = (HoaDonNgay) list.get(i);
                System.out.println(hoaDonNgay.getSoNgayThue());
            }
            else{
                HoaDonGio hoaDonGio = (HoaDonGio) list.get(i);
                System.out.println(hoaDonGio.getSoGioThue());
            }                  
        }
    }

    @Override
    public void luuFile() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void suaHoaDon() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void sapXepHoaDonTheoNgaySanXuat() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void tongTienTheoNam() {
        // TODO Auto-generated method stub
        
    }
    

}
