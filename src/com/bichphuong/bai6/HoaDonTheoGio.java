package com.bichphuong.bai6;

import java.util.Scanner;

public class HoaDonTheoGio extends HoaDon {

    private double soGioThue;
    private double thanhTien;

    public HoaDonTheoGio() {
        super();
    }

    public HoaDonTheoGio(String maHoaDon, Date ngayHoaDon, String tenKhachHang, String maPhong, double donGia, double soGioThue, double thanhTien) {
        super(maHoaDon, ngayHoaDon, tenKhachHang, maPhong, donGia);
        this.soGioThue = soGioThue;
        this.thanhTien = thanhTien;
    }

    public double getSoGioThue() {
        return soGioThue;
    }

    public void setSoGioThue(double soGioThue) {
        this.soGioThue = soGioThue;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public void nhapHDTG(){
        super.nhapHoaDon();
        System.out.println("số giờ thuê:");
        this.soGioThue = new Scanner(System.in).nextDouble();
    }

    public void XuatHDTG(){
        super.xuatHoaDon();
        System.out.println("số giờ:" + this.soGioThue);
        System.out.println("thành tiền:" + this.thanhTien);
    }

    public double thanhTienHDTG(){
        if(this.soGioThue < 30){
            this.thanhTien = getSoGioThue() * getDonGia();
    }
    return thanhTien;
}
}
