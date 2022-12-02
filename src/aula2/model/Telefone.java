package aula2.model;

import aula2.enums.TipoTelefone;

public class Telefone {

    private TipoTelefone tipo;
    private String ddi;
    private String ddd;
    private String numero;
    private String ramal;
    private String contato;

    @Override
    public String toString() {
        return "Telefone{" +
                "tipo=" + tipo +
                ", ddi='" + ddi + '\'' +
                ", ddd='" + ddd + '\'' +
                ", numero='" + numero + '\'' +
                ", ramal='" + ramal + '\'' +
                ", contato='" + contato + '\'' +
                '}';
    }

    public TipoTelefone getTipo() {
        return tipo;
    }

    public void setTipo(TipoTelefone tipo) {
        this.tipo = tipo;
    }

    public String getDdi() {
        return ddi;
    }

    public void setDdi(String ddi) {
        this.ddi = ddi;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getRamal() {
        return ramal;
    }

    public void setRamal(String ramal) {
        this.ramal = ramal;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
}
