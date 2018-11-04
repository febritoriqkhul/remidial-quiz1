/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Febri TK
 */
public class Keyboard {
    private String namaKeyboard;
    private int hargaKeyboard;
    
    public Keyboard() {
    }

    public String getNamaKeyboard() {
        return namaKeyboard;
    }

    public void setNamaKeyboard(String namaKeyboard) {
        this.namaKeyboard = namaKeyboard;
    }

    public int getHargaKeyboard() {
        return hargaKeyboard;
    }

    public void setHargaKeyboard(int hargaKeyboard) {
        this.hargaKeyboard = hargaKeyboard;
    }
    
    public String info(){
        String info="";
        info += "Nama Keyboard: "+this.namaKeyboard+"\n";
        info += "Harga Keyboard: "+this.hargaKeyboard+"\n";
        return info;
    }
}
