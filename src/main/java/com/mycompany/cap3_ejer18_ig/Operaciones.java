
package com.mycompany.cap3_ejer18_ig;

public class Operaciones {
    String nombre, texto;
    int valHora,numHorasT,codEmpleado;
    float porRetencion,SalBruto, SalNeto;
    
    public Operaciones(){
    }
    public float setSalario_bruto(int numero_Horas_Trabajadas, int valor_hora_trabajada){
        this.numHorasT = numero_Horas_Trabajadas;
        this.valHora = valor_hora_trabajada;
        this.SalBruto = numHorasT * valHora;
        return SalBruto;
    }
    public float setSalario_neto(float Salario_bruto, float porcentaje_retencion){
        this.SalBruto = Salario_bruto;
        this.porRetencion = porcentaje_retencion;
        this.SalNeto = SalBruto-(SalBruto*porRetencion);
        return SalNeto;
    }
    
}
