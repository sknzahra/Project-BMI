/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idealbmi.Model;

/**
 *
 * @author Asus
 */
public class ModelProgram {
   
   private int weight;

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
   
   private int height;

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }  
    
    private String result;

    public void setResult(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }
    
    private int bmi;

    public void setBmi(int bmi) {
        this.bmi = bmi;
    }

    public int getBmi() {
        return bmi;
    }
    
}
