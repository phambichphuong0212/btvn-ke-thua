package com.bichphuong.bai3;

import java.util.Scanner;

public class GiaoDichTienTe extends GiaoDich {
    private double tiGia;
    private int loaiTienTe;
    private double thanhTien;

    public GiaoDichTienTe() {
        super();
    }

    public GiaoDichTienTe(int maGiaoDich, double donGia, int soLuong, Date ngayNhap, double tiGia, int loaiTienTe, double thanhTien) {
        super(maGiaoDich, donGia, soLuong, ngayNhap);
        this.tiGia = tiGia;
        this.loaiTienTe = loaiTienTe;
        this.thanhTien = thanhTien;
    }

    public double getTiGia() {

        return tiGia;
    }

    public void setTiGia(double tiGia) {
        this.tiGia = tiGia;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {

        this.thanhTien = thanhTien;
    }

    public int getLoaiTienTe() {
        return loaiTienTe;
    }

    public void setLoaiTienTe(int loaiTienTe) {
        this.loaiTienTe = loaiTienTe;
    }


    public void nhapGiaoDichTienTe() {
        super.nhapGiaoDich();
        do {
            System.out.println("tỉ gia:");
            this.tiGia = new Scanner(System.in).nextDouble();
        }
        while (this.tiGia != 0 && this.tiGia != 1);{
        }
    }

    public void xuatGiaoDichTienTe() {
        super.xuatGiaoDich();
        System.out.println("tỉ giá:" + this.tiGia);
    }

    public double thanhTienGDTT() {
        if (this.tiGia == 0)
            this.thanhTien = getSoLuong() * getDonGia() * getTiGia();
        else
            this.thanhTien = getSoLuong() * getDonGia();
        return thanhTien;
    }

}
