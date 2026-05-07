import javax.swing.*;

void main(){

    List<Pessoa> ListaForm = new ArrayList<>();

    JFrame form = new JFrame("Formulário");
    form.setSize(800, 500);
    form.setLayout(null);

    JLabel nomeLabel = new JLabel("Nome");
    nomeLabel.setBounds(375, 50, 150, 40);
    JTextField nomeInput = new JTextField("");
    nomeInput.setBounds(325, 80, 150, 40);

    JLabel emailLabel = new JLabel("Email");
    emailLabel.setBounds(376, 110, 150, 40);
    JTextField emailInput = new JTextField("");
    emailInput.setBounds(325, 140, 150, 40);

    JLabel telefoneLabel = new JLabel("Telefone");
    telefoneLabel.setBounds(365, 170, 150, 40);
    JTextField telefoneInput = new JTextField("");
    telefoneInput.setBounds(325, 200, 150, 40);

    JButton confirm = new JButton("confirme");
    confirm.setBounds(325,260, 150, 40 );
    confirm.addActionListener(e -> {

        JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!" + ListaForm);
    });

    JButton save = new JButton("Salvar");
    save.setBounds(325,300, 150, 40);
    save.addActionListener(e -> {
        Pessoa pessoa = new Pessoa(nomeInput.getText(), emailInput.getText(), telefoneInput.getText());
        ListaForm.add(pessoa);
        JOptionPane.showMessageDialog(null, "salvo com sucesso");
    });

    form.add(save);
    form.add(confirm);
    form.add(nomeInput);
    form.add(emailInput);
    form.add(telefoneInput);
    form.add(nomeLabel);
    form.add(emailLabel);
    form.add(telefoneLabel);
    form.setVisible(true);
}
