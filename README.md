# TP1

Le TP consistait à créer un formulaire client interactif en utilisant un objet de type fenêtre JFrame qui contient à son rôle un objet de type JPanel géré par un gestionnaire de contenu de type CardLayout pour afficher les objets du formulaire d'une façon périodique en appuyant sur les boutons « First, Previous, Next, et Last ». Le formulaire devait contenir les champs de texte pour le No client, nom de client, prénom de client et adresse de client, ainsi que les boutons pour naviguer entre les différents champs.

Le formulaire a été conçu en utilisant plusieurs éléments graphiques tels que JPanel, CardLayout, JButton, JTextField, JLabel, BorderLayout et MouseListener. La conception était basée sur un panneau principal (JPanel) qui utilise le CardLayout pour afficher différents panneaux qui contiennent les éléments du formulaire. Les boutons de navigation étaient placés dans une disposition BorderLayout et étaient attachés à des écouteurs d'événements qui permettent de changer le panneau courant pour afficher le panneau suivant ou précédent.

Un défi majeur dans la conception de ce formulaire était de garantir que toute valeur insérée dans les champs de texte resterait présente malgré l'utilisation des boutons de navigation. Pour relever ce défi, une solution a été proposée en stockant les valeurs courantes des champs de texte dans des variables avant de passer à la carte suivante et en restaurant ces valeurs lorsque le champ de texte correspondant est affiché à nouveau. Cette solution garantit que toute valeur insérée dans les champs de texte reste présente même si le champ de texte est temporairement caché car son rôle n'est pas encore arrivé.

En outre, pour améliorer l'expérience utilisateur, le formulaire a été conçu avec des éléments graphiques intuitifs et faciles à comprendre. Les étiquettes ont été utilisées pour indiquer clairement le but de chaque champ de texte, et les boutons de navigation ont été étiquetés avec des icônes et des textes pour indiquer clairement leur fonction.

Dans l'ensemble, le projet a été réalisé avec succès et a permis de créer un formulaire client interactif et facile à utiliser. Le code est bien structuré et facile à comprendre, ce qui permettrait une maintenance facile et une évolutivité à l'avenir. Le formulaire est un excellent exemple d'utilisation des éléments graphiques et des gestionnaires de disposition dans Java pour créer une interface utilisateur conviviale
