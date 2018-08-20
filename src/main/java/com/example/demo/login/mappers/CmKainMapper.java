package com.example.demo.login.mappers;

import com.example.demo.login.entity.CmKain;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface CmKainMapper {

    @Results({@Result(property = "authenId", column = "authen_id"),
            @Result(property = "id", column = "id"),
            @Result(property = "organizationId", column = "organization_id")})
    @Select("Select * from login.cm_kain cm where cm.organization_id = #{organizationId} ")
    CmKain getById(@Param("organizationId") String id);
}
