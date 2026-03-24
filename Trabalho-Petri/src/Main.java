public class Main {
    public static void main(String[] args) {

        //  PILHA SIMPLES 
        System.out.println("PILHA SIMPLES");

        PilhaSimples pilhaSimples = new PilhaSimples(6);

        pilhaSimples.empilhar("Ana");
        pilhaSimples.empilhar("Bruno");
        pilhaSimples.empilhar("Ana");
        pilhaSimples.empilhar("Carlos");
        pilhaSimples.empilhar("Ana");

        System.out.println();
        pilhaSimples.exibir();

        System.out.println();
        pilhaSimples.topo();

        System.out.println();
        pilhaSimples.contar();

        System.out.println();
        pilhaSimples.buscar("Bruno");
        pilhaSimples.buscar("Zé");

        System.out.println();
        pilhaSimples.contarOcorrencias("Ana");

        System.out.println();
        pilhaSimples.desempilhar();
        pilhaSimples.exibir();

        System.out.println();
        pilhaSimples.removerTodas("Ana");
        pilhaSimples.exibir();
        pilhaSimples.contar();

        System.out.println();
        String[] nomes = {"Davi", "Raul", "Alex"};
        pilhaSimples.empilharVarios(nomes);
        pilhaSimples.exibir();

        System.out.println();
        pilhaSimples.empilhar("Extra1");
        pilhaSimples.empilhar("Extra2"); 

        System.out.println();
        pilhaSimples.esvaziar();
        pilhaSimples.exibir();

        System.out.println();
        pilhaSimples.desempilhar();
        pilhaSimples.topo();

        //  PILHA DINÂMICA
        System.out.println();
        System.out.println("PILHA DINÂMICA");


        PilhaDinamica pilhaDinamica = new PilhaDinamica();

        pilhaDinamica.empilhar("Maria");
        pilhaDinamica.empilhar("João");
        pilhaDinamica.empilhar("Maria");
        pilhaDinamica.empilhar("Pedro");
        pilhaDinamica.empilhar("Maria");

        System.out.println();
        pilhaDinamica.exibir();

        System.out.println();
        pilhaDinamica.topo();

        System.out.println();
        pilhaDinamica.contar();

        System.out.println();
        pilhaDinamica.buscar("João");
        pilhaDinamica.buscar("Lucas");

        System.out.println();
        pilhaDinamica.contarOcorrencias("Maria");

        System.out.println();
        pilhaDinamica.desempilhar();
        pilhaDinamica.exibir();

        System.out.println();
        pilhaDinamica.removerTodas("Maria");
        pilhaDinamica.exibir();
        pilhaDinamica.contar();

        System.out.println();
        String[] nomes2 = {"Lara", "Fábio", "Nina", "Tom"};
        pilhaDinamica.empilharVarios(nomes2);
        pilhaDinamica.exibir();

        System.out.println();
        pilhaDinamica.esvaziar();
        pilhaDinamica.exibir();

        System.out.println();
        pilhaDinamica.desempilhar();
        pilhaDinamica.topo();
    }
}