package kr.ed.haebeop.persistence;

import kr.ed.haebeop.domain.Notice;
import kr.ed.haebeop.domain.Test;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface NoticeMapper {

    @Select("select * from notice")
    public List<Notice> noticeList();

    @Select("select * from notice where seq = #{seq}")
    public Notice noticeGet(int seq);

    @Insert("INSERT into notice (title, content) VALUES (#{title}, #{content})")
    @Options(useGeneratedKeys=true, keyProperty="seq")
    public void noticeInsert(Notice notice);

    @Update("update notice set title = #{title}, contetn = #{content} where seq = #{seq}")
    public void noticeUpdate(Notice notice);

    @Delete("delete from notice where seq = #{seq}")
    public void noticeDelete(int seq);

}