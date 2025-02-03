public class Main {
    public static void main(String[] args) {
        Pandav arjun = new Pandav("Arjun", "High");
        Pandav bheem = new Pandav("Bheem", "Medium");
        Kaurav duryodhan = new Kaurav("Duryodhan");
        Vikarn vikarn = new Vikarn("Vikarn");

        arjun.fight();
        arjun.obey();
        arjun.kind();

        bheem.fight();
        bheem.obey();
        bheem.kind();

        duryodhan.fight();
        duryodhan.disobey();

        vikarn.fight();
        vikarn.obey();
        vikarn.kind();
    }
}
