package br.com.newlimp.gestaoproducao.controller;

import br.com.newlimp.gestaoproducao.model.Chapa;
import br.com.newlimp.gestaoproducao.model.PinturaVirgem;
import br.com.newlimp.gestaoproducao.model.Tinta;
import br.com.newlimp.gestaoproducao.model.enums.Cores;
import br.com.newlimp.gestaoproducao.model.enums.StatusProcesso;
import br.com.newlimp.gestaoproducao.model.enums.UnidadeMedida;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main (String[] args) {
        Tinta tintaAzul = new Tinta();
        tintaAzul.setCor(Cores.AZUL);
        tintaAzul.setVolumeTotal(10.0);
        tintaAzul.setVolumeRestante(10.0);
        tintaAzul.setId(1);
        tintaAzul.setEmUso(false);

        List<Chapa> chapas = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            Chapa c = new Chapa();
            c.setId(i);
            c.setNome("Chapa " + i);
            c.setCor(Cores.AZUL);
            c.setQuantidade(1);
            c.setDimensoes(UnidadeMedida.M1_00_x_1_00M);
            chapas.add(c);
        }

        Map<String, Integer> insumos = new HashMap<>();
        insumos.put("Rolo", 1);
        insumos.put("Suporte de Rolo", 1);

        PinturaVirgem pintura = new PinturaVirgem();
        pintura.setId(100);
        pintura.setNome("Pintura Virgem - Azul");
        pintura.setResponsavel("Lucas");
        pintura.setStatus(StatusProcesso.PLANEJADO);
        pintura.setCor(Cores.AZUL);
        pintura.setChapasPlanejadas(5);
        pintura.setTintaUtilizada(tintaAzul);
        pintura.setChapasUsadas(chapas);
        pintura.setInsumosUsados(insumos);

        System.out.println(pintura.getStatus());
        pintura.executar();
        System.out.println(pintura.getStatus());

        pintura.registrarProducao(5);

        System.out.println(pintura.getStatus());
    }
}
