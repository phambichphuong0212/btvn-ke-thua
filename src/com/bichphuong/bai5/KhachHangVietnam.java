package com.bichphuong.bai5;

import java.util.Scanner;

public class KhachHangVietnam extends HoaDonTienDien{

    private String doiTuongKhachHang;
    private double dinhMuc;
    private double thanhTien;

    public KhachHangVietnam() {
        super();
    }

    public KhachHangVietnam(String maKhachHang, String hoTen, Date ngayRaHoaDon, int soLuong, double donGia, String doiTuongKhachHang, double dinhMuc, double thanhTien) {
        super(maKhachHang, hoTen, ngayRaHoaDon, soLuong, donGia);
        this.doiTuongKhachHang = doiTuongKhachHang;
        this.dinhMuc = dinhMuc;
        this.thanhTien = thanhTien;
    }

    public String getDoiTuongKhachHang() {
        return doiTuongKhachHang;
    }

    public void setDoiTuongKhachHang(String doiTuongKhachHang) {
        this.doiTuongKhachHang = doiTuongKhachHang;
    }

    public double getDinhMuc() {
        return dinhMuc;
    }

    public void setDinhMuc(double dinhMuc) {
        this.dinhMuc = dinhMuc;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public void nhapKHVN(){
        super.nhapHoaDon();
        System.out.println("đối tượng khách hàng:");
        this.doiTuongKhachHang = new Scanner(System.in).nextLine();
        System.out.println("định mức");
        this.dinhMuc = new Scanner(System.in).nextInt();
    }

    public void xuatKHVN(){
        super.xuatHoaDon();
        System.out.println("đối tượng khách hàng:" + this.doiTuongKhachHang);
        System.out.println("định mức:" + this.dinhMuc);
        System.out.println("thành tiền:" + this.thanhTien);
    }

    public double thanhTienKHVN(){
        if(this.getSoLuong() < this.dinhMuc)
            this.thanhTien = getSoLuong() * getDonGia() ;
        else
            this.thanhTien = getSoLuong() * getDonGia() * getDinhMuc() + getSoLuong() * getDonGia() * 2.5;
        return thanhTien;
    }
}
