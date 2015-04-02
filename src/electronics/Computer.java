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
public class Computer extends Electronics {
   
    public Computer(double productWeight, int productCost, double usage, String manufact, String product)
    {
        super(productWeight, productCost, usage, manufact,  product);
    }
    public String toString(){
 
 return "21.5 iMac All-in-One Computer   " + "\nProduct: " + type + "\nCost: $" + cost + "\nWeight: " + weight + " lbs" + "\nMax Power Usage: " 
  + powerUsage + " W" + "\nManufacturer(s) : " + manufacturers + "\n-----------------\n";
    
    }
 
}
