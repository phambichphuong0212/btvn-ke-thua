package com.bichphuong.bai4;

public class QuanLyGiaoDich {

    private GiaoDichNha[] giaoDichNhas;
    private GiaoDichDat[] giaoDichDats;
    int soLuongGDN;
    int soLuongGDD;
    int tongGDD;
    double tongTBGDD;

    public int getSoLuongGDN() {
        return soLuongGDN;
    }

    public void setSoLuongGDN(int soLuongGDN) {
        this.soLuongGDN = soLuongGDN;
    }

    public int getSoLuongGDD() {
        return soLuongGDD;
    }

    public void setSoLuongGDD(int soLuongGDD) {
        this.soLuongGDD = soLuongGDD;
    }

    public QuanLyGiaoDich(int soLuongGDN, int soLuongGDD){
        this.soLuongGDN = soLuongGDN;
        this.soLuongGDD = soLuongGDD;
        this.giaoDichNhas = new GiaoDichNha[this.soLuongGDN];
        this.giaoDichDats = new GiaoDichDat[this.soLuongGDD];
    }

    public void nhapGGN(){
        for (int i = 0; i < this.soLuongGDN ; i++) {
            giaoDichNhas[i] = new GiaoDichNha();
            giaoDichNhas[i].nhapGDN();
        }
    }

    public void xuatGDN(){
        for (int i = 0; i < this.soLuongGDN ; i++) {
            giaoDichNhas[i].xuatGDN();
        }
    }

    public void nhapGDD(){
        for (int i = 0; i < this.soLuongGDD ; i++) {
            giaoDichDats[i] = new GiaoDichDat();
            giaoDichDats[i].nhapGiaoDichDat();
        }
    }

    public void xuatGDD(){
        for (int i = 0; i <this.soLuongGDD ; i++) {
            this.giaoDichDats[i].xuatGiaoDichDat();
        }
    }

    public double tongGDN(){
        int tong = 0;
        for (int i = 0; i < this.soLuongGDN ; i++) {
            tong += this.giaoDichNhas[i].thanhTienGDN();
        }
        return tong;
    }

    public double tongGDD(){
        for (int i = 0; i < this.soLuongGDN ; i++) {
            this.tongGDD += this.giaoDichDats[i].thanhTienGDD();
        }
        return tongGDD;
    }

    public double trungBinhThanhTienGDD(){
        return tongTBGDD += this.tongGDD / this.soLuongGDD;
    }
}
