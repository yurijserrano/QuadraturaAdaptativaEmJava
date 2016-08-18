
import quadratura_adaptativa.QuadraturaAdaptativa;




/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yuri
 */


public class IQuadratura_Adaptativa 
{
    
    public static void main(String[] args)
    {
        QuadraturaAdaptativa quad=new QuadraturaAdaptativa();
        
        
        double a = 1;
        double b = 3;    
        double c = 2;
        
        System.out.println("Resultado da 1° Função:");
        System.out.println(QuadraturaAdaptativa.adaptiva(a, b));
        
        System.out.println("Resultado da 2° Função:");
        System.out.println(QuadraturaAdaptativa.adaptiva2(a, c));
    }
    
    
}
