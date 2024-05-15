import java.util.Arrays;

public class VetorTAD {
    int[] vetor;
    int numElementos;

    public VetorTAD(int max) {
        vetor = new int[max];
        numElementos = 0;
    }

    public boolean estaCheia() {
        return vetor.length == numElementos;
    }

    public void insereFinal(int elem) {
        if(estaCheia()) {
            System.out.println("Vetor cheio! Elemento não inserido!");
        }
        else {
            vetor[numElementos] = elem;
            numElementos ++; //numElementos = numElementos + 1;
        }
    }

    public void insereInicio(int elem) {
        if(estaCheia()) {
            System.out.println("Vetor cheio! Elemento não inserido!");
        }
        else {
            for (int i = numElementos; i >= 1 ; i--) {
                vetor[i] = vetor[i-1];
            }
            vetor[0] = elem;
            numElementos ++;
        }
    }

    public void imprime() {
        for (int i = 0; i <= numElementos; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

    public void imprimeReverso() {
        for (int i = numElementos; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }

    public void insere(int pos, int elem) {
        if(estaCheia()) {
            System.out.println("Vetor cheio! Elemento não inserido!");
        }
        else if(pos<=numElementos+1 && pos>=0){
            vetor[pos] = elem;
            numElementos++;
        }else{
            System.out.println("Erro ao inserir");
        }
    }

    public int acessa(int pos){
        return vetor[pos];
    }

    public boolean estaVazia() {
        return numElementos == 0;
    }

    public void removeFinal() {
        if(estaVazia()) {
            System.out.println("Vetor vazio! Não é possível remover elementos!");
        }
        else {
            vetor[numElementos] = 0;
            numElementos --;
        }
    }
    public void removeInicio() {
        if(estaVazia()) {
            System.out.println("Vetor vazio! Não é possível remover elementos!");
        }
        else {
            for (int i = 0; i <= numElementos ; i++) {
                vetor[i] = vetor[i+1];
            }
            numElementos --;
        }
    }

    public void remove(int pos){
        if(estaVazia()) {
            System.out.println("Vetor vazio! Não é possível remover elementos!");
        }
        else {
            for (int i = pos; i <= numElementos ; i++) {
                vetor[i] = vetor[i+1];
            }
            numElementos --;
        }
    }

    public boolean pesquisa(int valor){
        for (int i = 0; i <= numElementos ; i++) {
            if(valor == vetor[i]){
                return true;
            }
        }
        return false;
    }

    public void altera(int pos, int valor){
        if(pos> vetor.length){
            System.out.println("Posição não existente");
        }else if(pos<=numElementos && pos>=0){
            vetor[pos]=valor;
            numElementos = pos;
        }else{
            System.out.println("Posição incorreta");
        }
    }

    public void limpa(){
        for(int i=0; i<=numElementos;i++){
            vetor[i]=0;
        }
        numElementos=0;

    }






    @Override
    public String toString() {
        return "VetorTAD{" +
                "vetor=" + Arrays.toString(vetor) +
                ", numElementos=" + numElementos +
                '}';
    }
}
