/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio18;

public class Salario {
    public static double calcularBruto(double h, double v){
        double Bruto = h*v;
        return Bruto;
    }
    
    public static double calcularNeto(double Bruto, double r){
        double Neto = Bruto - (Bruto*r);
        return Neto;
    }
}
