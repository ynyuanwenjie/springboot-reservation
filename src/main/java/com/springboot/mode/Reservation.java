package com.springboot.mode;

import javax.persistence.*;

/**
 * Created by yuanwenjie on 2017/3/11.
 */
@Entity
@Table(name="t_reservation")
public class Reservation {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    public Reservation() {
    }
    public Reservation(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
