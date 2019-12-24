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
@Table(name = "salesstock", catalog = "project", schema = "")
@NamedQueries({
    @NamedQuery(name = "Salesstock.findAll", query = "SELECT s FROM Salesstock s")
    , @NamedQuery(name = "Salesstock.findById", query = "SELECT s FROM Salesstock s WHERE s.id = :id")
    , @NamedQuery(name = "Salesstock.findByBrand", query = "SELECT s FROM Salesstock s WHERE s.brand = :brand")
    , @NamedQuery(name = "Salesstock.findByModel", query = "SELECT s FROM Salesstock s WHERE s.model = :model")
    , @NamedQuery(name = "Salesstock.findByProductname", query = "SELECT s FROM Salesstock s WHERE s.productname = :productname")
    , @NamedQuery(name = "Salesstock.findByQuantity", query = "SELECT s FROM Salesstock s WHERE s.quantity = :quantity")
    , @NamedQuery(name = "Salesstock.findByPrice", query = "SELECT s FROM Salesstock s WHERE s.price = :price")
    , @NamedQuery(name = "Salesstock.findByRemarks", query = "SELECT s FROM Salesstock s WHERE s.remarks = :remarks")})
public class Salesstock implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "brand")
    private String brand;
    @Basic(optional = false)
    @Column(name = "model")
    private String model;
    @Column(name = "productname")
    private String productname;
    @Basic(optional = false)
    @Column(name = "quantity")
    private int quantity;
    @Basic(optional = false)
    @Column(name = "price")
    private int price;
    @Column(name = "remarks")
    private String remarks;

    public Salesstock() {
    }

    public Salesstock(Integer id) {
        this.id = id;
    }

    public Salesstock(Integer id, String brand, String model, int quantity, int price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.quantity = quantity;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
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

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        String oldProductname = this.productname;
        this.productname = productname;
        changeSupport.firePropertyChange("productname", oldProductname, productname);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        int oldQuantity = this.quantity;
        this.quantity = quantity;
        changeSupport.firePropertyChange("quantity", oldQuantity, quantity);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        int oldPrice = this.price;
        this.price = price;
        changeSupport.firePropertyChange("price", oldPrice, price);
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
        if (!(object instanceof Salesstock)) {
            return false;
        }
        Salesstock other = (Salesstock) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ui.Salesstock[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
