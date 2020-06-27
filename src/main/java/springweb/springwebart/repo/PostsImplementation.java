package springweb.springwebart.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import springweb.springwebart.entity.Posts;
import springweb.springwebart.services.PostsService;

import javax.sql.DataSource;
import java.util.List;
public class PostsImplementation implements PostsService {


    private JdbcTemplate jdbcTemplate;

    @Override
    public void setDataSource(DataSource ds) {

        jdbcTemplate = new JdbcTemplate(ds);

    }

    @Override
    public boolean create(Posts posts) {
        return false;
    }

    @Override
    public Posts getPosts(int id) {
        return null;
    }

    @Override
    public List<Posts> getAllPosts() {

        String sqlQuery = "SELECT * FROM webcontent.posts";
        List<Posts> listOfPosts = jdbcTemplate.query(sqlQuery, new RowMapper());

        return listOfPosts;
    }

    @Override
    public boolean delete(Posts post) {
        return false;
    }

    @Override
    public boolean update(Posts posts) {
        return false;
    }

    @Override
    public void cleanup() {

    }
}
