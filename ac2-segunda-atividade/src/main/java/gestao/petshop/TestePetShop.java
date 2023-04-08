/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestao.petshop;

/**
 *
 * @author lucka
 */
public class TestePetShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pet pet01 = new Pet("Max", "Shitzu");
        Pet pet02 = new Pet("Banguela", "Buldog");
        
        PetShop petShop = new PetShop("Petshop123");
        
        System.out.println(pet01);
        System.out.println(pet02);
        
        petShop.darBanho(pet01, 100.0);
        petShop.darBanho(pet01, 100.0);
        petShop.darBanho(pet02, 100.0, 25.0);
        
        System.out.println(pet01);
        System.out.println(pet02);
        
        System.out.println(petShop);
    }
    
}
