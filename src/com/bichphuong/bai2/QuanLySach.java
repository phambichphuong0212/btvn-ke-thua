package com.bichphuong.bai2;

public class QuanLySach {

    private SachGiaoKhoa[] sachGiaoKhoas;
    private SachThamKhao[] sachThamKhaos;
    int soLuongSGK;
    int soLuongSTK;
    int tongSTK;
    double tongTBSTK;

    public int getSoLuongSGK() {
        return soLuongSGK;
    }

    public void setSoLuongSGK(int soLuongSGK) {
        this.soLuongSGK = soLuongSGK;
    }

    public int getSoLuongSTK() {
        return soLuongSTK;
    }

    public void setSoLuongSTK(int soLuongSTK) {
        this.soLuongSTK = soLuongSTK;
    }

    public QuanLySach(int soLuongSGK, int soLuongSTK){
        this.soLuongSGK = soLuongSGK;
        this.soLuongSTK = soLuongSTK;
        this.sachGiaoKhoas = new SachGiaoKhoa[this.soLuongSGK];
        this.sachThamKhaos = new SachThamKhao[this.soLuongSTK];
    }

    public void nhapSGK(){
        for (int i = 0; i < this.soLuongSGK ; i++) {
            this.sachGiaoKhoas[i] = new SachGiaoKhoa();
            this.sachGiaoKhoas[i].nhapSachGiaoKhoa();
        }
    }

    public void xuatSGK(){
        for (int i = 0; i < this.soLuongSGK ; i++) {
            this.sachGiaoKhoas[i].xuatSachGiaoKhoa();
        }
    }

    public void nhapSTK(){
        for (int i = 0; i < this.soLuongSTK ; i++) {
            this.sachThamKhaos[i] = new SachThamKhao();
            this.sachThamKhaos[i].nhapSachThamKhao();
        }
    }

    public void xuatSTK(){
        for (int i = 0; i < this.soLuongSTK ; i++) {
            this.sachThamKhaos[i].xuatSachThamKhao();
        }
    }

    public double tongTienSGK(){
        int tong = 0;
        for (int i = 0; i < this.soLuongSGK ; i++) {
            tong += this.sachGiaoKhoas[i].thanhTien();
        }
        return tong;
    }

    public double tongTienSTK(){
        for (int i = 0; i < this.soLuongSGK ; i++) {
            this.tongSTK += this.sachGiaoKhoas[i].thanhTien();
        }
        return this.tongSTK;
    }

    public double trungBinhCongDonGiaSTK(){

       return this.tongTBSTK += this.tongSTK / this.soLuongSTK;

    }

    public boolean xuatRaSGK(){
        for (int i = 0; i < this.soLuongSGK ; i++) {
            if(sachGiaoKhoas[i].getNhaXuatBan().equals("X"));
            this.sachGiaoKhoas[i].xuatSachGiaoKhoa();
            return true;
        }
        return false;
    }

}
