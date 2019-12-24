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
@Table(name = "servicebooking", catalog = "project", schema = "")
@NamedQueries({
    @NamedQuery(name = "Servicebooking.findAll", query = "SELECT s FROM Servicebooking s")
    , @NamedQuery(name = "Servicebooking.findById", query = "SELECT s FROM Servicebooking s WHERE s.id = :id")
    , @NamedQuery(name = "Servicebooking.findByCustomer", query = "SELECT s FROM Servicebooking s WHERE s.customer = :customer")
    , @NamedQuery(name = "Servicebooking.findByBrand", query = "SELECT s FROM Servicebooking s WHERE s.brand = :brand")
    , @NamedQuery(name = "Servicebooking.findByModel", query = "SELECT s FROM Servicebooking s WHERE s.model = :model")
    , @NamedQuery(name = "Servicebooking.findByProduct", query = "SELECT s FROM Servicebooking s WHERE s.product = :product")
    , @NamedQuery(name = "Servicebooking.findByRemarks", query = "SELECT s FROM Servicebooking s WHERE s.remarks = :remarks")})
public class Servicebooking implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "customer")
    private String customer;
    @Basic(optional = false)
    @Column(name = "brand")
    private String brand;
    @Basic(optional = false)
    @Column(name = "model")
    private String model;
    @Basic(optional = false)
    @Column(name = "product")
    private String product;
    @Column(name = "remarks")
    private String remarks;

    public Servicebooking() {
    }

    public Servicebooking(Integer id) {
        this.id = id;
    }

    public Servicebooking(Integer id, String customer, String brand, String model, String product) {
        this.id = id;
        this.customer = customer;
        this.brand = brand;
        this.model = model;
        this.product = product;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        String oldCustomer = this.customer;
        this.customer = customer;
        changeSupport.firePropertyChange("customer", oldCustomer, customer);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        String oldBrand = this.brand;
        this.brand = brand;
        changeSupport.firePropertyChange("brand", oldBrand, brand);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        String oldModel = this.model;
        this.model = model;
        changeSupport.firePropertyChange("model", oldModel, model);
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        String oldProduct = this.product;
        this.product = product;
        changeSupport.firePropertyChange("product", oldProduct, product);
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        String oldRemarks = this.remarks;
        this.remarks = remarks;
        changeSupport.firePropertyChange("remarks", oldRemarks, remarks);
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
        if (!(object instanceof Servicebooking)) {
            return false;
        }
        Servicebooking other = (Servicebooking) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ui.Servicebooking[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
