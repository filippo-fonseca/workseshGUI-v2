import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private JButton startWorkSessionButton;
    private JLabel Countdown;
    private JPanel CountdownPanel;
    private int minutesUntilDone = 30;
    private Timer timer;

    public Main() {

        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (minutesUntilDone == 0) {
                    ((Timer) e.getSource()).stop();
                } else {
                    Countdown.setText(Integer.toString(minutesUntilDone));
                }

                minutesUntilDone = minutesUntilDone - 1;
            }
        });

        startWorkSessionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timer.start();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Main");
        frame.setContentPane(new Main().CountdownPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }




}
