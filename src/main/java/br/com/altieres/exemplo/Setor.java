/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.altieres.exemplo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author altitdb
 */
@Entity
public class Setor implements Serializable {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idSetor;
    
    @OneToMany(fetch=FetchType.LAZY, mappedBy="unidadeDepartamentoSetorPk.setor")
    private List<UnidadeDepartamentoSetor> unidadeDepartamentoSetor = new ArrayList<UnidadeDepartamentoSetor>();
}
