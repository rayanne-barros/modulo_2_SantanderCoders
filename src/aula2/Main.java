package aula2;

import aula2.enums.TipoContato;
import aula2.enums.TipoEndereco;
import aula2.enums.TipoTelefone;
import aula2.model.Contato;
import aula2.model.Endereco;
import aula2.model.Telefone;

public class Main {
    public static void main(String[] args) {
        System.out.println("Rodou!");

        Contato maria = new Contato("Maria", "Silva ", "maria@email.com", TipoContato.Pessoal);


        Endereco mariaEnde = new Endereco(TipoEndereco.Residencial, "Brasil", "55555000");
        mariaEnde.setLogradouro("Rua dos Jardins");
        mariaEnde.setNumero("224");
        mariaEnde.setCidade("João Pessoa");
        mariaEnde.setEstado("Paraíba");
        mariaEnde.setBairro("Centro");
        mariaEnde.setComplemento("Casa");

        Telefone mariaTel = new Telefone(TipoTelefone.Celular, "Maria");
        mariaTel.setDdi("+55");
        mariaTel.setDdd("83");
        mariaTel.setNumero("988888888");


        System.out.println("Contato Maria: " + maria);
        System.out.println("Contato Maria: " + mariaEnde);
        System.out.println("Contato Maria: " + mariaTel);

        System.out.println("|" + maria.getNomeCompleto() + "|");
        System.out.println("|" + mariaTel.getTelefoneCompleto() + "|");
        System.out.println("|" + mariaEnde.getEnderecoCompleto() + "|");
    }
}
