
package herenciajava;


public class HerenciaJava {

    
    public static void main(String[] args) {
        //Crear objeto clase padre Hija
        Humano adulto = new Humano();
        adulto.setNombre("Freddy ");
        adulto.comer(adulto.getNombre());
        adulto.dormir();
        
        //Crear objeto clase Hija
        Hombre padre=new Hombre(); 
        padre.setNombre("Nicolas ");
        padre.comer(padre.getNombre());
        padre.dormir();
        padre.afeitarse();
        System.out.println();
        
        //Crear objeto clase hija ->Mujer
        Mujer madre = new Mujer();
        madre.setNombre("Lina ");
        madre.comer(madre.getNombre());
        madre.dormir();
        madre.maquillarse(madre.getNombre());    
    }   
}
