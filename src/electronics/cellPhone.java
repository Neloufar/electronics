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
public class cellPhone extends Electronics {
   
    public cellPhone(double productWeight, int productCost, double usage, String manufact, String product)
    {
        super(productWeight, productCost, usage, manufact, product);
    }
    public String toString(){
 
 return "The White 16GB Iphone6:   " + "\nProduct: " + type + "\nCost: $" + cost + "\nWeight: " + weight + " ounces" + "\nPower Usage: " 
  + powerUsage + " hours" + "\nManufacturer(s) : " + manufacturers + "\n-----------------\n";
    
    }
 
}