public class ImageProxy implements Element, Picture {
    private String url;
    private Dimension dim = new Dimension(300, 300);
    private Image img;

    public ImageProxy(String url) {
        this.url = url;
    }

    public ImageProxy(ImageProxy imageProxy) {
        this.url = imageProxy.url;
        this.dim = imageProxy.dim;
        this.img = imageProxy.img;
    }

    @Override
    public void print() {
        System.out.println("Image proxy with url:" + url + " and dimension:" + dim);

        loadImage().print();
    }

    private Image loadImage() {
        if (this.img == null) {
            this.img = new Image(url);
        }

        return this.img;
    }

    @Override
    public void add(Element element) throws Exception {
        //not needed
    }

    @Override
    public void remove(Element element) {
        //not needed
    }

    @Override
    public Element clone() {
        return new ImageProxy(this.url);
    }

    @Override
    public String url() {
        return null;
    }

    @Override
    public Dimension dim() {
        return null;
    }
}