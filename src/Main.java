import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size = 20,xpos = 200,ypos = 200;
        Scanner sc = new Scanner(System.in);
        if (args.length == 0){
            System.out.print("size ?");
            size = sc.nextInt();
            System.out.print("xpos ?");
            xpos = sc.nextInt();
            System.out.print("ypos ?");
            ypos = sc.nextInt();
        } else if(args.length == 1) {
            try {
                size = Integer.parseInt(args[0]);
            } catch (Exception e) {
                System.out.println("引数エラー");
                System.exit(721);
            }
        } else if(args.length == 3) {
            try {
                size = Integer.parseInt(args[0]);
                xpos = Integer.parseInt(args[1]);
                ypos = Integer.parseInt(args[2]);
            } catch (Exception e) {
                System.out.println("引数エラー");
                System.exit(4545);
            }
        } else {
            System.out.println("引数エラー");
            System.exit(8585);
        }

        Tama leftTama = new Tama(size,xpos,ypos,Tama.side.left);
        Sao sao = new Sao(size,xpos,ypos);
        Tama rightTama = new Tama(size,xpos,ypos,Tama.side.right);
        leftTama.render();
        sao.render();
        rightTama.render();
    }
}