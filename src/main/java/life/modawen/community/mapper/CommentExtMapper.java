package life.modawen.community.mapper;

import life.modawen.community.model.Comment;
import life.modawen.community.model.CommentExample;
import life.modawen.community.model.Question;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface CommentExtMapper {
    int incCommentCount(Comment comment);
}