package com.bichphuong.bai5;

import java.util.Scanner;

public class Date {
    private int ngay;
    private int thang;
    private int nam;

    public Date() {
    }

    public Date(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public void nhapDate(){
        System.out.println("ngày:");
        this.ngay = new Scanner(System.in).nextInt();
        System.out.println("tháng:");
        this.thang = new Scanner(System.in).nextInt();
        System.out.println("năm:");
        this.nam = new Scanner(System.in).nextInt();
    }

    public void xuatDate(){
        System.out.println("ngày:" + this.ngay);
        System.out.println("tháng:" + this.thang);
        System.out.println("năm:" + this.nam);
    }
}
