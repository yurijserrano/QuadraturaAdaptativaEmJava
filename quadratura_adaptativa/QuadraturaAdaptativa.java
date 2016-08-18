/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quadratura_adaptativa;

/**
 *
 * @author Yuri
 */
public class QuadraturaAdaptativa 
{    
    private final static double TOL = 1E-5;

    /**
     * Função a ser resolvida pelo método da Qaudratura Adaptativa/
     */
    static double funcao(double x) 
    {
        return Math.exp(x+x) * Math.sin(x+x+x);
    }
    
    static double funcao2(double x) 
    {
        return x + Math.sin(x+x+x+x);
    }    
        
    //Quadratura Adaptativa para a função 1
    public static double adaptiva(double a, double b)
    {
        double h = b - a;
        double c = (a + b) / 2.0;
        double d = (a + c) / 2.0;
        double e = (b + c) / 2.0;
        double Q1 = h/6  * (funcao(a) + 4*funcao(c) + funcao(b));
        double Q2 = h/12 * (funcao(a) + 4*funcao(d) + 2*funcao(c) + 4*funcao(e) + funcao(b));
        if (Math.abs(Q2 - Q1) <= TOL)
            return Q2 + (Q2 - Q1) / 15;
        else
            return adaptiva(a, c) + adaptiva(c, b);
    }
    
    //Quadratura Adaptativa para a função 2
    public static double adaptiva2(double a, double b)
    {
        double h = b - a;
        double c = (a + b) / 2.0;
        double d = (a + c) / 2.0;
        double e = (b + c) / 2.0;
        double Q1 = h/6  * (funcao2(a) + 4*funcao2(c) + funcao2(b));
        double Q2 = h/12 * (funcao2(a) + 4*funcao2(d) + 2*funcao2(c) + 4*funcao2(e) + funcao2(b));
        if (Math.abs(Q2 - Q1) <= TOL)
            return Q2 + (Q2 - Q1) / 15;
        else
            return adaptiva2(a, c) + adaptiva2(c, b);
    }
}
