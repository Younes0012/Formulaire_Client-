import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FormulaireClient extends JFrame implements ActionListener {

    private JPanel cards;
    private CardLayout cardLayout;
    private JButton firstButton, previousButton, nextButton, lastButton;
    private JTextField idField, nameField, firstNameField, addressField;
    private JLabel idLabel, nameLabel, firstNameLabel, addressLabel;
    private String savedId, savedName, savedFirstName, savedAddress;

    public FormulaireClient() {
        // Initialise la fenêtre principale
        super("Formulaire Client");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initialise les boutons
        firstButton = new JButton("First");
        previousButton = new JButton("<-- Previous");
        nextButton = new JButton("Next -->");
        lastButton = new JButton("Last");
        firstButton.addActionListener(this);
        previousButton.addActionListener(this);
        nextButton.addActionListener(this);
        lastButton.addActionListener(this);

        // Initialise les champs de texte et les étiquettes
        idField = new JTextField(20);
        nameField = new JTextField(20);
        firstNameField = new JTextField(20);
        addressField = new JTextField(20);
        idLabel = new JLabel("No client:");
        nameLabel = new JLabel("Nom de client:");
        firstNameLabel = new JLabel("Prénom de client:");
        addressLabel = new JLabel("Adresse de client:");
        // Initialise le gestionnaire de contenu CardLayout et ajoute les cartes
        cardLayout = new CardLayout();
        cards = new JPanel(cardLayout);
        cards.add(createCardlabel("", idLabel), "--");
        cards.add(createCardtext("", idField), "-- ");
        cards.add(createCardlabel("", nameLabel), "--");
        cards.add(createCardtext("", nameField), "-- ");
        cards.add(createCardlabel("", firstNameLabel), " --");
        cards.add(createCardtext("", firstNameField), " --");
        cards.add(createCardlabel("", addressLabel), "--");
        cards.add(createCardtext("", addressField), " --");
        // Ajoute les composants à la fenêtre principale
        add(cards, BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(firstButton);
        buttonPanel.add(previousButton);
        buttonPanel.add(nextButton);
        buttonPanel.add(lastButton);
        add(buttonPanel, BorderLayout.NORTH);
        // Affiche la fenêtre principale
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    // Crée une carte avec une étiquette et un champ de texte
    private JPanel createCardlabel(String title, JLabel label) {
        JPanel card = new JPanel(new BorderLayout());
        card.add(label, BorderLayout.WEST);

        card.setBorder(BorderFactory.createTitledBorder(title));
        return card;
    }
    private JPanel createCardtext(String title, JTextField field) {
        JPanel card = new JPanel(new BorderLayout());

        card.add(field, BorderLayout.CENTER);
        card.setBorder(BorderFactory.createTitledBorder(title));
        return card;
    }
    // Gère les événements des boutons de navigation
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == firstButton) {
            cardLayout.first(cards);
        } else if (e.getSource() == previousButton) {
            cardLayout.previous(cards);
        } else if (e.getSource() == nextButton) {
            saveCurrentValues();
            cardLayout.next(cards);
            restoreSavedValues();
        } else if (e.getSource() == lastButton) {
            cardLayout.last(cards);
        }
    }
    // Enregistre la valeur courante des champs de texte
    private void saveCurrentValues() {
        if (cards.getComponent(0).isVisible()) {
            savedId = idField.getText();
        } else if (cards.getComponent(1).isVisible()) {
            savedName = nameField.getText();
        } else if (cards.getComponent(2).isVisible()) {
            savedFirstName = firstNameField.getText();
        } else if (cards.getComponent(3).isVisible()) {
            savedAddress = addressField.getText();
        }
    }
    //restaure la valeur sauvegardée des champs de texte
    private void restoreSavedValues() {
        if (cards.getComponent(0).isVisible()) {
            idField.setText(savedId);
        } else if (cards.getComponent(1).isVisible()) {
            nameField.setText(savedName);
        } else if (cards.getComponent(2).isVisible()) {
            firstNameField.setText(savedFirstName);
        } else if (cards.getComponent(3).isVisible()) {
            addressField.setText(savedAddress);
        }
    }

    public static void main(String[] args) {
        new FormulaireClient();
    }}