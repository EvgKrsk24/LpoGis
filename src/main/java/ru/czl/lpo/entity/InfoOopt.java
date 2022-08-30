package ru.czl.lpo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "info_oopt", schema = "public", catalog = "LpoGis")
public class InfoOopt {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic
    @Column(name = "name", nullable = true, length = -1)
    private String name;
    @Basic
    @Column(name = "order_id", nullable = true)
    private Integer orderId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InfoOopt infoOopt = (InfoOopt) o;

        if (id != null ? !id.equals(infoOopt.id) : infoOopt.id != null) return false;
        if (name != null ? !name.equals(infoOopt.name) : infoOopt.name != null) return false;
        if (orderId != null ? !orderId.equals(infoOopt.orderId) : infoOopt.orderId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (orderId != null ? orderId.hashCode() : 0);
        return result;
    }
}
