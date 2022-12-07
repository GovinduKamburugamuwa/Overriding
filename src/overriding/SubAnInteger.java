/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overriding;

/**
 *
 * @author MAX
 */
public class SubAnInteger extends AnInteger {
    
    int j;

    public SubAnInteger(int i, int j) {
        super(i);
        this.j = j;
    } 
    public  void printNum()
    {
        
        System.out.println("The value of j : "+ j);
    }   
}
