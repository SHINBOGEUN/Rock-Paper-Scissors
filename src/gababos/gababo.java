package gababos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gababo extends JFrame implements ActionListener {
    ImageIcon[] gababo = {new ImageIcon("C:\\Users\\이명희\\IdeaProjects\\gababo\\src\\가바\\가위.png"), new ImageIcon("C:\\Users\\이명희\\IdeaProjects\\gababo\\src\\가바\\바위.jpg"), new ImageIcon("C:\\Users\\이명희\\IdeaProjects\\gababo\\src\\가바\\보.png")};
    JButton[] btn = new JButton[gababo.length];
    JLabel me = new JLabel("나의 선택");
    JLabel com = new JLabel("랜덤 선택");
    JLabel win = new JLabel("결과");



    public void Celect(Icon m, Icon c, String w){
        me.setIcon(m);
        com.setIcon(c);    // setIcon을 할때 글 왼쪽에 위치하게 하는 방법 ㅠㅠ
        win.setText(w);

    }


    public void actionPerformed(ActionEvent e) {
        String w;
        JButton b = (JButton) e.getSource();
        int n = (int)(Math.random() * 3);

        if (btn[0] == b) {
            if (n == 0) {
                w = "SAME";
                Celect(gababo[0],gababo[n],w);
            }
            else if (n == 1) {
                w = "COMPUTER WIN!!";
                Celect(gababo[0],gababo[n],w);
            }
            else if (n == 2) {
                w = "MY WIN";
                Celect(gababo[0],gababo[n],w);
            }
        }
        else if (btn[1] == b) {
            if (n == 0) {
                w = "MY WIN";
                Celect(gababo[1],gababo[n],w);
            }
            else if (n == 1) {
                w = "SAME";
                Celect(gababo[1],gababo[n],w);
            }
            else if (n == 2) {
                w = "COMPUTER WIN!!";
                Celect(gababo[1],gababo[n],w);
            }
        }
        else if (btn[2] == b) {
            if (n== 0) {
                w = "COMPUTER WIN!!";
                Celect(gababo[2],gababo[n],w);
            }
            else if (n == 1) {
                w = "MY WIN";
                Celect(gababo[2],gababo[n],w);
            }
            else if (n ==2) {
                w = "SAME";
                Celect(gababo[2],gababo[n],w);
            }
        }else {
            return;
        }

    }


    public gababo() {
        this.setTitle("가위 바위 보 게임");
        this.setSize(450, 300);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel start = new JLabel("**가위 바위 보 게임을 시작합니다**");
        start.setForeground(Color.red);
        JPanel spanel = new JPanel();

        JPanel northPanel = new JPanel();
        northPanel.setBackground(Color.BLACK);

        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(Color.GRAY);

        win.setForeground(Color.yellow);

        centerPanel.add(me);
        centerPanel.add(com);
        centerPanel.add(win);
        spanel.add(start);
        for (int i = 0; i < gababo.length; i++) {
            btn[i] = new JButton(gababo[i]);
            btn[i].addActionListener(this);
            northPanel.add(btn[i]);
        }

        add(spanel, BorderLayout.NORTH);
        add(northPanel, BorderLayout.CENTER);
        add(centerPanel, BorderLayout.SOUTH);

        setVisible(true);

    }

    public static void main(String[] args) {
        gababo ga = new gababo();
    }
}
