package ModelElements;

import java.util.ArrayList;
import java.util.List;

public class PoligonalModel {
    public List<Texture> textures;
    public List<Poligon> poligons;

    public PoligonalModel(List<Texture> textures) {
        this.poligons = new ArrayList<>();
        this.textures = textures;
    }
}