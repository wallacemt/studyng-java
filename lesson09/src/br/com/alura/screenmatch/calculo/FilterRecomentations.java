package br.com.alura.screenmatch.calculo;

public class FilterRecomentations {
    private String recomentation;

    public void filter(Classificavel classificavel ) {
        if(classificavel.getClassificacao() >= 4) {
            System.out.println("Está entre os preferidos do momento!");
        }else if (classificavel.getClassificacao() >=2) {
            System.out.println("Muito bem avalliado no momento!");
        }else{
            System.out.println("Coloque na sua lista para assistir depois!");
        }
    }
}
