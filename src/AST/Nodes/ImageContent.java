package AST.Nodes;

public class ImageContent extends Content {
    private ImageNode image;

    public ImageContent(ImageNode image) {
        this.image = image;
    }

    public ImageNode getImage() {
        return image;
    }

    @Override
    public String toString() {
        return "ImageContent{" +
                "image=" + image +
                '}';
    }

    /**
     * @return
     */
    @Override
    public String codegenerate() {
        return image.codegenerate();
    }
}

