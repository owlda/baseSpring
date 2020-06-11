package springweb.springwebart.models;

public class Film {

    private String id;
    private String titre;
    private String img;
    private String category;
    private String producer;
    private String price;
    private String url;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Film)) return false;

        Film film = (Film) o;

        return id.equals(film.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "Film{" +
                "id='" + id + '\'' +
                ", titre='" + titre + '\'' +
                ", img='" + img + '\'' +
                ", category='" + category + '\'' +
                ", producer='" + producer + '\'' +
                ", price='" + price + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public String getImg() {
        return img;
    }

    public String getCategory() {
        return category;
    }

    public String getProducer() {
        return producer;
    }

    public String getPrice() {
        return price;
    }

    public String getUrl() {
        return url;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setUrl(String url) {
        this.url = url;
    }


}
