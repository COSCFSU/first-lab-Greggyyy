/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labs;

import edu.frostburg.cosc310.lab00.Lab00;

/**
 *
 * @author Greggyy
 */
public class GregBarnettLab00 implements Lab00{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GregBarnettLab00 lab = new GregBarnettLab00();
        System.out.println(lab.problem0(9999));
        System.out.println(lab.problem1(9999));
    }

    @Override
    public long problem0(int size) {
        System.out.println("This is just an example, but please follow this template.");
        String s = "";
        long start = System.currentTimeMillis();

        for (int i=0; i<size; i++) {
            s = s + i;
        }
        
        long end = System.currentTimeMillis();
        return end - start;
    }

    @Override
    public long problem1(int size) {
        StringBuilder sb = new StringBuilder();
        long start = System.currentTimeMillis();

        for (int i=0; i<size; i++) {
            sb.append(i);
        }
        
        long end = System.currentTimeMillis();
        return end - start;
    }

    @Override
    public long problem2() {
        StringBuilder sb = new StringBuilder();
        long start = System.currentTimeMillis();
        
        
        long end = System.currentTimeMillis();
        return end - start;
    }
    
}
