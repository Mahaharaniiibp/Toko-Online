
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
public class Member implements User{
    
    private ArrayList<String> namaMember = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> saldo = new ArrayList<Integer>();
    
    public Member (){
        this.namaMember.add("Rani Penyabar");
        this.alamat.add("Tulungagung");
        this.telepon.add("123456");
        this.saldo.add(9900000);
        
        this.namaMember.add("Putri Cantik");
        this.alamat.add("Malang");
        this.telepon.add("128766");
        this.saldo.add(5500000);
        
        this.namaMember.add("Rain Baik Hati");
        this.alamat.add("Kediri");
        this.telepon.add("989765");
        this.saldo.add(6500000);
    }
    
    public void setSaldo (int saldo){
        this.saldo.add(saldo);  
    }
    
    public int getSaldo(int idMember){    
        return this.saldo.get(idMember);    
    }
    //untuk perubahan saldo member
    public void editSaldo (int saldo, int idMember){
        this.saldo.set(saldo, idMember);
    }
    //untuk mengetahui jml data arraylist nama member
    public int getJmlMember(){       
        return this.namaMember.size();       
    }

    @Override
    public void setNama(String namaMember) {
        this.namaMember.add(namaMember);
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNama(int idMember) {
        return this.namaMember.get(idMember);
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getAlamat(int idMember) {
        return this.alamat.get(idMember);
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTelepon(int idMember) {
        return this.telepon.get(idMember);
         //To change body of generated methods, choose Tools | Templates.
    }
    
}
