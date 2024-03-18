import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

class image_read_write {
    public static void main(String[] args) {
        int width = 500;
        int height = 500;
        BufferedImage bi = null;
        try {
            BufferedImage image = readImage(width, height, bi);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static BufferedImage readImage(int width, int height, BufferedImage bi) throws IOException {
        File f = new File("E://DSA//src//your-name-shooting-1920x1080-14938.jpg");
        if (!f.exists()) {
            throw new IOException("Input image file does not exist: " + f.getAbsolutePath());
        }
        bi = ImageIO.read(f);
        File f2 = new File("E://DSA//src//new.jpg");
        ImageIO.write(bi, "jpg", f2);
        return bi;
    }
}
