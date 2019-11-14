import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class SlideColorPanel extends JPanel{
    private JPanel controls, colorPanel;
    private JSlider rSlider, gSlider, bSlider;
    private JLabel rLabel, gLabel, bLabel;

    public SlideColorPanel(){
        rSlider = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
        rSlider.setMajorTickSpacing(50);
        rSlider.setMinorTickSpacing(10);
        rSlider.setPaintTicks(true);
        rSlider.setPaintLabels(true);
        rSlider.setAlignmentX(Component.LEFT_ALIGNMENT);

        gSlider = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
        gSlider.setMajorTickSpacing(50);
        gSlider.setMinorTickSpacing(10);
        gSlider.setPaintTicks(true);
        gSlider.setPaintLabels(true);
        gSlider.setAlignmentX(Component.LEFT_ALIGNMENT);

        bSlider = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
        bSlider.setMajorTickSpacing(50);
        bSlider.setMinorTickSpacing(10);
        bSlider.setPaintTicks(true);
        bSlider.setPaintLabels(true);
        bSlider.setAlignmentX(Component.LEFT_ALIGNMENT);

        SliderListener listener = new SliderListener();
        rSlider.addChangeListener(listener);
        gSlider.addChangeListener(listener);
        bSlider.addChangeListener(listener);

    }
}