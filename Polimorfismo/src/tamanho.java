public class tamanho extends animal {
    private int tamanho;

    public tamanho(String raca, int tamanho){
        super(raca);
        this.tamanho = tamanho;
    }

    public int getTamanho(){
        return tamanho;
    }

    public void setTamanho(int tamanho){
        this.tamanho = tamanho;
    }
}