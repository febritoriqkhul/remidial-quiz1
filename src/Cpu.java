/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Febri TK
 */
public class Cpu {
    private String namaCPU;
    private int hargaCPU;
    
    public Cpu() {
    }

    public String getNamaCPU() {
        return namaCPU;
    }

    public void setNamaCPU(String namaCPU) {
        this.namaCPU = namaCPU;
    }

    public int getHargaCPU() {
        return hargaCPU;
    }

    public void setHargaCPU(int hargaCPU) {
        this.hargaCPU = hargaCPU;
    }
    
    public String info(){
        String info="";
        info += "Nama CPU: "+this.namaCPU+"\n";
        info += "Harga CPU: "+this.hargaCPU+"\n";
        return info;
    }
}
