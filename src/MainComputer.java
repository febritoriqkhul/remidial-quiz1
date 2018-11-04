/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Febri TK
 */
public class MainComputer {
    public static void main(String[] args) {
        Cpu cpu = new Cpu();
        cpu.setNamaCPU("Digital Alliance");
        cpu.setHargaCPU(6000000);
        
        Mouse mouse = new Mouse();
        mouse.setNamaMouse("Logitech");
        mouse.setHargaMouse(300000);
        
        Keyboard keyboard = new Keyboard();
        keyboard.setNamaKeyboard("Rexus K9D");
        keyboard.setHargaKeyboard(200000);
        
        Monitor monitor = new Monitor();
        monitor.setNamaMonitor("LED ASUS VS228DE");
        monitor.setHargaMonitor(1850000);
        
        monitor.setCpu(cpu);
        monitor.setMouse(mouse);
        monitor.setKeyboard(keyboard);
        System.out.println(monitor.info());
    }
}
