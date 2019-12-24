/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Sreerag PR
 */
@Entity
@Table(name = "service", catalog = "project", schema = "")
@NamedQueries({
    @NamedQuery(name = "Service.findAll", query = "SELECT s FROM Service s")
    , @NamedQuery(name = "Service.findById", query = "SELECT s FROM Service s WHERE s.id = :id")
    , @NamedQuery(name = "Service.findByDate", query = "SELECT s FROM Service s WHERE s.date = :date")
    , @NamedQuery(name = "Service.findByCustomer", query = "SELECT s FROM Service s WHERE s.customer = :customer")
    , @NamedQuery(name = "Service.findByProduct", query = "SELECT s FROM Service s WHERE s.product = :product")
    , @NamedQuery(name = "Service.findByBrand", query = "SELECT s FROM Service s WHERE s.brand = :brand")
    , @NamedQuery(name = "Service.findByModel", query = "SELECT s FROM Service s WHERE s.model = :model")
    , @NamedQuery(name = "Service.findByComplaint", query = "SELECT s FROM Service s WHERE s.complaint = :complaint")
    , @NamedQuery(name = "Service.findByEstimatecost", query = "SELECT s FROM Service s WHERE s.estimatecost = :estimatecost")
    , @NamedQuery(name = "Service.findByExpecteddeilvery", query = "SELECT s FROM Service s WHERE s.expecteddeilvery = :expecteddeilvery")
    , @NamedQuery(name = "Service.findByStatus", query = "SELECT s FROM Service s WHERE s.status = :status")
    , @NamedQuery(name = "Service.findByRemarks", query = "SELECT s FROM Service s WHERE s.remarks = :remarks")})
public class Service implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Basic(optional = false)
    @Column(name = "customer")
    private String customer;
    @Basic(optional = false)
    @Column(name = "product")
    private String product;
    @Column(name = "brand")
    private String brand;
    @Column(name = "model")
    private String model;
    @Basic(optional = false)
    @Column(name = "complaint")
    private String complaint;
    @Column(name = "estimatecost")
    private Integer estimatecost;
    @Column(name = "expecteddeilvery")
    @Temporal(TemporalType.DATE)
    private Date expecteddeilvery;
    @Basic(optional = false)
    @Column(name = "status")
    private String status;
    @Column(name = "remarks")
    private String remarks;

    public Service() {
    }

    public Service(Integer id) {
        this.id = id;
    }

    public Service(Integer id, Date date, String customer, String product, String complaint, String status) {
        this.id = id;
        this.date = date;
        this.customer = customer;
        this.product = product;
        this.complaint = complaint;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        Date oldDate = this.date;
        this.date = date;
        changeSupport.firePropertyChange("date", oldDate, date);
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        String oldCustomer = this.customer;
        this.customer = customer;
        changeSupport.firePropertyChange("customer", oldCustomer, customer);
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        String oldProduct = this.product;
        this.product = product;
        changeSupport.firePropertyChange("product", oldProduct, product);
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

    public String getComplaint() {
        return complaint;
    }

    public void setComplaint(String complaint) {
        String oldComplaint = this.complaint;
        this.complaint = complaint;
        changeSupport.firePropertyChange("complaint", oldComplaint, complaint);
    }

    public Integer getEstimatecost() {
        return estimatecost;
    }

    public void setEstimatecost(Integer estimatecost) {
        Integer oldEstimatecost = this.estimatecost;
        this.estimatecost = estimatecost;
        changeSupport.firePropertyChange("estimatecost", oldEstimatecost, estimatecost);
    }

    public Date getExpecteddeilvery() {
        return expecteddeilvery;
    }

    public void setExpecteddeilvery(Date expecteddeilvery) {
        Date oldExpecteddeilvery = this.expecteddeilvery;
        this.expecteddeilvery = expecteddeilvery;
        changeSupport.firePropertyChange("expecteddeilvery", oldExpecteddeilvery, expecteddeilvery);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        String oldStatus = this.status;
        this.status = status;
        changeSupport.firePropertyChange("status", oldStatus, status);
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
        if (!(object instanceof Service)) {
            return false;
        }
        Service other = (Service) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ui.Service[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
