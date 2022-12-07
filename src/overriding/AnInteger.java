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
public class AnInteger {
    int i;

    public AnInteger() {
    }
    

    public AnInteger(int i) {
        this.i = i;
    }
    
    public void printNum()
    {
        System.out.println("The value of i : "+ i);
    }
    
}
