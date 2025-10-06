package equacao;

public class Equacao {

    private double valorA;
    private double valorB;
    private double valorC;

    /**
     * Construtor sem argumento.
     */
    public Equacao() {
        this(0.0, 0.0, 0.0);
    }

    /**
     * Construtor com argumento
     *
     * @param valorA Um valor real.
     * @param valorB Um valor real.
     * @param valorC Um valor real.
     */
    public Equacao(double valorA, double valorB, double valorC) {
        setValorA(valorA);
        setValorB(valorB);
        setValorC(valorC);
    }

    public double getValorA() {
        return valorA;
    }

    public double getValorB() {
        return valorB;
    }
    
    public double getValorC() {
        return valorC;
    }

    public void setValorA(double valorA) {
        this.valorA = valorA;
    }

    public void setValorB(double valorB) {
        this.valorB = valorB;
    }
    
    public void setValorC(double valorC) {
        this.valorC = valorC;
    }
    
    /**
     * Realiza o cálculo do delta.
     * 
     * @return Um real com o delta da equacao
     */
    public double getDelta() {
        //Cálculo delta      
        return Double.NaN;
    }

    
    /**
     * Retorna a primeira raiz.
     *
     * @return Um real com a primeira raiz.
     */
    public double getRaiz1() {
        //Cálculo x1  
        return 0;
    }
    
    /**
     * Retorna a segunda raiz.
     *
     * @return Um real com a segunda raiz.
     */
    public double getRaiz2() {
        //Cálculo x2  
        return 0;
    }
}