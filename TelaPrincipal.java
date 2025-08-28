package jogo;

import javax.swing.*;

public class TelaPrincipal extends JFrame {
    
    private JButton btnPedra, btnPapel, btnTesoura;
    private JLabel lblUsuario, lblComputador, lblResultado;

    private Jokenpo jogo;

    public TelaPrincipal() {
        jogo = new Jokenpo();

        setTitle("Jokenpô - Pedra, Papel, Tesoura");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        // Botões
        btnPedra = new JButton("Pedra");
        btnPapel = new JButton("Papel");
        btnTesoura = new JButton("Tesoura");

        btnPedra.setBounds(30, 200, 100, 30);
        btnPapel.setBounds(150, 200, 100, 30);
        btnTesoura.setBounds(270, 200, 100, 30);

        add(btnPedra);
        add(btnPapel);
        add(btnTesoura);

        // Labels
        lblUsuario = new JLabel("Sua escolha: ");
        lblUsuario.setBounds(30, 30, 300, 30);
        add(lblUsuario);

        lblComputador = new JLabel("Computador: ");
        lblComputador.setBounds(30, 70, 300, 30);
        add(lblComputador);

        lblResultado = new JLabel("Resultado: ");
        lblResultado.setBounds(30, 120, 300, 30);
        add(lblResultado);

        // Eventos
        btnPedra.addActionListener(e -> jogar(0));
        btnPapel.addActionListener(e -> jogar(1));
        btnTesoura.addActionListener(e -> jogar(2));
    }

    private void jogar(int escolhaUsuario) {
        int escolhaComputador = Jokenpo.randInt(0, 2);

        String[] opcoes = {"Pedra", "Papel", "Tesoura"};

        lblUsuario.setText("Sua escolha: " + opcoes[escolhaUsuario]);
        lblComputador.setText("Computador: " + opcoes[escolhaComputador]);

        String resultado = jogo.determinarVencedor(escolhaUsuario, escolhaComputador);
        lblResultado.setText("Resultado: " + resultado);
    }

    // Ponto de entrada do programa
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TelaPrincipal tela = new TelaPrincipal();
            tela.setVisible(true);
        });
    }
}
