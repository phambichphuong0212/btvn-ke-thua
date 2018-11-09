package com.bichphuong.bai3;

import java.util.Scanner;

public class GiaoDichVang extends GiaoDich {

    private String loaiVang;
    private double thanhTien;

    public GiaoDichVang() {
        super();
    }

    public GiaoDichVang(int maGiaoDich, double donGia, int soLuong, Date ngayNhap, String loaiVang, double thanhTien) {
        super(maGiaoDich, donGia, soLuong, ngayNhap);
        this.loaiVang = loaiVang;
        this.thanhTien = thanhTien;
    }

    public String getLoaiVang() {

        return loaiVang;
    }

    public void setLoaiVang(String loaiVang) {

        this.loaiVang = loaiVang;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    private double thanhTienGiaoDichVang(){
        return thanhTien = getSoLuong() * getDonGia();
    }
    public void nhapLoaiVang() {
        super.nhapGiaoDich();
        System.out.println("loại vàng:");
        this.loaiVang = new Scanner(System.in).nextLine();
    }

    public void xuatLoaiVang(){
        super.xuatGiaoDich();
        System.out.println("loại vàng:" + this.loaiVang);
    }

    public double thanhTienGDV(){
        return thanhTien = getSoLuong() * getDonGia();
    }
}
