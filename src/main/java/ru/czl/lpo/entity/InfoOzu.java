package ru.czl.lpo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "info_ozu", schema = "public", catalog = "LpoGis")
public class InfoOzu {
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
    @Basic
    @Column(name = "num", nullable = true)
    private Integer num;

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

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InfoOzu infoOzu = (InfoOzu) o;

        if (id != null ? !id.equals(infoOzu.id) : infoOzu.id != null) return false;
        if (name != null ? !name.equals(infoOzu.name) : infoOzu.name != null) return false;
        if (orderId != null ? !orderId.equals(infoOzu.orderId) : infoOzu.orderId != null) return false;
        if (num != null ? !num.equals(infoOzu.num) : infoOzu.num != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (orderId != null ? orderId.hashCode() : 0);
        result = 31 * result + (num != null ? num.hashCode() : 0);
        return result;
    }
}
