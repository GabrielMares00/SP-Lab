public class Image implements Element {
    private String imageName;

    public Image(String imageName) {
        this.imageName = imageName;
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
    public boolean find(Element element) {
        if (!(element instanceof Image))
            return false;
        else {
            return ((Image) element).imageName.equals(this.imageName);
        }
    }
}
