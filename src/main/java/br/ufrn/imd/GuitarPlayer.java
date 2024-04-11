package br.ufrn.imd;

public class GuitarPlayer extends Musician{
    public int howManyYears;
    public boolean canPlayElectricGuitar;
    public boolean canPlayAcousticGuitar;
    
    public GuitarPlayer() {
    }
    public void playGuitar(){
        
    }
    
    public GuitarPlayer(String name, String hometown, boolean PlayClassicalMusic, boolean canImprovise, boolean canCompose, int howManyYears, boolean canPlayElectricGuitar, boolean canPlayAcousticGuitar) {
        super(name, hometown, PlayClassicalMusic, canImprovise, canCompose);
        this.howManyYears = howManyYears;
        this.canPlayElectricGuitar = canPlayElectricGuitar;
        this.canPlayAcousticGuitar = canPlayAcousticGuitar;
    }

    public int gethowManyYears() {
        return howManyYears;
    }

    public void sethowManyYears(int howManyYears) {
        this.howManyYears = howManyYears;
    }

    public boolean canPlayElectricGuitar() {
        return canPlayElectricGuitar;
    }

    public void setCanPlayElectricGuitar(boolean canPlayElectricGuitar) {
        this.canPlayElectricGuitar = canPlayElectricGuitar;
    }

    public boolean canPlayAcousticGuitar() {
        return canPlayAcousticGuitar;
    }

    public void setCanPlayAcousticGuitar(boolean canPlayAcousticGuitar) {
        this.canPlayAcousticGuitar = canPlayAcousticGuitar;
    }

    @Override
    public String toString() {
        return  ("Guitarrista: " + getName() + '\n' +
                "Cidade Natal: " + getHometown() + '\n' +
                "Pode tocar musica classica? " + PlayClassicalMusic + '\n' +
                "Pode improvisar? " + canImprovise + '\n' +
                "Pode compor? " + canCompose + '\n' +
                "Toca ha quantos anos? " + howManyYears + '\n' +
                "Pode tocar guitarra eletrica? " + canPlayElectricGuitar + '\n' +
                "Pode tocar guitarra acustica? " + canPlayAcousticGuitar + '\n'
        );
    }
}

