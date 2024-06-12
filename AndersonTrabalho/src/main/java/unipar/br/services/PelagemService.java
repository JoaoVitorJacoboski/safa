/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unipar.br.services;
/**
 *
 * @author jjoao
 */
import unipar.br.domain.Pelagem;
import  unipar.br.repositories.PelagemRepository;

import java.sql.SQLException;
import java.util.ArrayList;

public class PelagemService {

    private PelagemRepository pelagemRepository;

    public PelagemService() {
        this.pelagemRepository = new PelagemRepository();
    }

    public Pelagem insert(Pelagem pelagem) throws SQLException {
        return pelagemRepository.insert(pelagem);
    }

    public ArrayList<Pelagem> findAll() throws SQLException {
        return pelagemRepository.findAll();
    }
}