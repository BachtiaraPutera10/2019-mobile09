package id.ac.polinema.recyclerviewsangatsederhana.models;

public class SuperHero {
    private String heroName;

    public SuperHero(String heroName){
        this.setHeroName(heroName);
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }
}