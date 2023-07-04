package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int dent = 0;
        for (int y = 1; y<= height;y++  ){
            for (int x = 1; x <= height; x++){
                if( y == 1 || y == height || (x > dent && x <= height - dent)){
                    System.out.print(8);
                }
                else System.out.print(" ");
            }
            System.out.println();
            if ((height % 2 == 0 && y < height/2) || (height%2 == 1 && y < (height / 2) +1))
                dent++;
            else if (height % 2 == 0 && y == height/2) continue;
            else dent--;
        }
        }
    }
