package com.example.test;

public class DataPdf {
    private int pdf, menu;
    private String mota;

    public DataPdf(int pdf, int menu, String mota) {
        this.pdf = pdf;
        this.menu = menu;
        this.mota = mota;
    }

    public int getPdf() {
        return pdf;
    }

    public void setPdf(int pdf) {
        this.pdf = pdf;
    }

    public int getMenu() {
        return menu;
    }

    public void setMenu(int menu) {
        this.menu = menu;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
}
