/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author ADMIN
 */
public class TaiKhoan {
    private String tendangnhap;
    private String matkhau;
    
    public TaiKhoan(){
        
    }

    public TaiKhoan(String tendangnhap, String matkhau) {
        this.tendangnhap = tendangnhap;
        this.matkhau = matkhau;
    }

    public String getTendangnhap() {
        return tendangnhap;
    }

    public void setTendangnhap(String tandangnhap) {
        this.tendangnhap = tandangnhap;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    @Override
    public String toString() {
        return "TaiKhoan{" + "tandangnhap=" + tendangnhap + ", matkhau=" + matkhau + '}';
    }
    
}
