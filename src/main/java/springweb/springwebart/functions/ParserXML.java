package springweb.springwebart.functions;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.S3Object;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import springweb.springwebart.models.Film;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ParserXML {


    public static List<Film> ReadFile(){
         final AmazonS3 s3 = AmazonS3Client.builder()
                .withRegion("ca-central-1")
                .build();
          S3Object xmlData = s3.getObject(new GetObjectRequest("data-films", "content.xml"));
          List<Film> films = new ArrayList<Film>();
          File file = new File(String.valueOf(s3.getObject(new GetObjectRequest("data-films", "content.xml"))));

        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(file);
            doc.getDocumentElement().normalize();

            NodeList nList = doc.getElementsByTagName("film");

            for (int temp = 0; temp < nList.getLength(); temp++) {

                Node nNode = nList.item(temp);

                System.out.println("\nCurrent Element :" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Film film = new Film();
                    Element eElement = (Element) nNode;

                    film.setId(eElement.getAttribute("id"));
                    film.setTitre(eElement.getElementsByTagName("titre").item(0).getTextContent());
                    film.setImg(eElement.getElementsByTagName("img").item(0).getTextContent());
                    film.setCategory(eElement.getElementsByTagName("category").item(0).getTextContent());
                    film.setProducer(eElement.getElementsByTagName("producer").item(0).getTextContent());
                    film.setPrice(eElement.getElementsByTagName("price").item(0).getTextContent());
                    film.setUrl(eElement.getElementsByTagName("url").item(0).getTextContent());
                    films.add(film);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return films;
    }
}
