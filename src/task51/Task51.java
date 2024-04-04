/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task51;

/**
 *
 * @author a.yusupova
 */
public class Task51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        class LocalClass1 {
            public LocalClass1(){
            System.out.println(
            "LocalClass1 object created");
            }
            
            public String method()
            {
                return "It's working!";
            }
        };
        LocalClass1 local1 = new LocalClass1();
        
        System.out.println(local1.method());

    }
    
}
