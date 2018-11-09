package com.bichphuong.bai3;

import java.util.Scanner;

public class GiaoDich {
    private int maGiaoDich;
    private double donGia;
    private int soLuong;
    private Date ngayNhap;

    public GiaoDich() {
        this.ngayNhap = new Date();
    }


    public GiaoDich(int maGiaoDich, double donGia, int soLuong, Date ngayNhap) {
        this.maGiaoDich = maGiaoDich;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.ngayNhap = ngayNhap;
    }

    public int getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(int maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void nhapGiaoDich() {
        System.out.println("mã giao dịch:");
        this.maGiaoDich = new Scanner(System.in).nextInt();
        System.out.println("đơn giá:");
        this.donGia = new Scanner(System.in).nextDouble();
        System.out.println("số lượng:");
        this.soLuong = new Scanner(System.in).nextInt();
        ngayNhap.nhapDate();
    }

    public void xuatGiaoDich(){
        System.out.println("mã giao dich:");
        System.out.println("đơn giá:");
        System.out.println("số lượng:");
        ngayNhap.xuatDate();
        System.out.println(toString());
    }
}
