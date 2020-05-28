package com.behavorial_patterns.strategy;

public class Context {
    private CharacterStrategy characterStrategy;

    public Context(CharacterStrategy characterStrategy){
        this.characterStrategy = characterStrategy;
    }

    public CharacterStrategy getCharacterStrategy() {
        return characterStrategy;
    }

    public void setCharacterStrategy(CharacterStrategy characterStrategy) {
        this.characterStrategy = characterStrategy;
    }

    public void demo(){
        this.characterStrategy.execute();
    }
}
