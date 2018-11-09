package com.bichphuong.bai3;

public class QuanLyGiaoDich {
    private GiaoDichTienTe[] giaoDichTienTes;
    private GiaoDichVang[] giaoDichVangs;
    int soLuongLoaiVang;
    int soLuongTienTe;
    private double tongTT;
    private double tongTBTT;

    public QuanLyGiaoDich(int soLuongLoaiVang, int soLuongTienTe){
        this.soLuongLoaiVang = soLuongLoaiVang;
        this.soLuongTienTe = soLuongTienTe;
        this.giaoDichTienTes = new GiaoDichTienTe[this.soLuongTienTe];
        this.giaoDichVangs = new GiaoDichVang[this.soLuongLoaiVang];
    }

    public void nhapLoaiVang(){
        for (int i = 0; i < this.soLuongLoaiVang ; i++) {
            this.giaoDichVangs[i] = new GiaoDichVang();
            this.giaoDichVangs[i].nhapLoaiVang();
        }
    }

    public void xuatLoaiVang(){
        for (int i = 0; i < this.soLuongTienTe ; i++) {
            this.giaoDichVangs[i].xuatLoaiVang();
        }
    }

    public void nhapTienTe(){
        for (int i = 0; i < this.soLuongTienTe ; i++) {
            this.giaoDichTienTes[i] = new GiaoDichTienTe();
            this.giaoDichTienTes[i].nhapGiaoDichTienTe();
        }
    }

    public void xuatTienTe(){
        for (int i = 0; i < this.soLuongTienTe ; i++) {
            this.giaoDichTienTes[i].xuatGiaoDichTienTe();
        }
    }

    public double tongGiaoDichVang(){
        int tong = 0;
        for (int i = 0; i < this.soLuongLoaiVang ; i++) {
            tong += this.giaoDichVangs[i].thanhTienGDV();
        }
        return tong;
    }

    public double tongGiaoDichTienTe(){

        for (int i = 0; i < this.soLuongTienTe ; i++) {
            this.tongTT += this.giaoDichTienTes[i].thanhTienGDTT();
        }
        return this.tongTT;
    }

    public double trungBinhThanhTienGDTT(){
        return this.tongTBTT+= this.tongTT / this.soLuongTienTe;
    }

    public boolean xuatGiaoDichVangLonHon1Ty(){
        for (int i = 0; i < this.soLuongLoaiVang ; i++) {
            if(this.giaoDichVangs[i].getDonGia() > 1000000000);
                this.giaoDichVangs[i].getDonGia();
                return true;
        }
        return false;
    }

    public boolean xuatGiaoDichTienTeLonHon1Ty(){
        for (int i = 0; i < this.soLuongTienTe ; i++) {
            if (this.giaoDichTienTes[i].getDonGia() > 1000000000);
                this.giaoDichTienTes[i].getDonGia();
                return true;
        }
        return false;
    }
}
