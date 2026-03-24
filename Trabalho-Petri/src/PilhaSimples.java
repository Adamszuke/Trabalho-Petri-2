public class PilhaSimples {
    private String[] elementos;
    private int topo;
    private int capacidade;

    public PilhaSimples(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new String[capacidade];
        this.topo = -1;
    }

    public boolean estaVazia() {
        return topo == -1;
    }

    public boolean estaCheia() {
        return topo == capacidade - 1;
    }

    public void empilhar(String valor) {
        if (estaCheia()) {
            System.out.println("[ERRO] Pilha cheia. Não é possível empilhar: " + valor);
            return;
        }
        elementos[++topo] = valor;
        System.out.println("[OK] Elemento empilhado: " + valor);
    }

    public String desempilhar() {
        if (estaVazia()) {
            System.out.println("[ERRO] Pilha vazia. Não há elemento para desempilhar.");
            return null;
        }
        String removido = elementos[topo];
        elementos[topo] = null;
        topo--;
        System.out.println("[OK] Elemento desempilhado: " + removido);
        return removido;
    }

    public String topo() {
        if (estaVazia()) {
            System.out.println("[ERRO] Pilha vazia. Não há topo.");
            return null;
        }
        System.out.println("[TOPO] " + elementos[topo]);
        return elementos[topo];
    }

    public void exibir() {
        if (estaVazia()) {
            System.out.println("[INFO] Pilha vazia.");
            return;
        }
        System.out.print("[PILHA] Topo -> ");
        for (int i = topo; i >= 0; i--) {
            System.out.print(elementos[i]);
            if (i > 0) System.out.print(" | ");
        }
        System.out.println(" <- Base");
    }

    public int contar() {
        int total = topo + 1;
        System.out.println("[CONTAGEM] " + total + " elemento(s) na pilha.");
        return total;
    }

    public boolean buscar(String valor) {
        if (valor == null) {
            System.out.println("[ERRO] Valor inválido para busca.");
            return false;
        }
        for (int i = topo; i >= 0; i--) {
            if (elementos[i].equals(valor)) {
                System.out.println("[BUSCA] Elemento \"" + valor + "\" encontrado na posição " + i + " (0 = base).");
                return true;
            }
        }
        System.out.println("[BUSCA] Elemento \"" + valor + "\" não encontrado na pilha.");
        return false;
    }

    public int contarOcorrencias(String valor) {
        if (valor == null) {
            System.out.println("[ERRO] Valor inválido.");
            return 0;
        }
        int count = 0;
        for (int i = 0; i <= topo; i++) {
            if (elementos[i].equals(valor)) count++;
        }
        System.out.println("[OCORRÊNCIAS] \"" + valor + "\" aparece " + count + " vez(es).");
        return count;
    }

    public void removerTodas(String valor) {
        if (valor == null) {
            System.out.println("[ERRO] Valor inválido para remoção.");
            return;
        }
        String[] temp = new String[capacidade];
        int novoTopo = -1;
        int removidos = 0;
        for (int i = 0; i <= topo; i++) {
            if (!elementos[i].equals(valor)) {
                temp[++novoTopo] = elementos[i];
            } else {
                removidos++;
            }
        }
        elementos = temp;
        topo = novoTopo;
        System.out.println("[OK] " + removidos + " ocorrência(s) de \"" + valor + "\" removida(s).");
    }

    public void empilharVarios(String[] valores) {
        if (valores == null || valores.length == 0) {
            System.out.println("[ERRO] Nenhum valor fornecido.");
            return;
        }
        for (String v : valores) {
            empilhar(v);
        }
    }

    public void esvaziar() {
        for (int i = 0; i <= topo; i++) {
            elementos[i] = null;
        }
        topo = -1;
        System.out.println("[OK] Pilha esvaziada.");
    }
}