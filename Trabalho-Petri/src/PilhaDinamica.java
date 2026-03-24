public class PilhaDinamica {
    private No topo;
    private int tamanho;

    public PilhaDinamica() {
        this.topo = null;
        this.tamanho = 0;
    }

    public boolean estaVazia() {
        return topo == null;
    }

    public void empilhar(String valor) {
        if (valor == null) {
            System.out.println("[ERRO] Valor nulo não pode ser empilhado.");
            return;
        }
        No novo = new No(valor);
        novo.proximo = topo;
        topo = novo;
        tamanho++;
        System.out.println("[OK] Elemento empilhado: " + valor);
    }

    public String desempilhar() {
        if (estaVazia()) {
            System.out.println("[ERRO] Pilha vazia. Não há elemento para desempilhar.");
            return null;
        }
        String removido = topo.dado;
        topo = topo.proximo;
        tamanho--;
        System.out.println("[OK] Elemento desempilhado: " + removido);
        return removido;
    }

    public String topo() {
        if (estaVazia()) {
            System.out.println("[ERRO] Pilha vazia. Não há topo.");
            return null;
        }
        System.out.println("[TOPO] " + topo.dado);
        return topo.dado;
    }

    public void exibir() {
        if (estaVazia()) {
            System.out.println("[INFO] Pilha vazia.");
            return;
        }
        System.out.print("[PILHA] Topo -> ");
        No atual = topo;
        while (atual != null) {
            System.out.print(atual.dado);
            if (atual.proximo != null) System.out.print(" | ");
            atual = atual.proximo;
        }
        System.out.println(" <- Base");
    }

    public int contar() {
        System.out.println("[CONTAGEM] " + tamanho + " elemento(s) na pilha.");
        return tamanho;
    }

    public boolean buscar(String valor) {
        if (valor == null) {
            System.out.println("[ERRO] Valor inválido para busca.");
            return false;
        }
        No atual = topo;
        int posicao = 0;
        while (atual != null) {
            if (atual.dado.equals(valor)) {
                System.out.println("[BUSCA] Elemento \"" + valor + "\" encontrado (posição " + posicao + " a partir do topo).");
                return true;
            }
            atual = atual.proximo;
            posicao++;
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
        No atual = topo;
        while (atual != null) {
            if (atual.dado.equals(valor)) count++;
            atual = atual.proximo;
        }
        System.out.println("[OCORRÊNCIAS] \"" + valor + "\" aparece " + count + " vez(es).");
        return count;
    }


    public void removerTodas(String valor) {
        if (valor == null) {
            System.out.println("[ERRO] Valor inválido para remoção.");
            return;
        }
        No sentinela = new No(null);
        sentinela.proximo = topo;
        No anterior = sentinela;
        int removidos = 0;
        while (anterior.proximo != null) {
            if (anterior.proximo.dado.equals(valor)) {
                anterior.proximo = anterior.proximo.proximo;
                tamanho--;
                removidos++;
            } else {
                anterior = anterior.proximo;
            }
        }
        topo = sentinela.proximo;
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
        topo = null;
        tamanho = 0;
        System.out.println("[OK] Pilha esvaziada.");
    }
}
