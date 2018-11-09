package com.bichphuong.bai6;

public class TestBai6 {
    public static void main(String[] args) {
        QuanLyHoaDon quanLyHoaDon = new QuanLyHoaDon(2, 2);
        quanLyHoaDon.nhapHDTG();
        System.out.println("tổng tiền hóa đơn theo giờ:");
        System.out.println(quanLyHoaDon.tongTienHDTG());
        quanLyHoaDon.nhapHDTN();
        System.out.println("tổng tiền hóa đơn theo ngày:");
        System.out.println(quanLyHoaDon.tongTienHDTN());
    }
}
