/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.altieres.exemplo;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

/**
 *
 * @author altitdb
 */
@Embeddable
public class UnidadeDepartamentoSetorPk implements Serializable {

    @ManyToOne
    private Setor setor;
    @ManyToOne
    @JoinColumns({
        @JoinColumn(name = "idUnidade"),
        @JoinColumn(name = "idDepartamento")})
    private UnidadeDepartamento unidadeDepartamento;

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public UnidadeDepartamento getUnidadeDepartamento() {
        return unidadeDepartamento;
    }

    public void setUnidadeDepartamento(UnidadeDepartamento unidadeDepartamento) {
        this.unidadeDepartamento = unidadeDepartamento;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UnidadeDepartamentoSetorPk other = (UnidadeDepartamentoSetorPk) obj;
        if (this.setor != other.setor && (this.setor == null || !this.setor.equals(other.setor))) {
            return false;
        }
        if (this.unidadeDepartamento != other.unidadeDepartamento && (this.unidadeDepartamento == null || !this.unidadeDepartamento.equals(other.unidadeDepartamento))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + (this.setor != null ? this.setor.hashCode() : 0);
        hash = 29 * hash + (this.unidadeDepartamento != null ? this.unidadeDepartamento.hashCode() : 0);
        return hash;
    }
}
