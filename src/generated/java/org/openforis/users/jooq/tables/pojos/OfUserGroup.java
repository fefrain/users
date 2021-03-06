/*
 * This file is generated by jOOQ.
*/
package org.openforis.users.jooq.tables.pojos;


import java.io.Serializable;

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
public class OfUserGroup implements Serializable {

    private static final long serialVersionUID = 998069133;

    private Long   userId;
    private Long   groupId;
    private String statusCode;
    private String roleCode;

    public OfUserGroup() {}

    public OfUserGroup(OfUserGroup value) {
        this.userId = value.userId;
        this.groupId = value.groupId;
        this.statusCode = value.statusCode;
        this.roleCode = value.roleCode;
    }

    public OfUserGroup(
        Long   userId,
        Long   groupId,
        String statusCode,
        String roleCode
    ) {
        this.userId = userId;
        this.groupId = groupId;
        this.statusCode = statusCode;
        this.roleCode = roleCode;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getGroupId() {
        return this.groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getStatusCode() {
        return this.statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getRoleCode() {
        return this.roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("OfUserGroup (");

        sb.append(userId);
        sb.append(", ").append(groupId);
        sb.append(", ").append(statusCode);
        sb.append(", ").append(roleCode);

        sb.append(")");
        return sb.toString();
    }
}
