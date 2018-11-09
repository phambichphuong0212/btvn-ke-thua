package com.bichphuong.bai4;

import java.util.Scanner;

public class GiaoDichNhaDat {

    private String maGiaoDich;
    private Date ngayGiaoDich;
    private double donGia;
    private double dienTich;

    public GiaoDichNhaDat() {
        this.ngayGiaoDich = new Date();
    }

    public GiaoDichNhaDat(String maGiaoDich, Date ngayGiaoDich, double donGia, double dienTich) {
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }

    public String getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public Date getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(Date ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public void nhapGiaoDich(){
        System.out.println("mã giao dịch:");
        this.maGiaoDich = new Scanner(System.in).nextLine();
        System.out.println("đơn giá:");
        this.donGia = new Scanner(System.in).nextDouble();
        System.out.println("diện tích:");
        this.dienTich = new  Scanner(System.in).nextDouble();
        ngayGiaoDich.nhapDate();
    }

    public void xuatGiaoDich(){
        System.out.println("mã giao dịch:" + this.maGiaoDich);
        System.out.println("đơn giá :" + this.donGia);
        System.out.println("diện tích:" + this.dienTich);
        ngayGiaoDich.xuatDate();
    }
}
