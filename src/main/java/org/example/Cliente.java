package org.example;

public class Cliente {
    public String elogiaCentralAtendimento(String mensagem) {
        return Ouvidoria.getInstancia().receberElogioCentralAtendimento(mensagem);
    }

    public String reclamarCentralAtendimento(String mensagem) {
        return Ouvidoria.getInstancia().receberReclamacaoCentralAtendimento(mensagem);
    }

    public String sugerirCentralAtendimento(String mensagem) {
        return Ouvidoria.getInstancia().receberSugestaoCentralAtendimento(mensagem);
    }
}
