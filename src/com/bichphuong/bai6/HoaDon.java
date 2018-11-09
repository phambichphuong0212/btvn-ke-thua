package com.bichphuong.bai6;

import java.util.Scanner;

public class HoaDon {

    private String maHoaDon;
    private Date ngayHoaDon;
    private String tenKhachHang;
    private String maPhong;
    private double donGia;

    public HoaDon() {
        this.ngayHoaDon = new Date();
    }

    public HoaDon(String maHoaDon, Date ngayHoaDon, String tenKhachHang, String maPhong, double donGia) {
        this.maHoaDon = maHoaDon;
        this.ngayHoaDon = ngayHoaDon;
        this.tenKhachHang = tenKhachHang;
        this.maPhong = maPhong;
        this.donGia = donGia;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public Date getNgayHoaDon() {
        return ngayHoaDon;
    }

    public void setNgayHoaDon(Date ngayHoaDon) {
        this.ngayHoaDon = ngayHoaDon;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public void nhapHoaDon(){
        System.out.println("mã hóa đơn:");
        this.maHoaDon = new Scanner(System.in).nextLine();
        System.out.println("tên khách hàng:");
        this.tenKhachHang = new  Scanner(System.in).nextLine();
        System.out.println("mã phòng:");
        this.maPhong = new Scanner(System.in).nextLine();
        System.out.println("đơn giá:");
        this.donGia = new Scanner(System.in).nextDouble();
        this.ngayHoaDon.nhapDate();
    }

    public void xuatHoaDon(){
        System.out.println("mã hóa đơn:" + this.maHoaDon);
        System.out.println("tên khách hàng:" + this.tenKhachHang);
        System.out.println("mã phòng:" + this.maPhong);
        System.out.println("đơn giá:" + this.donGia);
        this.ngayHoaDon.xuatDate();
    }
}

