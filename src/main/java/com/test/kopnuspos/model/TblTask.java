package com.test.kopnuspos.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;
import java.time.Instant;

@Entity
@Table(name = "tbl_task")
public class TblTask {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "judul", length = 200)
    private String judul;

    @Column(name = "deskripsi", length = 200)
    private String deskripsi;

    @Column(name = "waktu")
    private Timestamp waktu;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public Timestamp getWaktu() {
        return waktu;
    }

    public void setWaktu(Timestamp waktu) {
        this.waktu = waktu;
    }

    public static TblTask fromSourceObject(TaskRequest source) {
        TblTask target = new TblTask();
        target.setJudul(source.getJudul());
        target.setDeskripsi(source.getDeskripsi());
        target.setWaktu(source.getWaktu());
        return target;
    }

}