/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unipar.br.domain;

/**
 *
 * @author jjoao
 */
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Cachorro {
    private int id;
    private String nome;
    private Raca raca;
    private Pelagem pelagem;
    private Cor cor;
    private Double tamanho;
    private boolean stPerfume;
    private Date dtNascimento;

    
}
