/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.altieres.exemplo;

import java.io.Serializable;
import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Transient;

/**
 *
 * @author altitdb
 */
@Entity
@AssociationOverrides({@AssociationOverride(name = "unidadeDepartamentoSetorPk.setor", joinColumns = @JoinColumn(name = "idSetor")),
@AssociationOverride(name = "unidadeDepartamentoSetorPk.unidade", joinColumns = @JoinColumn(name = "idUnidade")),
@AssociationOverride(name = "unidadeDepartamentoSetorPk.departamento", joinColumns = @JoinColumn(name = "idDepartamento"))})
public class UnidadeDepartamentoSetor implements Serializable {
    
    @EmbeddedId
    private UnidadeDepartamentoSetorPk unidadeDepartamentoSetorPk = new UnidadeDepartamentoSetorPk();

    @Transient
    private Setor setor;
    
    @Transient
    private UnidadeDepartamento unidadeDepartamento;

    public Setor getSetor() {
        return unidadeDepartamentoSetorPk.getSetor();
    }

    public void setSetor(Setor setor) {
        unidadeDepartamentoSetorPk.setSetor(setor);
    }

    public UnidadeDepartamento getUnidadeDepartamento() {
        return unidadeDepartamentoSetorPk.getUnidadeDepartamento();
    }

    public void setUnidadeDepartamento(UnidadeDepartamento unidadeDepartamento) {
        unidadeDepartamentoSetorPk.setUnidadeDepartamento(unidadeDepartamento);
    }
    
    
}
