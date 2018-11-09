package com.bichphuong.bai6;

import java.util.Scanner;

public class HoaDonTheoNgay extends HoaDon {

    private int soNgayThue;
    private double thanhTien;

    public HoaDonTheoNgay() {
        super();
    }

    public HoaDonTheoNgay(String maHoaDon, Date ngayHoaDon, String tenKhachHang, String maPhong, double donGia, int soNgayThue, double thanhTien) {
        super(maHoaDon, ngayHoaDon, tenKhachHang, maPhong, donGia);
        this.soNgayThue = soNgayThue;
        this.thanhTien = thanhTien;
    }

    public int getSoNgayThue() {
        return soNgayThue;
    }

    public void setSoNgayThue(int soNgayThue) {
        this.soNgayThue = soNgayThue;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public void nhapHDTN(){
        super.nhapHoaDon();
        System.out.println("số ngày thuê:");
        this.soNgayThue = new Scanner(System.in).nextInt();
    }

    public void xuatHDTN(){
        super.xuatHoaDon();
        System.out.println("số ngày thuê:" + this.soNgayThue);
    }

    public double thanhTienHDTN(){
        if(this.soNgayThue < 7)
            this.thanhTien = getSoNgayThue() * getDonGia();
        else
            this.thanhTien = getSoNgayThue() * getDonGia() * 0.2;
        return thanhTien;
    }
}
