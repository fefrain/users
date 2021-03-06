/*
 * This file is generated by jOOQ.
*/
package org.openforis.users.jooq.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.openforis.users.jooq.Keys;
import org.openforis.users.jooq.OfUsers;
import org.openforis.users.jooq.tables.records.OfUserGroupRecord;


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
public class OfUserGroup extends TableImpl<OfUserGroupRecord> {

    private static final long serialVersionUID = 696265891;

    /**
     * The reference instance of <code>OF_USERS.OF_USER_GROUP</code>
     */
    public static final OfUserGroup OF_USER_GROUP = new OfUserGroup();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OfUserGroupRecord> getRecordType() {
        return OfUserGroupRecord.class;
    }

    /**
     * The column <code>OF_USERS.OF_USER_GROUP.USER_ID</code>.
     */
    public final TableField<OfUserGroupRecord, Long> USER_ID = createField("USER_ID", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>OF_USERS.OF_USER_GROUP.GROUP_ID</code>.
     */
    public final TableField<OfUserGroupRecord, Long> GROUP_ID = createField("GROUP_ID", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>OF_USERS.OF_USER_GROUP.STATUS_CODE</code>. P=Pending, A=Accepted, R=Rejected
     */
    public final TableField<OfUserGroupRecord, String> STATUS_CODE = createField("STATUS_CODE", org.jooq.impl.SQLDataType.CHAR.length(1).nullable(false).defaultValue(org.jooq.impl.DSL.field("'P'", org.jooq.impl.SQLDataType.CHAR)), this, "P=Pending, A=Accepted, R=Rejected");

    /**
     * The column <code>OF_USERS.OF_USER_GROUP.ROLE_CODE</code>. OWN=Owner, ADM=Administrator, OPR=Operator, VWR=Viewer
     */
    public final TableField<OfUserGroupRecord, String> ROLE_CODE = createField("ROLE_CODE", org.jooq.impl.SQLDataType.CHAR.length(3).nullable(false).defaultValue(org.jooq.impl.DSL.field("'VWR'", org.jooq.impl.SQLDataType.CHAR)), this, "OWN=Owner, ADM=Administrator, OPR=Operator, VWR=Viewer");

    /**
     * Create a <code>OF_USERS.OF_USER_GROUP</code> table reference
     */
    public OfUserGroup() {
        this("OF_USER_GROUP", null);
    }

    /**
     * Create an aliased <code>OF_USERS.OF_USER_GROUP</code> table reference
     */
    public OfUserGroup(String alias) {
        this(alias, OF_USER_GROUP);
    }

    private OfUserGroup(String alias, Table<OfUserGroupRecord> aliased) {
        this(alias, aliased, null);
    }

    private OfUserGroup(String alias, Table<OfUserGroupRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return OfUsers.OF_USERS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<OfUserGroupRecord> getPrimaryKey() {
        return Keys.OF_USER_GROUP_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<OfUserGroupRecord>> getKeys() {
        return Arrays.<UniqueKey<OfUserGroupRecord>>asList(Keys.OF_USER_GROUP_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<OfUserGroupRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<OfUserGroupRecord, ?>>asList(Keys.OF_USER_GROUP_USER_FK, Keys.OF_USER_GROUP_GROUP_FK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OfUserGroup as(String alias) {
        return new OfUserGroup(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public OfUserGroup rename(String name) {
        return new OfUserGroup(name, null);
    }
}
