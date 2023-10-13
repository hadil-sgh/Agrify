/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agrify.entities;

/**
 *
 * @author tbagh
 */

import java.util.Date;

public class Presence {
    private int id_p;                
    private int user_id;             
    private Date date;             
    private String presenceState;   

    public Presence() {
    }

    public Presence(int user_id, Date date, String presenceState) {
        this.user_id = user_id;
        this.date = date;
        this.presenceState = presenceState;
    }

    public Presence(int userId, String date, String presenceState) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId_p() {
        return id_p;
    }

    public void setId_p(int id_p) {
        this.id_p = id_p;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPresenceState() {
        return presenceState;
    }

    public void setPresenceState(String presenceState) {
        this.presenceState = presenceState;
    }

}
