package com.bichphuong.bai5;

import java.util.Scanner;

public class KhachHangNuocNgoai extends HoaDonTienDien {

    private String quocTich;
    private double thanhTien;

    public KhachHangNuocNgoai() {
        super();
    }

    public KhachHangNuocNgoai(String maKhachHang, String hoTen, Date ngayRaHoaDon, int soLuong, double donGia, String quocTich, double thanhTien) {
        super(maKhachHang, hoTen, ngayRaHoaDon, soLuong, donGia);
        this.quocTich = quocTich;
        this.thanhTien = thanhTien;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public void nhapKHNN(){
        super.nhapHoaDon();
        System.out.println("quốc tịch:");
        this.quocTich = new Scanner(System.in).nextLine();
    }

    public void xuatKHNN(){
        super.xuatHoaDon();
        System.out.println("quốc tịch:" + this.quocTich);
        System.out.println("thành tiền" + this.thanhTien);
    }

    public double thanhTienKHNN(){
        return this.thanhTien = getSoLuong() * getDonGia();
    }


}
