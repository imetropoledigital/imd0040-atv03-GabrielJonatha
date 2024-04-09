package br.ufrn.imd;

public class GuitarPlayer extends Musician{
    public int howManyYearsPlaying;
    public boolean canPlayElectricGuitar;
    public boolean canPlayAcousticGuitar;
    public GuitarPlayer() {
    }
    public GuitarPlayer(String name, String hometown, boolean canPlayClassicalMusic, boolean canImprovise, boolean canCompose, int howManyYearsPlaying, boolean canPlayElectricGuitar, boolean canPlayAcousticGuitar) {
        super(name, hometown, canPlayClassicalMusic, canImprovise, canCompose);
        this.howManyYearsPlaying = howManyYearsPlaying;
        this.canPlayElectricGuitar = canPlayElectricGuitar;
        this.canPlayAcousticGuitar = canPlayAcousticGuitar;
    }

    public int getHowManyYearsPlaying() {
        return howManyYearsPlaying;
    }

    public void setHowManyYearsPlaying(int howManyYearsPlaying) {
        this.howManyYearsPlaying = howManyYearsPlaying;
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
                "Pode tocar musica classica? " + canPlayClassicalMusic + '\n' +
                "Pode improvisar? " + canImprovise + '\n' +
                "Pode compor? " + canCompose + '\n' +
                "Toca ha quantos anos? " + howManyYearsPlaying + '\n' +
                "Pode tocar guitarra eletrica? " + canPlayElectricGuitar + '\n' +
                "Pode tocar guitarra acustica? " + canPlayAcousticGuitar + '\n'
        );
    }
}

