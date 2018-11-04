/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Febri TK
 */
public class Mouse {
    private String namaMouse;
    private int hargaMouse;

    public Mouse() {
    }

    public String getNamaMouse() {
        return namaMouse;
    }

    public void setNamaMouse(String namaMouse) {
        this.namaMouse = namaMouse;
    }

    public int getHargaMouse() {
        return hargaMouse;
    }

    public void setHargaMouse(int hargaMouse) {
        this.hargaMouse = hargaMouse;
    }
    
    public String info(){
        String info="";
        info += "Nama Mouse: "+this.namaMouse+"\n";
        info += "Harga Mouse: "+this.hargaMouse+"\n";
        return info;
    }
}
