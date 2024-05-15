public class Main {
    public static void main(String[] args) {
        VetorTAD vet = new VetorTAD(5);

        vet.insereFinal(10);
        vet.insereFinal(20);
        vet.insereFinal(30);
        vet.insereInicio(100);
        vet.removeFinal();
        vet.acessa(3);
        vet.pesquisa(30);


        vet.imprime();
        System.out.println("\n");

        vet.imprimeReverso();
        System.out.println("\n");

        vet.removeInicio();
        vet.imprime();
        System.out.println("\n");

        vet.remove(1);
        vet.imprime();

        System.out.println("\n");
        vet.altera(1,300);
        vet.imprime();

        System.out.println("\n");
        vet.limpa();
        vet.imprime();



    }
}