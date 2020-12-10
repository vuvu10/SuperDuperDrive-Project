package com.udacity.jwdnd.course1.cloudstorage.mapper;

import com.udacity.jwdnd.course1.cloudstorage.model.Credentails;
import org.apache.ibatis.annotations;

import java.util.list;

@Mapper
public interface CredentialsMapper {

    @Select("SELECT * FROM CREDENTIALS")
    List <credentials> findAll();

    @Select("SELECT * FROM CREDENTIALS WHERE credentialid = #{credentialid}")
    public Credentials findOne(int Credentialid);

    @Select("SELECT * FROM CREDENTIALS WHERE userid = #{userid}")
    public List <Crdenetials> findByUserId (int userid);

    @ Insert("INSERT INTO CREDENTIALS(url, username, key, password, userid)VALUES(#{credential.url}, #{credential.username}, #{credential.key}, #{credential.password}, #{userid})")
    public int insertCredentials(Credentials credential, int userid);

    @Delete("DELETE FROM CREDENTIALS WHERE credentialid = #{credentialid}")
    public int deleteCredentials(int credentialid);

    @Update("UPDATE CREDENTIALS SET url = #{url}, username=#{username}, key= #{key}, password = #{password} WHERE credentialid = #{credentialid}")
    public int updateCredentials(Credentials credential);


}