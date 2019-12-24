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
@Table(name = "salesbooking", catalog = "project", schema = "")
@NamedQueries({
    @NamedQuery(name = "Salesbooking.findAll", query = "SELECT s FROM Salesbooking s")
    , @NamedQuery(name = "Salesbooking.findById", query = "SELECT s FROM Salesbooking s WHERE s.id = :id")
    , @NamedQuery(name = "Salesbooking.findByCustomer", query = "SELECT s FROM Salesbooking s WHERE s.customer = :customer")
    , @NamedQuery(name = "Salesbooking.findByBrand", query = "SELECT s FROM Salesbooking s WHERE s.brand = :brand")
    , @NamedQuery(name = "Salesbooking.findByModel", query = "SELECT s FROM Salesbooking s WHERE s.model = :model")
    , @NamedQuery(name = "Salesbooking.findByProduct", query = "SELECT s FROM Salesbooking s WHERE s.product = :product")
    , @NamedQuery(name = "Salesbooking.findByRemarks", query = "SELECT s FROM Salesbooking s WHERE s.remarks = :remarks")})
public class Salesbooking implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "customer")
    private String customer;
    @Column(name = "brand")
    private String brand;
    @Column(name = "model")
    private String model;
    @Column(name = "product")
    private String product;
    @Column(name = "remarks")
    private String remarks;

    public Salesbooking() {
    }

    public Salesbooking(Integer id) {
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
        if (!(object instanceof Salesbooking)) {
            return false;
        }
        Salesbooking other = (Salesbooking) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ui.Salesbooking[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
