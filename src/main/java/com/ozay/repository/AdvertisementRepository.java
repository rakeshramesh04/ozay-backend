package com.ozay.repository;

import com.ozay.model.Advertisement;
import com.ozay.rowmapper.AdvertisementRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.util.List;


/**
 * Created by Adi Subramanian on 10/18/2015.
 */

@Repository
public class AdvertisementRepository {

    @Inject
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public Advertisement getAdvertisement(long srNo)
    {
        String query = "select * from advertisement WHERE srNo = :srNo";
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("srNo", srNo);
        List<Advertisement> list =  namedParameterJdbcTemplate.query(query, params, new AdvertisementRowMapper(){});

        if(list.size() == 1){
            return list.get(0);
        }
        else {
            return null;
        }
    }

    public int create(Advertisement advertisement)
    {
        String insert = "insert into advertisement values (:address, :string, :imageLink, :pageLink, :srNo)";
        MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
        mapSqlParameterSource.addValue("address", advertisement.getAddress());
        mapSqlParameterSource.addValue("string", advertisement.getString());
        mapSqlParameterSource.addValue("imageLink", advertisement.getImageLink());
        mapSqlParameterSource.addValue("srNo", advertisement.getSrNo());

        int id = namedParameterJdbcTemplate.queryForObject(insert, mapSqlParameterSource, Integer.class );
        return id;
    }

}
