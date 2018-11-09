package com.bichphuong.bai2;

public class TestBai2 {
    public static void main(String[] args) {
        QuanLySach quanLySach = new QuanLySach(1,2);
        quanLySach.nhapSGK();
        System.out.println("tổng tiền sách giáo khoa:");
        System.out.println(quanLySach.tongTienSGK());
        quanLySach.nhapSTK();
        System.out.println("tổng tiền sách tham khảo:" );
        System.out.println(quanLySach.tongTienSTK());
        System.out.println("tổng tiền trung bình sách tham khảo:");
        System.out.println(quanLySach.trungBinhCongDonGiaSTK());
        System.out.println(quanLySach.xuatRaSGK());
    }
}
