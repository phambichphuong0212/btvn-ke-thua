package com.bichphuong.bai4;

import java.util.Scanner;

public class GiaoDichNha extends GiaoDichNhaDat {

    private int loaiNha;
    private String diaChi;
    private double thanhTien;

    public GiaoDichNha() {
        super();
    }

    public GiaoDichNha(String maGiaoDich, Date ngayGiaoDich, double donGia, double dienTich, int loaiNha, String diaChi, double thanhTien) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
        this.thanhTien = thanhTien;
    }

    public int getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(int loaiNha) {
        this.loaiNha = loaiNha;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public void nhapGDN(){
        super.nhapGiaoDich();
        do {
            System.out.println("loại nhà:");
            this.loaiNha = new Scanner(System.in).nextInt();
        }
        while (this.loaiNha == 1 && this.loaiNha == 0);
        System.out.println("địa chỉ:");
        this.diaChi = new Scanner(System.in).nextLine();
    }

    public void xuatGDN(){
        super.xuatGiaoDich();
        System.out.println("loại nhà:" + this.loaiNha);
        System.out.println("địa chỉ:" + this.diaChi);
    }

    public double thanhTienGDN(){
        if(this.loaiNha == 1)
            this.thanhTien = getDienTich() * getDonGia();
        else
            this.thanhTien = getThanhTien() * getDonGia() * 0.9;
        return thanhTien;
    }
}
