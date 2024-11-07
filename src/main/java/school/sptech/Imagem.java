package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {

    private List<Figura> figuras;

    public List<Figura> getFiguras() {
        return figuras;
    }

    public void setFiguras(List<Figura> figuras) {
        this.figuras = figuras;
    }

    public Imagem() {
        figuras = new ArrayList<>();
    }

    public void adicionar(Figura figura) {
        figuras.add(figura);
    }

    public Double calcularSomaDasAreas() {

        Double soma = 0.0;

        for(int i = 0; i < figuras.size(); i++) {
            soma += figuras.get(i).calcularArea();
        }

        return soma;
    }

    public List<Figura> buscarPorAreaMaiorQue20() {

        List<Figura> AreaMaiorAVinte = new ArrayList<>();

        for (int i = 0; i < figuras.size(); i++) {
            if (figuras.get(i).calcularArea() > 20) {
                AreaMaiorAVinte.add(figuras.get(i));
            }
        }

        return AreaMaiorAVinte;
    }

    public List<Figura> buscarQuadrados() {
        List<Figura> quadrados = new ArrayList<>();

        for (Figura figura : figuras) {
            if(figura instanceof Quadrado) {
                quadrados.add(figura);
            }
        }

        return quadrados;
    }
}
