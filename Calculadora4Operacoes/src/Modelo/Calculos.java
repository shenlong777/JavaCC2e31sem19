package Modelo;

public class Calculos
{
    private Double num1;
    private Double num2;
    private String operacao;
    private Double res;

    public Calculos(Double num1, Double num2, String operacao)
    {
        this.num1 = num1;
        this.num2 = num2;
        this.operacao = operacao;
        Calcular();
    }
    
    private void Calcular()
    {
        if (this.operacao.equals("+")) Somar();
        if (this.operacao.equals("-")) Subtrair();
        if (this.operacao.equals("*")) Multiplicar();
        if (this.operacao.equals("/")) Dividir();
        
    }
    
    private void Somar()
    {
        this.res = this.num1 + this.num2;
    }
    
    private void Subtrair()
    {
        this.res = this.num1 - this.num2;
    }
    
    private void Multiplicar()
    {
        this.res = this.num1 * this.num2;
    }
    
    private void Dividir()
    {
        this.res = this.num1 /this.num2;
    }

    public Double getRes()
    {
        return res;
    }
    
}
