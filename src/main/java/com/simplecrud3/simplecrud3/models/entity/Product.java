package com.simplecrud3.simplecrud3.models.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

import java.io.Serializable;

@Entity
@Table(name = "tbl_product")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="product_name", length = 100)
    @NotEmpty(message = "Nama tidak boleh kosong !")
    private String nama;

    @Column(name = "product_description", length = 500)
    private String deskripsi;

    private int harga;

    public Product() {
    }

    public Product(int id, String nama, String deskripsi, int harga) {
        this.id = id;
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.harga = harga;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}
