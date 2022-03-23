/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpoop5;

/**
 *
 * @author alumno
 */
public class MPOOP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo cir1 =new Circulo();
        //cir1.radio=5; no se puede
        cir1.setRadio(5);
        System.out.println(cir1.getRadio());
        cir1.area();
        cir1.perimetro();
        System.out.println(cir1);
        System.out.println(cir1.toString());//nos da la referencia
        System.out.println("##############");
        Circulo cir2 =new Circulo();
        cir2.setRadio(-15);
        System.out.println(cir2);
        
        System.out.println("##############");
        
        Coche coche=new Coche();
        System.out.println(coche);//no le asigamos valores y los inicializa a null
        System.out.println("###############");
        
        Persona per1 = new Persona();
        per1.setNombre("Panchito");
        per1.setApellido("lopez");
        System.out.println(per1);
        Fecha fecha =new Fecha(6,7,2021);
        per1.setfNacimiento(fecha);
        System.out.println(per1);
        
        System.out.println("############");
        
        Persona per2 =new Persona();
        per2.setNombre("Juanito");
        per2.setApellido("Perez");
        per2.setfNacimiento(new Fecha(15,6,2002));
        
        System.out.println(per2);
        System.out.println("########");
        
        Persona per3 = new Persona("Alan","Martinez"
                ,new Fecha(16,2,2002));
        System.out.println(per3);
        
        System.out.println("########");
        
        Persona per4 = new Persona("Jose","Velasquez",12,9,1999);
        System.out.println(per4);
          
        System.out.println("###################################################");
        Coche coche2 = new Coche("Audi","negro", 5632014, 4, 5687, new Persona("Jorge","Ramirez"),new Persona("Juan", "Morelos"),new Persona("Jesus","Hernandez"), new Persona("Angelica", "Franco"));
        
        System.out.println(coche2);
    }
    
}
