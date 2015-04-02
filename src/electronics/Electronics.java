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
class Electronics {
    
public double weight;
public int cost;
public double powerUsage;
public String manufacturers;
public String type;

public Electronics(double productWeight, int productCost, double usage, String manufact, String product)
{
  this.weight = productWeight;
  this.cost = productCost;
  this.powerUsage = usage;
  this.manufacturers = manufact;
  this.type = product;
  }
  
 public String toString(){
 
 return "Product:" + type + "\nCost: " + cost + "\nWeight: " + weight + "\nPower Usage: " 
 + powerUsage + "Manufacturers : " + manufacturers;
}
}

