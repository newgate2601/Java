package QuanLiHoaDon;

import java.util.Scanner;

public class HDClient {
    
    public static void main(String[] args) {
            QLKS q = new QLKS();

        Scanner sc = new Scanner(System.in);

    
    while(true){
        System.out.println("1.nhap hoa don theo ngay");
        System.out.println("2.nhap hoa don theo gio");
        System.out.println("3.hien thi");
        System.out.println("4.luu vao file");
        System.out.println("5.sua hoa don theo ngay");
        System.out.println("6.sap xep hoa don theo ngay xuat");
        System.out.println("7.dua ra so tien cac hoa don theo nam");

        System.out.println("0.thoat");
        System.out.print("Moi chon tu 0-7:    ");
        
        int chon;
        chon = Integer.parseInt(sc.nextLine());
        
        switch(chon){
            case 0:
                System.out.println("bye");
                System.exit(0);
                break;
                
            case 1:
                q.nhapHoaDonTheoNgay();
                break;
                
            case 2:
                q.nhapHoaDonTheoGio();
                break;
                
            case 3:
                q.xuatHoaDon();
                break;
                
            case 5:
                q.suaHoaDon();
                break;
                
            case 6:
                q.sapXepHoaDonTheoNgaySanXuat();
                break;
                
            case 7:
                q.tongTienTheoNam();
                break;
                       
        }
        }
        
    }
}


