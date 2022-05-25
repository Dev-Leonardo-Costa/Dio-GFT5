package banco_dio;

import lombok.Data;

import java.util.List;

@Data
public class Banco {
    private String nome;
    private List<Cliente> clientes;
    private List<Conta> contas;
}
