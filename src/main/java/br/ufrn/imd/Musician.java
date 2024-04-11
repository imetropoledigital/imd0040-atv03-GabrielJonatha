package br.ufrn.imd;

public class Musician extends Person{
    public boolean PlayClassicalMusic;
    public boolean canImprovise;
    public boolean canCompose;

    public Musician(){
    }
    public void play(){
        
    }

    public Musician(String name, String hometown,
                    boolean PlayClassicalMusic,
                    boolean canImprovise,
                    boolean canCompose){

        super(name, hometown);
        this.PlayClassicalMusic = PlayClassicalMusic;
        this.canImprovise = canImprovise;
        this.canCompose = canCompose;
    }

    public boolean PlayClassicalMusic() {
        return PlayClassicalMusic;
    }

    public void setPlayClassicalMusic(boolean PlayClassicalMusic) {
        this.PlayClassicalMusic = PlayClassicalMusic;
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
                "Pode tocar musica classica: " + PlayClassicalMusic + '\n' +
                "Pode improvisar: " + canImprovise + '\n' +
                "Pode compor: " + canCompose + '\n'
        );
    }

}
