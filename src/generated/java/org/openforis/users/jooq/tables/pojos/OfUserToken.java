/*
 * This file is generated by jOOQ.
*/
package org.openforis.users.jooq.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OfUserToken implements Serializable {

    private static final long serialVersionUID = -745190286;

    private Long      userId;
    private String    token;
    private Timestamp tokenDatetime;

    public OfUserToken() {}

    public OfUserToken(OfUserToken value) {
        this.userId = value.userId;
        this.token = value.token;
        this.tokenDatetime = value.tokenDatetime;
    }

    public OfUserToken(
        Long      userId,
        String    token,
        Timestamp tokenDatetime
    ) {
        this.userId = userId;
        this.token = token;
        this.tokenDatetime = tokenDatetime;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Timestamp getTokenDatetime() {
        return this.tokenDatetime;
    }

    public void setTokenDatetime(Timestamp tokenDatetime) {
        this.tokenDatetime = tokenDatetime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("OfUserToken (");

        sb.append(userId);
        sb.append(", ").append(token);
        sb.append(", ").append(tokenDatetime);

        sb.append(")");
        return sb.toString();
    }
}
