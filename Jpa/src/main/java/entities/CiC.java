/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author thabs
 */
@Entity
public class CiC implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "TYPE", nullable = false, length = 10)
    private String type;
    @Column(name = "SUBJECT", nullable = false, length = 10)
    private String subject;
    @Column(name = "BODY", nullable = false, length = 100)
    private String body;
    @Column(name = "SOURCE", nullable = false, length = 10)
    private String sourceSystem;
    @Column(name = "cicTimestamp")
    private Timestamp cicTimestamp;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    
    public String getSourceSystem() {
        return sourceSystem;
    }

    public void setSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
    }

    
    public Timestamp getTimestamp() {
        return cicTimestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.cicTimestamp = timestamp;
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
        if (!(object instanceof CiC)) {
            return false;
        }
        CiC other = (CiC) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.CiC[ id=" + id + " ]";
    }
    
}
