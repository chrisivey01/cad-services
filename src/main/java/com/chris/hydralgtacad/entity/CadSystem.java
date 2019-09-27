package com.chris.hydralgtacad.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "pd_cad")
public class CadSystem {

    @Id
    int id;

    @Column(name="player_name")
    String playerName;
    String reason;

    @Column(name="arresting_officer")
    String arrestingOfficer;

    @Column(name="time_stamp")
    @Temporal(TemporalType.TIMESTAMP)
    Date timeStamp = new Date();


    public CadSystem(){}

    public CadSystem(int id, String playerName, String reason, String arrestingOfficer, Date timeStamp) {
        this.id = id;
        this.playerName = playerName;
        this.reason = reason;
        this.arrestingOfficer = arrestingOfficer;
        this.timeStamp = timeStamp;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getArrestingOfficer() {
        return arrestingOfficer;
    }

    public void setArrestingOfficer(String arrestingOfficer) {
        this.arrestingOfficer = arrestingOfficer;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }
}
