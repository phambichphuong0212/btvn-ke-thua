package com.bichphuong.bai2;

import java.util.Scanner;

public class SachThamKhao extends Sach {

    private double thue;
    private double thanhTien;

    public SachThamKhao() {
        super();
    }

    public SachThamKhao(double thue, double thanhTien) {
        this.thue = thue;
        this.thanhTien = thanhTien;
    }

    public SachThamKhao(int maSach, Date ngayNhap, double donGia, int soLuong, String nhaXuatBan, double thue, double thanhTien) {
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.thue = thue;
        this.thanhTien = thanhTien;
    }

    public double getThue() {
        return thue;
    }

    public void setThue(double thue) {
        this.thue = thue;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public void nhapSachThamKhao(){
        super.nhapSach();
        System.out.println("nhập thuế:");
        this.thue = new Scanner(System.in).nextDouble();
    }

    public void xuatSachThamKhao(){
        super.xuatSach();
        System.out.println("thuế:" + this.thue ) ;

    }

    public double thanhTien(){
        return thanhTien = getSoLuong() * getDonGia() + thue;
    }
}
