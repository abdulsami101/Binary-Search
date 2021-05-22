/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

/**
 *
 * @author Raheem Mahar
 */
public class BinarySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a={1,2,3,4,5,6,7};
        int targetvalue =7;
        int li=0;
        int hi=a.length-1;
        int mi=(li+hi)/2;
        
        
        while(li<=hi){
        if(a[mi]==targetvalue){
            System.out.println("Element is present at"+mi+"Index Position");
            break;
        } else if(a[mi]<targetvalue) {
            li=mi+1;
            
            
        
    }
        else{
            hi=mi-1;
        }
        mi=(li+hi)/2;
    } if(li>hi){
            System.out.println("Element is not found ");
}
    
}
}