package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClienteBancoTest {

    @Test
    void deveGerarContratoPF() {
        FabricaServicos fabrica = new FabricaServicosPF();
        ClienteBanco cliente = new ClienteBanco(fabrica);
        assertEquals("Contrato de Conta Corrente - Pessoa Física", cliente.gerarContrato());
    }

    @Test
    void deveGerarContratoPJ() {
        FabricaServicos fabrica = new FabricaServicosPJ();
        ClienteBanco cliente = new ClienteBanco(fabrica);
        assertEquals("Contrato de Conta Empresarial - Pessoa Jurídica", cliente.gerarContrato());
    }

    @Test
    void deveGerarCartaoPF() {
        FabricaServicos fabrica = new FabricaServicosPF();
        ClienteBanco cliente = new ClienteBanco(fabrica);
        assertEquals("Cartão de Crédito Pessoal", cliente.gerarCartao());
    }

    @Test
    void deveGerarCartaoPJ() {
        FabricaServicos fabrica = new FabricaServicosPJ();
        ClienteBanco cliente = new ClienteBanco(fabrica);
        assertEquals("Cartão Corporativo Empresarial", cliente.gerarCartao());
    }
}