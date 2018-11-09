package com.bichphuong.bai3;

public class TestBai3 {
    public static void main(String[] args) {
        QuanLyGiaoDich quanLyGiaoDich = new QuanLyGiaoDich(2,2);
//        quanLyGiaoDich.nhapLoaiVang();
//        System.out.println("tổng giao dịch vàng:");
//        System.out.println(quanLyGiaoDich.tongGiaoDichVang());
        quanLyGiaoDich.nhapTienTe();
        System.out.println("tổng giao dịch tiền tệ:");
        System.out.println(quanLyGiaoDich.tongGiaoDichTienTe());
        System.out.println("trung bình thành tiền giao dịch tiền tệ:");
        System.out.println(quanLyGiaoDich.trungBinhThanhTienGDTT());
    }
}
