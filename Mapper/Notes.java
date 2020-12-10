package com.udacity.jwdnd.course1.cloudstorage.mapper;

import com.udacity.jwdnd.course1.cloudstorage.model.Notes;
import org.apache.ibatis.annotations;

import java.util.List;

@Mapper
public interface NotesMapper {

    @Select("SELECT * FROM NOTES WHERE userid = #{userid}")
    public List <notes> findbyUserId(int userid);

    @Select("SELECT * FROM NOTES WHERE noteid = #{noteid}")
    public Notes findOne(int noteid);

    @Insert("INSERT INTO NOTES(notetitle, notedescription,userid)VALUES(#{note.notetitle}, #{note.notedeescription}, #{userid})")
    public int insertNote(Notes note, int userid);

    @Delete("DELETE FROM NOTES WHERE noteid = #{noteid}")
    public int deleteNote(int noteid);

    @Update("UPDATE NOTES GET notetitle = #{notetitle}, notedescription = #{notedescription} WHERE noteid = #{noteid}")
    public int updateNote(Notes note);
}