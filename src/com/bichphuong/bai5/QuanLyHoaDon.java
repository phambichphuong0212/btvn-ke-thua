package com.bichphuong.bai5;

public class QuanLyHoaDon {

    private KhachHangVietnam[] khachHangVietnams;
    private KhachHangNuocNgoai[] khachHangNuocNgoais;
    int soLuongKHVN;
    int soLuongKHNN;
    int tongKHNN;
    int tongTBKHNN;

    public int getSoLuongKHVN() {
        return soLuongKHVN;
    }

    public void setSoLuongKHVN(int soLuongKHVN) {
        this.soLuongKHVN = soLuongKHVN;
    }

    public int getSoLuongKHNN() {
        return soLuongKHNN;
    }

    public void setSoLuongKHNN(int soLuongKHNN) {
        this.soLuongKHNN = soLuongKHNN;
    }

    public QuanLyHoaDon(int soLuongKHNN, int soLuongKHVN){
        this.soLuongKHVN = soLuongKHVN;
        this.soLuongKHNN = soLuongKHNN;
        this.khachHangVietnams = new KhachHangVietnam[this.soLuongKHVN];
        this.khachHangNuocNgoais = new KhachHangNuocNgoai[this.soLuongKHNN];
    }

    public void nhapKHVN(){
        for (int i = 0; i < this.soLuongKHVN ; i++) {
            this.khachHangVietnams[i] = new KhachHangVietnam();
            this.khachHangVietnams[i].nhapKHVN();
        }
    }

    public void xuatKHVN(){
        for (int i = 0; i < this.soLuongKHVN ; i++) {
            this.khachHangVietnams[i].xuatKHVN();
        }
    }

    public void nhapKHNN(){
        for (int i = 0; i < this.soLuongKHNN ; i++) {
            this.khachHangNuocNgoais[i] = new KhachHangNuocNgoai();
            this.khachHangNuocNgoais[i].nhapKHNN();
        }
    }

    public void xuatKHNN(){
        for (int i = 0; i < this.soLuongKHNN ; i++) {
            this.khachHangNuocNgoais[i].xuatKHNN();
        }
    }

    public double tongTienKHVN(){
        int tong = 0;
        for (int i = 0; i < this.soLuongKHVN ; i++) {
            tong += this.khachHangVietnams[i].thanhTienKHVN();
        }
        return tong;
    }

    public double tongTienKHNN(){
        for (int i = 0; i < this.soLuongKHNN ; i++) {
            this.tongKHNN += this.khachHangNuocNgoais[i].thanhTienKHNN();
        }
        return tongKHNN;
    }

    public double tongTBKHNN(){

         return this.tongTBKHNN = this.tongKHNN / this.soLuongKHNN ;
    }
}
