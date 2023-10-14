package GOIT;

public class TexturePool {

    private static TexturePool instance = new TexturePool();

    public TexturePool() {
    }

    public static TexturePool getInstance(){
        return instance;
    }

    public String getTexture(String textureName) {
        return "Get texture " + textureName;
    }

}

class TexturePoolTest {
    public static void main(String[] args) {
        //Get texture MainHero
        System.out.println(TexturePool.getInstance().getTexture("MainHero"));
        System.out.println(TexturePool.getInstance() == TexturePool.getInstance());

    }
}
