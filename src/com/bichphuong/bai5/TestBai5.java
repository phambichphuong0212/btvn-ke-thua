package com.bichphuong.bai5;

public class TestBai5 {
    public static void main(String[] args) {
        QuanLyHoaDon quanLyHoaDon = new QuanLyHoaDon(2,2);
        quanLyHoaDon.nhapKHNN();
        quanLyHoaDon.nhapKHVN();
        System.out.println("tổng tiền khách hàng nước ngoài");
        System.out.println(quanLyHoaDon.tongTienKHNN());
        System.out.println("tổng tiền khách hàng việt nam:");
        System.out.println(quanLyHoaDon.tongTienKHVN());
        System.out.println("tổng  trung bình tiền khách nước ngoài: ");
        System.out.println(quanLyHoaDon.tongTBKHNN());

    }
}
