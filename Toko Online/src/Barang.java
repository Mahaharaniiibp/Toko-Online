
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Barang {
    private ArrayList<String> namaBarang = new ArrayList<String>();
    private ArrayList<Integer> stok = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    
    Barang(){
        this.namaBarang.add("Baju");
        this.stok.add(50);
        this.harga.add(150000);
        
        this.namaBarang.add("celana");
        this.stok.add(50);
        this.harga.add(100000);
        
        this.namaBarang.add("topi");
        this.stok.add(50);
        this.harga.add(30000);
        
        this.namaBarang.add("kaos");
        this.stok.add(50);
        this.harga.add(120000);
        
        this.namaBarang.add("pita");
        this.stok.add(50);
        this.harga.add(90000);
    }
    public void setNamaBarang (String namaBarang){
        this.namaBarang.add(namaBarang);
    }
    public String getNamaBarang (int idBarang){
        return this.namaBarang.get(idBarang);
    }
    public void setStok (int stok){
        this.stok.add(stok);
    }
    public int getStok (int idBarang){
        return this.stok.get(idBarang);
    }    
    public void setHarga (int harga){
        this.harga.add(harga);
    }
    public int getHarga (int idBarang){
        return this.harga.get(idBarang);
    }   
    //jml baranga : int

    public int getJmlBarang(){
        return this.namaBarang.size(); 
    }
    
    public void editStok(int idBarang,int stok){
        this.stok.add(idBarang, stok);
}
}
