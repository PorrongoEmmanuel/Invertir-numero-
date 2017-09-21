/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emmanuel
 */
public class invertidor {
    
    
    public static int invertir(int n){
        int invertido;
        if(n<10){
        invertido=n;
        }
    else{
    invertido=(n%10)*10+invertir(n/10);
    
}
    


