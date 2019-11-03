package springweb.springwebart.models;

public class Film {

    private String id;
    private String titre;
    private String img;
    private String category;
    private String producer;
    private String price;
    private String url;

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
