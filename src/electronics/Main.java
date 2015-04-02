/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package electronics;

/**
 *
 * @author neliloghmani
 */
public class Main {
    

public static void main(String []args){

Electronics cell = new cellPhone(4.55,649,11,"Apple", "Cellular Device");
Electronics comp = new Computer(12.52,2000,176,"Apple", "Desktop Computer");
Electronics pag = new pager(0.3,120,70,"Motorolla", "Pager");
Electronics digitalCamera = new digital(15.3,400,120,"Cannon", "Digital Camera");
System.out.print(cell.toString());
System.out.print(comp.toString());
System.out.print(pag.toString());
System.out.print(digitalCamera.toString());

}
}
