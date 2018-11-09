package com.bichphuong.bai2;

import java.util.Scanner;

public class SachGiaoKhoa extends Sach {

    private int tinhTrangSach;
    private double thanhTien;

    public SachGiaoKhoa() {
        super();
    }

    public SachGiaoKhoa(int tinhTrangSach, double thanhTien) {
        this.tinhTrangSach = tinhTrangSach;
        this.thanhTien = thanhTien;
    }

    public SachGiaoKhoa(int maSach, Date ngayNhap, double donGia, int soLuong, String nhaXuatBan, int tinhTrangSach, double thanhTien) {
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.tinhTrangSach = tinhTrangSach;
        this.thanhTien = thanhTien;
    }

    public int getTinhTrangSach() {
        return tinhTrangSach;
    }

    public void setTinhTrangSach(int tinhTrangSach) {
        this.tinhTrangSach = tinhTrangSach;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public void nhapSachGiaoKhoa(){
        super.nhapSach();
        do {
            System.out.println("tình trạng sách:");
            this.tinhTrangSach = new Scanner(System.in).nextInt();
        }
        while(this.tinhTrangSach != 0 && this.tinhTrangSach !=1);
    }

    public void xuatSachGiaoKhoa(){
        super.xuatSach();
        System.out.println("tình trạng sach:" + this.tinhTrangSach);
    }

    public double thanhTien(){
        if(this.tinhTrangSach == 1)
            this.thanhTien = getSoLuong() * getDonGia();
        else
            this.thanhTien = getSoLuong() * getDonGia() * 0.5;
        return thanhTien;
    }

}
