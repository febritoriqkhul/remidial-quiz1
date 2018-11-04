/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Febri TK
 */
public class Monitor {
    private String namaMonitor;
    private int hargaMonitor;
    private Cpu cpu;
    private Mouse mouse;
    private Keyboard keyboard;

    public Monitor() {
    }

    public String getNamaMonitor() {
        return namaMonitor;
    }

    public void setNamaMonitor(String namaMonitor) {
        this.namaMonitor = namaMonitor;
    }

    public int getHargaMonitor() {
        return hargaMonitor;
    }

    public void setHargaMonitor(int hargaMonitor) {
        this.hargaMonitor = hargaMonitor;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }
    
    public int setTotalHarga(){
        int total = cpu.getHargaCPU()+mouse.getHargaMouse()+keyboard.getHargaKeyboard()+hargaMonitor;
        return total;
    }
    
    public String info(){
        String info="";
        info += "Nama Monitor: "+this.namaMonitor+"\n";
        info += "Harga Monitor: "+this.hargaMonitor+"\n";
        info += this.cpu.info();
        info += this.mouse.info();
        info += this.keyboard.info();
        info += "Total Harga: "+this.setTotalHarga()+"\n";
        return info;
    }
}
