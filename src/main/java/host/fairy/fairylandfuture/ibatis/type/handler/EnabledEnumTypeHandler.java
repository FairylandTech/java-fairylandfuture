/*****************************************************
 * @software: IntelliJ IDEA
 * @author: Beau Dean
 * @contact: https://fairy.host
 * @organization: https://github.com/FairylandFuture
 * @datetime: 2026-03-02 21:10:05 UTC+08:00
 ****************************************************/
package host.fairy.fairylandfuture.ibatis.type.handler;

import host.fairy.fairylandfuture.enums.EnabledEnum;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Beau Dean
 * @version 1.0
 */
@MappedTypes(EnabledEnum.class)
@MappedJdbcTypes(JdbcType.CHAR)
public class EnabledEnumTypeHandler extends BaseTypeHandler<EnabledEnum> {
    
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, EnabledEnum parameter, JdbcType jdbcType) throws SQLException {
        ps.setString(i, parameter.getName());
    }
    
    @Override
    public EnabledEnum getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return EnabledEnum.fromName(rs.getString(columnName));
    }
    
    @Override
    public EnabledEnum getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return EnabledEnum.fromName(rs.getString(columnIndex));
    }
    
    @Override
    public EnabledEnum getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return EnabledEnum.fromName(cs.getString(columnIndex));
    }
}
