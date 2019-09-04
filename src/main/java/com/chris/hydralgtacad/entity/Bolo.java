package com.chris.hydralgtacad.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "police_reports")
public class Bolo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int active;
    String reason;

    @Column(name = "time_stmp")
    @Temporal(TemporalType.TIMESTAMP)
    Date timeStmp = new Date();

    public Bolo() {
    }

    public Bolo(int active, String reason, Date timeStmp) {
        this.active = active;
        this.reason = reason;
        this.timeStmp = timeStmp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Date getTimeStmp() {
        return timeStmp;
    }

    public void setTimeStmp(Date timeStmp) {
        this.timeStmp = timeStmp;
    }
}