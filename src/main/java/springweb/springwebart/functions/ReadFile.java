package springweb.springwebart.functions;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.S3Object;
import springweb.springwebart.models.Film;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {


    public static List<Film> Show(){


        final AmazonS3 s3 = AmazonS3Client.builder()
                .withRegion("ca-central-1")
                .build();
        S3Object data = s3.getObject(new GetObjectRequest("data-films", "content-films.txt"));
        List<Film> films = new ArrayList<>();
        InputStream inputStream = data.getObjectContent();

        try {
            String [] lines;
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(data.getObjectContent()));
            String line = "";
            while((line = bufferedReader.readLine()) != null){

                    Film film = new Film();
                    lines = line.split(";");
                    film.setId(lines[0]);
                    System.out.println(lines[0]);
                    film.setTitre(lines[1]);
                    System.out.println(lines[1]);
                    film.setImg(lines[2]);
                    System.out.println(lines[2]);
                    film.setCategory(lines[3]);
                    System.out.println(lines[3]);
                    film.setProducer(lines[4]);
                    System.out.println(lines[4]);
                    film.setPrice(lines[5]);
                    System.out.println(lines[5]);
                    film.setUrl(lines[6]);
                    films.add(film);



            }
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return films;
    }

}
