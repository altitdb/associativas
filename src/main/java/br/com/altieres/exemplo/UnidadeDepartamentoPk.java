/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.altieres.exemplo;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author altitdb
 */
@Embeddable
public class UnidadeDepartamentoPk implements Serializable {
    
    @ManyToOne
    @JoinColumn(name = "idUnidade")
    private Unidade unidade;
    @ManyToOne
    @JoinColumn(name = "idDepartamento")
    private Departamento departamento;

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Unidade getUnidade() {
        return unidade;
    }

    public void setUnidade(Unidade unidade) {
        this.unidade = unidade;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UnidadeDepartamentoPk other = (UnidadeDepartamentoPk) obj;
        if (this.unidade != other.unidade && (this.unidade == null || !this.unidade.equals(other.unidade))) {
            return false;
        }
        if (this.departamento != other.departamento && (this.departamento == null || !this.departamento.equals(other.departamento))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (this.unidade != null ? this.unidade.hashCode() : 0);
        hash = 97 * hash + (this.departamento != null ? this.departamento.hashCode() : 0);
        return hash;
    }
    
    
    
}
