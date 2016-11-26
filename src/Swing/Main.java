package Swing;


import javax.swing.*;
import java.awt.*;


public class Main {


    public static void main(String[] args) {

        JFrame frame = new JFrame("Калькулятор"); //создаю окно
        frame.setSize(300, 310);  //размер окна
        frame.setResizable(false);   //изменение размера окна
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);   //завершение программы при закрытии окна

        JMenuBar menuBar = new JMenuBar(); //Создаю меню
        frame.setJMenuBar(menuBar);  //добавляю меню к фрейму

        JMenu menu = new JMenu("File");   //Создаю пункт меню файл
        menuBar.add(menu);  //добавляю пункт меню к меню

        JMenuItem menuItemNew = new JMenuItem("New");  //создаю вложенный элемент New для File
        menu.add(menuItemNew);  //добавляю элемент New в пункт меню File

        JMenuItem menuItemClose = new JMenuItem("Close"); //создаю вложенный элемент Close для File
        menu.add(menuItemClose); //добавляю элемент Close в пункт меню File

        menuItemClose.addActionListener(event -> System.exit(0));


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
        button1.addActionListener(event -> textField.setText(textField.getText()+"1"));
        panel.add(button1);  //добавляю кнопку к фрейму

        JButton button2 = new JButton("2");
        button2.addActionListener(event -> textField.setText(textField.getText()+"2"));
        panel.add(button2);

        JButton button3 = new JButton("3");
        button3.addActionListener(event -> textField.setText(textField.getText()+"3"));
        panel.add(button3);

        JButton button4 = new JButton("4");
        button4.addActionListener(event -> textField.setText(textField.getText()+"4"));
        panel.add(button4);

        JButton button5 = new JButton("5");
        button5.addActionListener(event -> textField.setText(textField.getText()+"5"));
        panel.add(button5);

        JButton button6 = new JButton("6");
        button6.addActionListener(event -> textField.setText(textField.getText()+"6"));
        panel.add(button6);

        JButton button7 = new JButton("7");
        button7.addActionListener(event -> textField.setText(textField.getText()+"7"));
        panel.add(button7);

        JButton button8 = new JButton("8");
        button8.addActionListener(event -> textField.setText(textField.getText()+"8"));
        panel.add(button8);

        JButton button9 = new JButton("9");
        button9.addActionListener(event -> textField.setText(textField.getText()+"9"));
        panel.add(button9);

        JButton button0 = new JButton("0");
        button0.addActionListener(event -> textField.setText(textField.getText()+"0"));
        panel.add(button0);

        JButton buttonPlus = new JButton("+");  //добавялю кнопку +
        buttonPlus.addActionListener(event -> textField.setText("+"));
        panel.add(buttonPlus);  //добавляю кнопку к фрейму

        JButton buttonMinus = new JButton("-");
        buttonMinus.addActionListener(event -> textField.setText("-"));
        panel.add(buttonMinus);

        JButton buttonDivide = new JButton("/");
        buttonDivide.addActionListener(event -> textField.setText("/"));
        panel.add(buttonDivide);

        JButton buttonMultiply = new JButton("*");
        buttonMultiply.addActionListener(event -> textField.setText("*"));
        panel.add(buttonMultiply);

        JButton buttonEqually = new JButton("=");
        panel.add(buttonEqually);

        JButton buttonC = new JButton("C");
        buttonC.addActionListener(event -> textField.setText(null));

        JPanel panel2 = new JPanel();
        frame.add(panel2, BorderLayout.SOUTH);
        panel2.setLayout(new BorderLayout());
        panel2.add(buttonC);


        frame.setVisible(true);    //видимость окна

    }
}