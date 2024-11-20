public class areaRetangulo {
    int largura;
    int altura;

    public areaRetangulo(int largura, int altura){
        this.altura = altura;
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int calculo(){
        return largura * altura;
    }
}
