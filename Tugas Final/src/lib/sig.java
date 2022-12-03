package lib;

import java.awt.Image;
import javax.swing.*;

public class sig {
    public ImageIcon Scale(JLabel labelPic,String Path){
        ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource(Path));
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(labelPic.getWidth(), labelPic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        return scaledIcon;
    }
    public ImageIcon Scale(JButton button,String Path){
        ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource(Path));
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(button.getWidth(), button.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        return scaledIcon;
    }
}
