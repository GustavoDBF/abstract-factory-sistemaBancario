package org.example;

public class FabricaServicosPF implements FabricaServicos {

    @Override
    public Contrato createContrato() {
        return new ContratoPF();
    }

    @Override
    public Cartao createCartao() {
        return new CartaoPF();
    }
}