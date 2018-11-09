package com.bichphuong.bai4;

public class TestBai4 {
    public static void main(String[] args) {
        QuanLyGiaoDich quanLyGiaoDich = new QuanLyGiaoDich(2,2);
        quanLyGiaoDich.nhapGDD();
        quanLyGiaoDich.nhapGGN();
        System.out.println("tổng giao dịch đát:");
        System.out.println(quanLyGiaoDich.tongGDD() );
        System.out.println("tổng giao dịch nhà:");
        System.out.println(quanLyGiaoDich.tongGDN());
        System.out.println("tổng trung bình giao dịch nhà:");
        System.out.println(quanLyGiaoDich.trungBinhThanhTienGDD());
    }
}
