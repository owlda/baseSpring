package springweb.springwebart.repo;

import org.springframework.beans.factory.annotation.Autowired;
import springweb.springwebart.entity.Posts;

import java.sql.ResultSet;
import java.sql.SQLException;
public class RowMapper implements org.springframework.jdbc.core.RowMapper<Posts> {


    @Override    public Posts mapRow(ResultSet resultSet, int rownum) throws SQLException {

        Posts posts = new Posts();
        posts.setId(resultSet.getInt("id"));
        posts.setName(resultSet.getString("title"));
        posts.setContent(resultSet.getString("content"));
        posts.setDate(resultSet.getString("date"));

        return posts;

    }
}
