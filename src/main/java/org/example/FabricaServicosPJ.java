package org.example;

public class FabricaServicosPJ implements FabricaServicos {

    @Override
    public Contrato createContrato() {
        return new ContratoPJ();
    }

    @Override
    public Cartao createCartao() {
        return new CartaoPJ();
    }
}
