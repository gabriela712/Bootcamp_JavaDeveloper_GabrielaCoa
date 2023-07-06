package Clase13_3;

public class Personaje {
   private int experiencia;
   private int level;
   private int hp;
   private int mana;

   public Personaje(int experiencia, int level, int hp, int mana) {
      this.experiencia = experiencia;
      this.level = level;
      this.hp = hp;
      this.mana = mana;
   }

   public int getExperiencia() {
      return experiencia;
   }

   public void setExperiencia(int experiencia) {
      this.experiencia = experiencia;
   }

   public int getLevel() {
      return level;
   }

   public void setLevel(int level) {
      this.level = level;
   }

   public int getHp() {
      return hp;
   }

   public void setHp(int hp) {
      this.hp = hp;
   }

   public int getMana() {
      return mana;
   }

   public void setMana(int mana) {
      this.mana = mana;
   }
}
