package br.ufrn.imd;

public class Musician extends Person{
    public boolean canPlayClassicalMusic;
    public boolean canImprovise;
    public boolean canCompose;

    public Musician(){
    }
    public void play(){
        
    }

    public Musician(String name, String hometown,
                    boolean canPlayClassicalMusic,
                    boolean canImprovise,
                    boolean canCompose){

        super(name, hometown);
        this.canPlayClassicalMusic = canPlayClassicalMusic;
        this.canImprovise = canImprovise;
        this.canCompose = canCompose;
    }

    public boolean CanPlayClassicalMusic() {
        return canPlayClassicalMusic;
    }

    public void setCanPlayClassicalMusic(boolean canPlayClassicalMusic) {
        this.canPlayClassicalMusic = canPlayClassicalMusic;
    }

    public boolean CanImprovise() {
        return canImprovise;
    }

    public void setCanImprovise(boolean canImprovise) {
        this.canImprovise = canImprovise;
    }

    public boolean CanCompose() {
        return canCompose;
    }

    public void setCanCompose(boolean canCompose) {
        this.canCompose = canCompose;
    }

    public String toString(){
        return ("Musico: " + getName() + '\n' +
                "Cidade Natal: " + getHometown() + '\n' +
                "Pode tocar musica classica: " + canPlayClassicalMusic + '\n' +
                "Pode improvisar: " + canImprovise + '\n' +
                "Pode compor: " + canCompose + '\n'
        );
    }

}
