/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author redes
 * @version 22/23
 * @since febrero 2023
 */
public class Calculadora {
    private final int num1;
    private final int num2;
    
    /**
     * 
     * @param a es el primer número introducido
     * @param b es el segundo número introducido
     */
    public Calculadora(int a, int b){
        num1=a;
        num2=b;
    }
    
    /**
     * 
     * @return devuelve la suma de a y b 
     */
    public int suma(){
        int result=num1+num2;
        return result;
    }
    
    /**
     * 
     * @return devuelve la resta de a y b 
     */
    public int resta(){
        int result;
        if (resta2())   result = num1-num2;
        else            result = num2-num1;
        return result;
    }
    
    /**
     * 
     * @return devuleve true o false según si el primer número es mayor o no
     */
    public boolean resta2(){
        return num1 > num2;
    }
    
    /**
     * 
     * @return devuelve la multiplicación de a y b
     */
    public int multiplica(){
        int result=num1*num2;
        return result;
    }
    
    /**
     * 
     * @return devuelve la división de a y b
     */
    public int divide(){
        int result=num1/num2;
        return result;
    }
    
    /**
     * 
     * @return devuelve el cociente de a y b, salvo si el divisor es 0, en ese caso devuelve null
     */
    public Integer divide2(){
        if(num2==0) return null;
        int result=num1/num2;
        return result;
    }

    /**
     *  
     * @return devuelve la división de a y b
     * @throws ArithmeticException devuelve "División por 0" en caso de que el divisor sea 0
     * @exception ArithmeticException devuelve "División por 0" en caso de que el divisor sea 0
     */
     public int divide0(){
        if(num2==0) 
            throw new java.lang.ArithmeticException("División por 0");
        else{
            int result=num1/num2;
            return result;
        }
    }
     
    /**
     * @param args the command line arguments
     */
    /*
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora calcu = new Calculadora(20, 10);
        System.out.println(calcu.suma());
    }
    */
}
