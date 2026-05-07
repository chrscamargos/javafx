import javax.swing.*;

void main() {

    // para fazer uma janela:
    JFrame janela = new JFrame("exemplo swing");
    janela.setSize(500, 500);
    janela.setLayout(null);

    // para fazer botão:
    JButton button = new JButton("Clique aqui");
    button.setBounds(20,20, 150, 40);
    janela.add(button); // para adionar na janela

    // para digitar algo:
    JTextField input = new JTextField();
    input.setBounds(20, 80, 150, 40);
    janela.add(input);

    // adicionar um evento ao input, pra guardar o que foi digitado:
    button.addActionListener(e -> {
        String texto = input.getText();
        JOptionPane.showMessageDialog(null, "Você digitou: " + texto);

    });

    janela.setVisible(true); // usado quando quer que o objeto apareça.
}
