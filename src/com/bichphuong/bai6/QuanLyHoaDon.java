package com.bichphuong.bai6;

public class QuanLyHoaDon {

    private HoaDonTheoGio[] hoaDonTheoGios;
    private HoaDonTheoNgay[] hoaDonTheoNgays;
    int soLuongHDTG;
    int soLuongHDTN;

    public int getSoLuongHDTG() {
        return soLuongHDTG;
    }

    public void setSoLuongHDTG(int soLuongHDTG) {
        this.soLuongHDTG = soLuongHDTG;
    }

    public int getSoLuongHDTN() {
        return soLuongHDTN;
    }

    public void setSoLuongHDTN(int soLuongHDTN) {
        this.soLuongHDTN = soLuongHDTN;
    }

    public QuanLyHoaDon(int soLuongHDTG, int soLuongHDTN){
        this.soLuongHDTG = soLuongHDTG;
        this.soLuongHDTN = soLuongHDTN;
        this.hoaDonTheoGios = new HoaDonTheoGio[this.soLuongHDTG];
        this.hoaDonTheoNgays = new HoaDonTheoNgay[this.soLuongHDTN];
    }

    public void nhapHDTG(){
        for (int i = 0; i < this.soLuongHDTG ; i++) {
            this.hoaDonTheoGios[i] = new HoaDonTheoGio();
            this.hoaDonTheoGios[i].nhapHDTG();
        }
    }

    public void xuatHDTG(){
        for (int i = 0; i < this.soLuongHDTG ; i++) {
            this.hoaDonTheoGios[i].XuatHDTG();
        }
    }

    public void nhapHDTN(){
        for (int i = 0; i < this.soLuongHDTN ; i++) {
            this.hoaDonTheoNgays[i] = new HoaDonTheoNgay();
            this.hoaDonTheoNgays[i].nhapHDTN();
        }
    }

    public void xuatHDTN(){
        for (int i = 0; i < this.soLuongHDTN ; i++) {
            this.hoaDonTheoNgays[i].xuatHDTN();
        }
    }

    public double tongTienHDTG(){
        int tong = 0 ;
        for (int i = 0; i < this.soLuongHDTG ; i++) {
            tong += this.hoaDonTheoGios[i].thanhTienHDTG();
        }
        return tong;
    }

    public double tongTienHDTN(){
        int tong = 0;
        for (int i = 0; i < this.soLuongHDTN ; i++) {
            tong += this.hoaDonTheoNgays[i].thanhTienHDTN();
        }
        return tong;
    }


}




