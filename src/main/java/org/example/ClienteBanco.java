package org.example;

public class ClienteBanco {

    private Contrato contrato;
    private Cartao cartao;

    public ClienteBanco(FabricaServicos fabrica) {
        this.contrato = fabrica.createContrato();
        this.cartao = fabrica.createCartao();
    }

    public String gerarContrato() {
        return this.contrato.gerar();
    }

    public String gerarCartao() {
        return this.cartao.gerar();
    }
}
