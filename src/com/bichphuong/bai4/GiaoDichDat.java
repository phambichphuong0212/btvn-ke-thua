package com.bichphuong.bai4;

import java.util.Scanner;

public class GiaoDichDat extends GiaoDichNhaDat {

    private int  loaiDat;
    private double thanhTien;

    public GiaoDichDat() {
        super();
    }

    public GiaoDichDat(String maGiaoDich, Date ngayGiaoDich, double donGia, double dienTich, int loaiDat, double thanhTien) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiDat = loaiDat;
        this.thanhTien = thanhTien;
    }

    public int getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(int loaiDat) {
        this.loaiDat = loaiDat;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public void nhapGiaoDichDat() {
        super.nhapGiaoDich();
        do {
            System.out.println("loai dat :");
            this.loaiDat = new Scanner(System.in).nextInt();
        }
        while (this.loaiDat != 0 && this.loaiDat != 1);
    }

    public void xuatGiaoDichDat() {
        super.xuatGiaoDich();
        System.out.println("loại đất:" + this.loaiDat);
        System.out.println("thành tiền " + this.thanhTien);
    }

    public double thanhTienGDD() {
        if (this.loaiDat == 1)
            this.thanhTien = getDienTich() * getDonGia() * 1.5;
        else
            this.thanhTien = getDienTich() * getDonGia();
        return thanhTien;
    }
}

