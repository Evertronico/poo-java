public class clientePedido {
    public class cliente {
        private String nome;
        private String cpf;

        public cliente(String nome, String cpf) {
            if (nome == null) {
                throw new IllegalArgumentException("Nome Invalido");
            }
            if (cpf == null) {
                throw new IllegalArgumentException("Nome Invalido");
            }
            this.nome = nome;
            this.cpf = cpf;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setCpf(String cpf) {
            this.nome = cpf;
        }

        public String getNome() {
            return nome;
        }

        public String getCpf() {
            return cpf;
        }
    }
}

public class Pedido {
    private int idPedido;
    private String cliente;
    private String produto;

    public Pedido(int idPedido, String cliente, String produto) {
        if (idPedido <= 0) {
            throw new IllegalArgumentException("ID inválido");
        }
        if (cliente == null) {
            throw new IllegalArgumentException("Cliente inválido");
        }
        if (produto == null) {
            throw new IllegalArgumentException("Produto inválido");
        }
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.produto = produto;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Produto3 getProduto() {
        return produto;
    }

    public void exibirPedido() {
        System.out.println("ID do Pedido: " + idPedido);
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor total: " + produto.valorTotal());
    }
}

public class Main {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Iuri", "12345678900");
        Produto3 p1 = new Produto3("Livro", 100.0, 2);

        Pedido pedido = new Pedido(1, c1, p1);

        pedido.exibirPedido();
    }
}