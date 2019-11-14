import java.awt.*;
import javax.swing.*;

public class TestFrameExpand{
    public static void main(String args[]){
        int height = 100;
        int width = 200;

        JFrame frame = new JFrame("Test Frame Extra");

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        for(int i = 0; i < 500; i++){
            frame.setSize(width+i, height+i);
        }
    }
}