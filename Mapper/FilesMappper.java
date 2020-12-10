package com.udacity.jwdnd.course1.cloudstorage.mapper;

import com.udacity.jwdnd.course1.cloudstorage.model.Files;
import org.apache.ibatis.annotations;

import java.util.List;


@Mapper
public interface FilesMapper {

    @Select("SELECT * FROM FILES")
    List <files> findAll();

    @Select("SELECT * FROM FILES WHERE userid = #{userid}")
    public List <Files> findByUserId (int userid);

    @Select("SELECT * FROM FILES WHERE fileid = #{fileid}")
    public Files findOne (int fileid);

    @Insert("INSERT INTO FILES(Filename, Contenttype, filesize, filedata, userid)VALUES(#{file.filename}, #{file.contenttype}, #{file.filesize},#{file.filedata}, #{userid})")
    public int insertFile(Files file, int userid);

    @Delete("DELETE FROM FILES WHERE fileid = #{fileid}")
    public int deleteFile(int fileid);
}