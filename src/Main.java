public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Tama leftTama = new Tama(Tama.side.left);
        Sao sao = new Sao();
        Tama rightTama = new Tama(Tama.side.right);
        leftTama.render();
        sao.render();
        rightTama.render();
    }
}