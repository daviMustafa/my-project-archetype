package com.demo.entity;

import com.demo.converters.LocalDateTimeAttributeConverter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@MappedSuperclass
public class PersistentObject<ID extends Serializable> implements Serializable {

    private static final long serialVersionUID = 5271997378551365770L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private ID id;

    @Column(name = "createdby", columnDefinition = "nvarchar(100)")
    private String createdby;

    @Column(name = "created", columnDefinition = "DATETIME")
    @Convert(converter = LocalDateTimeAttributeConverter.class)
    private LocalDateTime created;

    @Column(name = "alteredby", columnDefinition = "nvarchar(100)")
    private String alteredby;

    @Column(name = "altered", columnDefinition = "DATETIME")
    @Convert(converter = LocalDateTimeAttributeConverter.class)
    private LocalDateTime altered;

    public PersistentObject() {}

    public PersistentObject(String createdby, LocalDateTime created){
        this.createdby = createdby;
        this.created = created;
    }

    public ID getId() {
        return id;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public String getAlteredby() {
        return alteredby;
    }

    public void setAlteredby(String alteredby) {
        this.alteredby = alteredby;
    }

    public LocalDateTime getAltered() {
        return altered;
    }

    public void setAltered(LocalDateTime altered) {
        this.altered = altered;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersistentObject<?> that = (PersistentObject<?>) o;

        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
