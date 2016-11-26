package Swing;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {


    public static void main(String[] args) {

        JFrame frame = new JFrame("Калькулятор"); //создаю окно
        frame.setSize(300, 310);  //размер окна
        frame.setResizable(true);   //изменение размера окна
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);   //завершение программы при закрытии окна

        JMenuBar menuBar = new JMenuBar(); //Создаю меню
        frame.setJMenuBar(menuBar);  //добавляю меню к фрейму

        JMenu menu = new JMenu("File");   //Создаю пункт меню файл
        menuBar.add(menu);  //добавляю пункт меню к меню

        JMenuItem menuItemNew = new JMenuItem("New");  //создаю вложенный элемент New для File
        menu.add(menuItemNew);  //добавляю элемент New в пункт меню File

        JMenuItem menuItemClose = new JMenuItem("Close"); //создаю вложенный элемент Close для File
        menu.add(menuItemClose); //добавляю элемент Close в пункт меню File

        menuItemClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });


        JMenu menu1 = new JMenu("About"); //создаю пункт меню About
        menuBar.add(menu1);   //добавлю пункт меню About

        JTextField textField = new JTextField(); //добавляю строку для ввода значений
        frame.add(textField, BorderLayout.NORTH);  //добавляю строку к фрейму, расположение вверху

        JPanel panel = new JPanel(new GridLayout(5,3));
        frame.add(panel);

//        for (int i = 0; i<=9; i++){
//            String key[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
//            JButton button = new JButton(key[i]);
//            panel.add(button);
//        }
//        Цикл добавления кнопок


        JButton button1 = new JButton("1");  //добавялю кнопку 1
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                textField.setText("1");
            }
        });
        panel.add(button1);  //добавляю кнопку к фрейму

        JButton button2 = new JButton("2");
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                textField.setText("2");
            }
        });
        panel.add(button2);

        JButton button3 = new JButton("3");
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                textField.setText("3");
            }
        });
        panel.add(button3);

        JButton button4 = new JButton("4");
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                textField.setText("4");
            }
        });
        panel.add(button4);

        JButton button5 = new JButton("5");
        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                textField.setText("5");
            }
        });
        panel.add(button5);

        JButton button6 = new JButton("6");
        button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                textField.setText("6");
            }
        });
        panel.add(button6);

        JButton button7 = new JButton("7");
        button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                textField.setText("7");
            }
        });
        panel.add(button7);

        JButton button8 = new JButton("8");
        button8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                textField.setText("8");
            }
        });
        panel.add(button8);

        JButton button9 = new JButton("9");
        button9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                textField.setText("9");
            }
        });
        panel.add(button9);

        JButton button0 = new JButton("0");
        button0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                textField.setText("0");
            }
        });
        panel.add(button0);

        JButton buttonPlus = new JButton("+");  //добавялю кнопку +
        buttonPlus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                textField.setText("+");
            }
        });
        panel.add(buttonPlus);  //добавляю кнопку к фрейму

        JButton buttonMinus = new JButton("-");
        buttonMinus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                textField.setText("-");
            }
        });
        panel.add(buttonMinus);

        JButton buttonDivide = new JButton("/");
        buttonDivide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                textField.setText("/");
            }
        });
        panel.add(buttonDivide);

        JButton buttonMultiply = new JButton("*");
        buttonMultiply.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                textField.setText("*");
            }
        });
        panel.add(buttonMultiply);

        JButton buttonEqually = new JButton("=");
        panel.add(buttonEqually);

        JButton buttonC = new JButton("C");
        buttonC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                textField.setText(null);
            }
        });
        JPanel panel2 = new JPanel();
        frame.add(panel2, BorderLayout.SOUTH);
        panel2.setLayout(new BorderLayout());
        panel2.add(buttonC);


        frame.setVisible(true);    //видимость окна

    }
}