/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.altieres.exemplo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
public class Unidade implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUnidade;
    @OneToMany(fetch=FetchType.LAZY, mappedBy="unidadeDepartamentoPk.unidade")
    private List<UnidadeDepartamento> unidadeDepartamento = new ArrayList<UnidadeDepartamento>();
}
