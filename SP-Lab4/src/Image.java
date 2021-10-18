import java.util.concurrent.TimeUnit;

public class Image implements Element, Picture {
    private String imageName;
    private Dimension dim = new Dimension(400,400);

    public Image(String imageName) {
        this.imageName = imageName;

        try {
            TimeUnit.SECONDS.sleep(5);
        }
        catch( InterruptedException e) { e.printStackTrace(); }
    }

    public Image(Image image) {
        this.imageName = image.imageName;
    }

    public void print() {
        System.out.println(this.imageName);
    }

    @Override
    public void add(Element element) {
        //not needed
    }

    @Override
    public void remove(Element element) {
        //not needed
    }

    @Override
    public String url() {
        return this.imageName;
    }

    @Override
    public Dimension dim() {
        return this.dim;
    }
}
