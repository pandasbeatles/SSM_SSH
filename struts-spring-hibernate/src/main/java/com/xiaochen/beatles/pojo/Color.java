package com.xiaochen.beatles.pojo;

import lombok.ToString;

import javax.persistence.*;

/**
 *
 */
@ToString
@Entity
@Table(name = "color")
public class Color {
    private int id;
    private String bname;
    private String gerder;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "bname")
    public String getbname() {
        return bname;
    }

    public void setbname(String bname) {
        this.bname = bname;
    }

    @Column(name = "gerder")
    public String getGerder() {
        return gerder;
    }

    public void setGerder(String gerder) {
        this.gerder = gerder;
    }

}
