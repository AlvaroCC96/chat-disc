/*
 * Copyright (c) 2020. This code is purely educational, the rights of use are
 *  reserved, the owner of the code is Ignacio Fuenzalida Veas
 *  contact ignacio.fuenzalida@alumnos.ucn.cl
 *  Do not use in production.
 */

package cl.ucn.disc.dsm.fuenz.chatdisc.room.entity;


import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "user_table")
public class User {
    /*
   The unique user id
   //FIXME: Eliminar la autogeneracion de id, esta sera generada en el servidor.
    */
    @PrimaryKey(autoGenerate = true)
    private int userId = 0;
    /*
    The name of the user
     */
    private final String username;
    /*
    the email of the user
     */
    private final String email;
    /*
    The password of the user
     */
    private final String pwd;

    public User(String username, String email, String pwd) {
        this.username = username;
        this.email = email;
        this.pwd = pwd;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
