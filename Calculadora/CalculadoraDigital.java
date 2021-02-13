import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.*;

public class CalculadoraDigital {
    private JFrame calculadora;
    private JPanel painelTexto;
    private JPanel painelBotoes;
    private JTextField lcd;
    private JButton botao0;
    private JButton botao1;
    private JButton botao2;
    private JButton botao3;
    private JButton botao4;
    private JButton botao5;
    private JButton botao6;
    private JButton botao7;
    private JButton botao8;
    private JButton botao9;
    private JButton bAdicao;
    private JButton bSubtracao;
    private JButton bMultiplicacao;
    private JButton bDivisao;
    private JButton bPonto;
    private JButton bResultado;
    private JButton bAC;

    public CalculadoraDigital() {
        lcd = new JTextField(20);
        Font font1 = new Font("SansSerif", Font.BOLD, 50);
        lcd.setFont(font1);
        lcd.setEditable(false);
        botao0 = new JButton("0");
        botao1 = new JButton("1");
        botao2 = new JButton("2");
        botao3 = new JButton("3");
        botao4 = new JButton("4");
        botao5 = new JButton("5");
        botao6 = new JButton("6");
        botao7 = new JButton("7");
        botao8 = new JButton("8");
        botao9 = new JButton("9");
        bAdicao = new JButton("+");
        bSubtracao = new JButton("-");
        bMultiplicacao = new JButton("*");
        bDivisao = new JButton("/");
        bPonto = new JButton(".");
        bResultado = new JButton("=");
        bAC = new JButton("AC");
        painelTexto = new JPanel();
        painelBotoes = new JPanel();
        calculadora = new JFrame();

        botao0.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    String comando = e.getActionCommand();
                    lcd.setText(lcd.getText() + comando);
                }
            }
        );

        botao1.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    String comando = e.getActionCommand();
                    lcd.setText(lcd.getText() + comando);
                }
            }
        );

        botao2.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    String comando = e.getActionCommand();
                    lcd.setText(lcd.getText() + comando);
                }
            }
        );

        botao3.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    String comando = e.getActionCommand();
                    lcd.setText(lcd.getText() + comando);
                }
            }
        );

        botao4.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    String comando = e.getActionCommand();
                    lcd.setText(lcd.getText() + comando);
                }
            }
        );

        botao5.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    String comando = e.getActionCommand();
                    lcd.setText(lcd.getText() + comando);
                }
            }
        );

        botao6.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    String comando = e.getActionCommand();
                    lcd.setText(lcd.getText() + comando);
                }
            }
        );

        botao7.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    String comando = e.getActionCommand();
                    lcd.setText(lcd.getText() + comando);
                }
            }
        );

        botao8.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    String comando = e.getActionCommand();
                    lcd.setText(lcd.getText() + comando);
                }
            }
        );

        botao9.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    String comando = e.getActionCommand();
                    lcd.setText(lcd.getText() + comando);
                }
            }
        );

        bAdicao.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    String comando = e.getActionCommand();
                    lcd.setText(lcd.getText() + comando);
                }
            }
        );

        bSubtracao.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    String comando = e.getActionCommand();
                    lcd.setText(lcd.getText() + comando);
                }
            }
        );

        bMultiplicacao.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    String comando = e.getActionCommand();
                    lcd.setText(lcd.getText() + comando);
                }
            }
        );

        bDivisao.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    String comando = e.getActionCommand();
                    lcd.setText(lcd.getText() + comando);
                }
            }
        );

        bPonto.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    String comando = e.getActionCommand();
                    lcd.setText(lcd.getText() + comando);
                }
            }
        );
        bAC.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    lcd.setText("");
                }
            }
        );

        bResultado.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    String operacao = lcd.getText();
                    Logica logica = new Logica();
                    lcd.setText(logica.resolveOperacao(operacao));
                }
            }
        );

       montarCalculadora();
    }

    public void montaLcd(){
        painelTexto.setLayout(new BoxLayout(painelTexto, BoxLayout.Y_AXIS));
        painelTexto.add(lcd);
    }

    public void montaBotoes(){
        painelBotoes.setLayout(new GridLayout(5, 5));
        painelBotoes.add(botao7);
        painelBotoes.add(botao8);
        painelBotoes.add(botao9);
        painelBotoes.add(bDivisao);
        painelBotoes.add(botao4);
        painelBotoes.add(botao5);
        painelBotoes.add(botao6);
        painelBotoes.add(bMultiplicacao);
        painelBotoes.add(botao1);
        painelBotoes.add(botao2);
        painelBotoes.add(botao3);
        painelBotoes.add(bSubtracao);
        painelBotoes.add(botao0);
        painelBotoes.add(bPonto);
        painelBotoes.add(bAdicao);
        painelBotoes.add(bResultado);
        painelBotoes.add(bAC);
    }

    public void montarCalculadora() {
        montaLcd();
        montaBotoes();
        calculadora.add(painelTexto, BorderLayout.PAGE_START);
        calculadora.add(painelBotoes, BorderLayout.CENTER);
        calculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculadora.setResizable(false);
        calculadora.pack();
        calculadora.setVisible(true);
    }
}