/*
 * Copyright (c) 2020. This code is purely educational, the rights of use are
 *  reserved, the owner of the code is Ignacio Fuenzalida Veas
 *  contact ignacio.fuenzalida@alumnos.ucn.cl
 *  Do not use in production.
 */

package cl.ucn.disc.dsm.fuenz.chatdisc.repository.service.api.jsonadapter;

import org.threeten.bp.ZonedDateTime;

public class MessageReceived {
  public int id;
  public String reply;
  public int user_one_fk;
  public int user_two_fk;
  public ZonedDateTime time;
  public float latitude,longitude;
  public  String updatedAt;
  public  String createdAt;

}
