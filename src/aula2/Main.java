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

        Contato maria = new Contato("Maria", TipoContato.Pessoal);
        maria.setSobrenome("Silva");
        maria.setEmail("marias@email.com");

        Endereco mariaEnde = new Endereco();
        mariaEnde.setTipo(TipoEndereco.Residencial);
        mariaEnde.setPais("Brasil");
        mariaEnde.setCep("55555000");
        mariaEnde.setLogradouro("Rua dos Jardins");
        mariaEnde.setCidade("João Pessoa");
        mariaEnde.setEstado("Paraíba");
        mariaEnde.setBairro("Centro");
        mariaEnde.setComplemento("Casa");

        Telefone mariaTel = new Telefone();
        mariaTel.setTipo(TipoTelefone.Celular);
        mariaTel.setDdi("+55");
        mariaTel.setDdd("83");
        mariaTel.setNumero("988888888");
        mariaTel.setContato("Maria");


        System.out.println("Contato Maria: " + maria);
        System.out.println("Contato Maria: " + mariaEnde);
        System.out.println("Contato Maria: " + mariaTel);
    }
}
