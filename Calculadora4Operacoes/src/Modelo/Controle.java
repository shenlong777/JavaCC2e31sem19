package Modelo;

public class Controle
{
    private String numero1;
    private String numero2;
    private String operacao;
    private String mensagem;
    private String resultado;

    public Controle(String numero1, String numero2, String operacao)
    {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.operacao = operacao;
        Executar();
    }
    
    private void Executar()
    {
        this.mensagem = "";
        Validacao validacao = new Validacao(
                this.numero1, this.numero2, this.operacao);
        if (validacao.getMensagem().equals(""))
        {
            Calculos calculos = new Calculos(
                    validacao.getNum1(), 
                    validacao.getNum2(), 
                    this.operacao);
            this.resultado = calculos.getRes().toString();
        }
        else
        {
            this.mensagem = validacao.getMensagem();
        }
    }

    public String getMensagem()
    {
        return mensagem;
    }

    public String getResultado()
    {
        return resultado;
    }
    
    
}
