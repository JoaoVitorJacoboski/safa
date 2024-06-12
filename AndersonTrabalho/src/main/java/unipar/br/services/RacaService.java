/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unipar.br.services;
/**
 *
 * @author jjoao
 */
import unipar.br.domain.Raca;
import unipar.br.repositories.RacaRepository;

import java.sql.SQLException;
import java.util.ArrayList;

public class RacaService {

    private RacaRepository racaRepository;

    public RacaService() {
        this.racaRepository = new RacaRepository();
    }

    public Raca insert(Raca raca) throws SQLException {
        return racaRepository.insert(raca);
    }

    public ArrayList<Raca> findAll() throws SQLException {
        return racaRepository.findAll();
    }
}