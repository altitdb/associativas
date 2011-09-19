/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.altieres.exemplo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

/**
 *
 * @author altitdb
 */
@Entity
@AssociationOverrides({
@AssociationOverride(name = "unidadeDepartamentoPk.unidade", joinColumns = @JoinColumn(name = "idUnidade")),
@AssociationOverride(name = "unidadeDepartamentoPk.departamento", joinColumns = @JoinColumn(name = "idDepartamento"))})
public class UnidadeDepartamento implements Serializable {

    @EmbeddedId
    private UnidadeDepartamentoPk unidadeDepartamentoPk = new UnidadeDepartamentoPk();

    @Transient
    private Unidade unidade;
    
    @Transient
    private Departamento departamento;
    
    @OneToMany(fetch=FetchType.LAZY, mappedBy="unidadeDepartamentoSetorPk.unidadeDepartamento")
    private List<UnidadeDepartamentoSetor> unidadeDepartamentoSetor = new ArrayList<UnidadeDepartamentoSetor>();

    public Departamento getDepartamento() {
        return unidadeDepartamentoPk.getDepartamento();
    }

    public void setDepartamento(Departamento departamento) {
        unidadeDepartamentoPk.setDepartamento(departamento);
    }

    public Unidade getUnidade() {
        return unidadeDepartamentoPk.getUnidade();
    }

    public void setUnidade(Unidade unidade) {
        unidadeDepartamentoPk.setUnidade(unidade);
    }
    
    
}
