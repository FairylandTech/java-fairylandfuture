/*****************************************************
 * @software: IntelliJ IDEA
 * @author: Beau Dean
 * @contact: https://fairy.host
 * @organization: https://github.com/FairylandFuture
 * @datetime: 2026-05-02 17:54:43 UTC+08:00
 ****************************************************/
package host.fairy.fairylandfuture.ibatis.type.handler;

import host.fairy.fairylandfuture.enums.GenderEnum;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Beau Dean
 * @version 1.0
 */
public class GenderEnumTypeHandler extends BaseTypeHandler<GenderEnum> {
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, GenderEnum parameter, JdbcType jdbcType) throws SQLException {
        ps.setString(i, parameter.getName());
    }
    
    @Override
    public GenderEnum getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return GenderEnum.fromName(rs.getString(columnName));
    }
    
    @Override
    public GenderEnum getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return GenderEnum.fromName(rs.getString(columnIndex));
    }
    
    @Override
    public GenderEnum getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return GenderEnum.fromName(cs.getString(columnIndex));
    }
}
