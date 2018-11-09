package com.bichphuong.bai2;

import java.util.Scanner;

public class Sach {

    private int maSach;
    private Date ngayNhap;
    private double donGia;
    private int soLuong;
    private String nhaXuatBan;

    public Sach() {
        this.ngayNhap = new Date();
    }

    public Sach(int maSach, Date ngayNhap, double donGia, int soLuong, String nhaXuatBan) {
        this.maSach = maSach;
        this.ngayNhap = ngayNhap;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.nhaXuatBan = nhaXuatBan;
    }

    public int getMaSach() {
        return maSach;
    }

    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
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

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public void nhapSach() {
        System.out.println("nhập vào mã sách:");
        this.maSach = new Scanner(System.in).nextInt();
        System.out.println("đơn giá:");
        this.donGia = new Scanner(System.in).nextDouble();
        System.out.println("số lượng:");
        this.soLuong = new Scanner(System.in).nextInt();
        System.out.println("nhà xuất bản:");
        this.nhaXuatBan = new Scanner(System.in).nextLine();
        System.out.println("ngày nhâp sách");
        ngayNhap.nhapDate();
    }

    public void xuatSach(){
        System.out.println("mã sách" + this.maSach);
        System.out.println("đơn giá:" + this.donGia);
        System.out.println("số lượng:" + this.donGia);
        System.out.println("nhà xuất bản:" + this.nhaXuatBan);
        ngayNhap.xuatDate();
    }
}
