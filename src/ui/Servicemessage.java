/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Sreerag PR
 */
@Entity
@Table(name = "servicemessage", catalog = "project", schema = "")
@NamedQueries({
    @NamedQuery(name = "Servicemessage.findAll", query = "SELECT s FROM Servicemessage s")
    , @NamedQuery(name = "Servicemessage.findById", query = "SELECT s FROM Servicemessage s WHERE s.id = :id")
    , @NamedQuery(name = "Servicemessage.findByMessage", query = "SELECT s FROM Servicemessage s WHERE s.message = :message")
    , @NamedQuery(name = "Servicemessage.findByFrom", query = "SELECT s FROM Servicemessage s WHERE s.from = :from")})
public class Servicemessage implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "message")
    private String message;
    @Column(name = "from")
    private String from;

    public Servicemessage() {
    }

    public Servicemessage(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        String oldMessage = this.message;
        this.message = message;
        changeSupport.firePropertyChange("message", oldMessage, message);
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        String oldFrom = this.from;
        this.from = from;
        changeSupport.firePropertyChange("from", oldFrom, from);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Servicemessage)) {
            return false;
        }
        Servicemessage other = (Servicemessage) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ui.Servicemessage[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
