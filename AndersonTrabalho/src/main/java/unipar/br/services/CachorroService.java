/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unipar.br.services;
/** 
 *
 * @author jjoao
 */
import unipar.br.domain.Cachorro;
import unipar.br.repositories.CachorroRepository;

import java.sql.SQLException;
import java.util.ArrayList;
import unipar.br.exeptions.NegocioException;

public class CachorroService {

    private CachorroRepository cachorroRepository;

    public CachorroService() {
        this.cachorroRepository = new CachorroRepository();
    }

    public Cachorro insert(Cachorro cachorro) throws SQLException, NegocioException {
        return cachorroRepository.insert(cachorro);
    }

    public ArrayList<Cachorro> findAll() throws SQLException {
        return cachorroRepository.findAll();
    }
}