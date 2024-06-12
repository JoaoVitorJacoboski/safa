/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unipar.br.main;

/**
 *
 * @author jjoao
 */
import unipar.br.domain.Cachorro;
import unipar.br.domain.Cor;
import unipar.br.domain.Pelagem;
import unipar.br.domain.Raca;
import unipar.br.exeptions.NegocioException;
import unipar.br.services.CachorroService;
import unipar.br.services.CorService;
import unipar.br.services.PelagemService;
import unipar.br.services.RacaService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        try {
            
            RacaService racaService = new RacaService();
            Raca labrador = new Raca(0, "Labrador");
            labrador = racaService.insert(labrador);

            Raca viraLata = new Raca(0, "Vira-lata");
            viraLata = racaService.insert(viraLata);

            
            CorService corService = new CorService();
            Cor preto = new Cor(0, "Preto");
            preto = corService.insert(preto);

            Cor branco = new Cor(0, "Branco");
            branco = corService.insert(branco);

            
            PelagemService pelagemService = new PelagemService();
            Pelagem curto = new Pelagem(0, "Curto");
            curto = pelagemService.insert(curto);

            Pelagem longo = new Pelagem(0, "Longo");
            longo = pelagemService.insert(longo);

            
            CachorroService cachorroService = new CachorroService();
            Cachorro cachorro1 = new Cachorro();
            cachorro1.setNome("Rex");
            cachorro1.setRaca(labrador);
            cachorro1.setCor(preto);
            cachorro1.setPelagem(curto);
            cachorro1.setTamanho(50.0);
            cachorro1.setStPerfume(true);
            cachorro1.setDtNascimento(new Date());
            cachorroService.insert(cachorro1);

            Cachorro cachorro2 = new Cachorro();
            cachorro2.setNome("Bolinha");
            cachorro2.setRaca(viraLata);
            cachorro2.setCor(branco);
            cachorro2.setPelagem(longo);
            cachorro2.setTamanho(35.0);
            cachorro2.setStPerfume(false);
            cachorro2.setDtNascimento(new Date());
            cachorroService.insert(cachorro2);

            
            System.out.println("Lista de Raças:");
            ArrayList<Raca> racas = racaService.findAll();
            for (Raca raca : racas) {
                System.out.println(raca);
            }

            System.out.println("\nLista de Cores:");
            ArrayList<Cor> cores = corService.findAll();
            for (Cor cor : cores) {
                System.out.println(cor);
            }

            System.out.println("\nLista de Pelagens:");
            ArrayList<Pelagem> pelagens = pelagemService.findAll();
            for (Pelagem pelagem : pelagens) {
                System.out.println(pelagem);
            }

            System.out.println("\nLista de Cachorros:");
            ArrayList<Cachorro> cachorros = cachorroService.findAll();
            for (Cachorro cachorro : cachorros) {
                System.out.println(cachorro);
            }

        } catch (SQLException ex) {
            System.out.println("Ops, algo deu errado com o banco de dados\n" + ex.getMessage());
        } catch (NegocioException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Ops, algo deu errado contate o suporte\n" + ex.getMessage());
        }
    }
}