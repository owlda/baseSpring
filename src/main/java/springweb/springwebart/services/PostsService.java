package springweb.springwebart.services;
import springweb.springwebart.entity.Posts;
import javax.sql.DataSource;
import java.util.List;

public interface PostsService {

    // data source to create a connection to db
    public void setDataSource(DataSource ds );

    // create a record in the posts db table posts
    public boolean create(Posts posts);

    // retrive a single post
    public Posts getPosts(int id);

    // retrive all posts
    public List<Posts> getAllPosts();

    // delete a single posts in the posts
    public boolean delete(Posts post);

    // update a single post in the posts
    public boolean update(Posts posts);

    // cleanup a posts in the table
    public void cleanup();


}
