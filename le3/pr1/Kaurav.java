class Kaurav extends Bharatvanshi {
    public String name;

    public Kaurav(String name) {
        this.name = name;
    }

    @Override
    public void fight() {
        System.out.println(name + " fights fiercely.");
    }

    public void disobey() {
        System.out.println(name + " disobeys commands.");
    }
}
