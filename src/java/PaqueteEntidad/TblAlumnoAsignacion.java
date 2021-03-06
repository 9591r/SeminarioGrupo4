/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaqueteEntidad;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author debian
 */
@Entity
@Table(name = "tbl_alumno_asignacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblAlumnoAsignacion.findAll", query = "SELECT t FROM TblAlumnoAsignacion t")
    , @NamedQuery(name = "TblAlumnoAsignacion.findByIdAAsignacion", query = "SELECT t FROM TblAlumnoAsignacion t WHERE t.idAAsignacion = :idAAsignacion")})
public class TblAlumnoAsignacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_a_asignacion")
    private Integer idAAsignacion;
    @JoinColumn(name = "id_alumno", referencedColumnName = "alumno")
    @ManyToOne
    private TblAlumno idAlumno;
    @JoinColumn(name = "id_grado", referencedColumnName = "grado_educativo")
    @ManyToOne
    private TblGradoEducativo idGrado;
    @JoinColumn(name = "id_seccion", referencedColumnName = "seccion")
    @ManyToOne
    private TblSeccion idSeccion;

    public TblAlumnoAsignacion() {
    }

    public TblAlumnoAsignacion(Integer idAAsignacion) {
        this.idAAsignacion = idAAsignacion;
    }

    public Integer getIdAAsignacion() {
        return idAAsignacion;
    }

    public void setIdAAsignacion(Integer idAAsignacion) {
        this.idAAsignacion = idAAsignacion;
    }

    public TblAlumno getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(TblAlumno idAlumno) {
        this.idAlumno = idAlumno;
    }

    public TblGradoEducativo getIdGrado() {
        return idGrado;
    }

    public void setIdGrado(TblGradoEducativo idGrado) {
        this.idGrado = idGrado;
    }

    public TblSeccion getIdSeccion() {
        return idSeccion;
    }

    public void setIdSeccion(TblSeccion idSeccion) {
        this.idSeccion = idSeccion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAAsignacion != null ? idAAsignacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblAlumnoAsignacion)) {
            return false;
        }
        TblAlumnoAsignacion other = (TblAlumnoAsignacion) object;
        if ((this.idAAsignacion == null && other.idAAsignacion != null) || (this.idAAsignacion != null && !this.idAAsignacion.equals(other.idAAsignacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PaqueteEntidad.TblAlumnoAsignacion[ idAAsignacion=" + idAAsignacion + " ]";
    }
    
}
