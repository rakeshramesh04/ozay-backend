package com.ozay.rowmapper;

import com.ozay.model.Advertisement;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Adi Subramanian on 10/15/2015.
 */
public class AdvertisementRowMapper implements RowMapper {

    @Override
    public Advertisement mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Advertisement advertisement = new Advertisement();
        advertisement.setAddress(resultSet.getString("address"));
        advertisement.setImageLink(resultSet.getString("imageLink"));
        advertisement.setPageLink(resultSet.getString("pageLink"));
        advertisement.setSrNo(resultSet.getInt("srNo"));
        return advertisement;
    }
}
