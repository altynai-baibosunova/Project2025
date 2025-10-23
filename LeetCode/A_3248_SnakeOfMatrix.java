import java.util.List;

public class A_3248_SnakeOfMatrix {
    public static int finalPositionOfSnake(int n, List<String> commands) {
        int row=0;
        int col = 0;
        for(String command : commands){
            if(command.equals("RIGHT")){
                col++;
            }else if(command.equals("LEFT")){
                col--;
            }else if(command.equals("UP")){
            row--;
        } else if(command.equals("DOWN")){
            row++;
        }
        }
        return row*n+col;
    }

    public static void main(String[] args) {
        List<String> commands = List.of("RIGHT", "DOWN");

        System.out.println(finalPositionOfSnake(2,commands ));
    }
}
