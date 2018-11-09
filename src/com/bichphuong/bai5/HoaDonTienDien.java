package com.bichphuong.bai5;

import java.util.Scanner;

public class HoaDonTienDien {
    private String maKhachHang;
    private String hoTen;
    private Date ngayRaHoaDon;
    private int soLuong;
    private double donGia;

    public HoaDonTienDien() {
        this.ngayRaHoaDon = new Date();
    }

    public HoaDonTienDien(String maKhachHang, String hoTen, Date ngayRaHoaDon, int soLuong, double donGia) {
        this.maKhachHang = maKhachHang;
        this.hoTen = hoTen;
        this.ngayRaHoaDon = ngayRaHoaDon;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgayRaHoaDon() {
        return ngayRaHoaDon;
    }

    public void setNgayRaHoaDon(Date ngayRaHoaDon) {
        this.ngayRaHoaDon = ngayRaHoaDon;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public void nhapHoaDon(){
        System.out.println("mã khách hàng:");
        this.maKhachHang = new Scanner(System.in).nextLine();
        System.out.println("họ tên:");
        this.hoTen = new Scanner(System.in).nextLine();
        System.out.println("số lượng:");
        this.soLuong = new Scanner(System.in).nextInt();
        System.out.println("đơn giá:");
        this.donGia = new Scanner(System.in).nextDouble();
        this.ngayRaHoaDon.nhapDate();
    }

    public void xuatHoaDon(){
        System.out.println("mã khách hàng:" + this.maKhachHang);
        System.out.println("họ tên :" + this.hoTen);
        System.out.println("số lượng:" + this.soLuong);
        System.out.println("đơn giá:" + this.donGia);
        this.ngayRaHoaDon.xuatDate();
    }
}
