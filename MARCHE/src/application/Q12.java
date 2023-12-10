
		package application;
		import java.io.File;
		import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
		import javafx.geometry.Insets;
		import javafx.geometry.Orientation;
		import javafx.geometry.Pos;
		import javafx.scene.Scene;
		import javafx.scene.control.*;
		import javafx.scene.image.Image;
		import javafx.scene.image.ImageView;
		import javafx.scene.layout.*;
		import javafx.scene.text.Font;
		import javafx.scene.text.FontWeight;
		import javafx.scene.text.Text;
		import javafx.scene.text.TextAlignment;
		import javafx.stage.Stage;
		import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.scene.input.MouseEvent;
		import javafx.event.EventHandler;
		import javafx.scene.text.TextFlow;
		public class Q12 extends Application {
		@Override
		public void start(Stage primaryStage) {
			
		primaryStage.setTitle("Marché d'ici");
		
		BorderPane borderPane = new BorderPane();
		
		Text boldText = new Text("Bienvenue sur la site Marché d'ici!\n Marché d'ici, l'idée d'être humain\n");
		boldText.setFont(Font.font("Arial", 25));
		boldText.setStyle("-fx-font-weight: bold;");
	
		Text normalText = new Text("\n Choissisez une des nos catégories pour commancer votre aventure avec les produits, aux fabricationset à l’artisanat français");
		normalText.setFont(Font.font("Arial", 15));
		
		TextFlow textFlow = new TextFlow(boldText,normalText);
		textFlow.setPrefWidth(300);
		textFlow.setTextAlignment(TextAlignment.CENTER);
		textFlow.setPadding(new Insets(20));
		
		borderPane.setCenter(textFlow);
		

// Label pour revenir à l'accueil du marché quand on clique dessus : Marché d'ici 
		Label accueil = new Label("Marché d'ici");
		accueil.setFont(Font.font("Dancing Script",FontWeight.EXTRA_BOLD, 30));
		
		ScrollBar vScrollBar = new ScrollBar();
		vScrollBar.setOrientation(Orientation.VERTICAL);
		borderPane.setRight(vScrollBar);
		File file1 = new File("/Users/PC_DELL/eclipse-workspace/search.png");

		Image image1 = new Image(file1.toURI().toString());
		ImageView imageView1 = new ImageView(image1);
		imageView1.setFitWidth(20);
		imageView1.setFitHeight(20);
		
		File file2 = new File("/Users/PC_DELL/eclipse-workspace/handShake.png");
		Image image2 = new Image(file2.toURI().toString());
		ImageView imageView2 = new ImageView(image2);
		imageView2.setFitWidth(20);
		imageView2.setFitHeight(20);
		TextField searchField = new TextField();
		Button searchButton = new Button();
		searchButton.setGraphic(imageView1);
		Button nousButton = new Button("Qui sommes nous?");
		nousButton.setGraphic(imageView2);
		
		File file3 = new File("/Users/PC_DELL/eclipse-workspace/user.png");

		Image image3 = new Image(file3.toURI().toString());
		ImageView imageView3 = new ImageView(image3);
		imageView3.setFitWidth(20);
		imageView3.setFitHeight(20);
		
		File file4 = new File("/Users/PC_DELL/eclipse-workspace/panier.jpg");
		Image image4 = new Image(file4.toURI().toString());
		ImageView imageView4 = new ImageView(image4);
		imageView4.setFitWidth(20);
		imageView4.setFitHeight(20);
		
		EventHandler<MouseEvent> eventHandler9 = new EventHandler<MouseEvent>() {
		@Override
		public void handle(MouseEvent event) {
		Text boldText = new Text("Bienvenue sur la site Marché d'ici!\n Marché d'ici, l'idée d'être humain\n");

		boldText.setFont(Font.font("Arial", 25));
		boldText.setStyle("-fx-font-weight:bold;");

		Text normalText = new Text("\n Choissisez une de nos catégories pour commencer votre aventure avec les produits,aux fabrications et à l’artisanat français");

		normalText.setFont(Font.font("Arial", 15));
		TextFlow textFlow = new TextFlow(boldText,normalText);

		textFlow.setPrefWidth(300);
		textFlow.setTextAlignment(TextAlignment.CENTER);

		StackPane newContent = new StackPane(textFlow);

		newContent.setPadding(new Insets(20));
		Scene currentScene = primaryStage.getScene();

		BorderPane root = (BorderPane)currentScene.getRoot();

		root.setCenter(newContent);
		}
		};

		accueil.addEventHandler(MouseEvent.MOUSE_CLICKED,eventHandler9);
		//________________ BOUTON Compte User et l'event qui fait qu'on affiche notre compte, s'inscrire __________________
				Button compteButton = new Button("Compte");
				compteButton.setGraphic(imageView3);
				EventHandler<MouseEvent> eventHandler2 = new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent event) {
				GridPane accountCreation = new GridPane();
				accountCreation.setPadding(new Insets(20));
				accountCreation.setHgap(10);
				accountCreation.setVgap(10);
				Label title = new Label("Créer mon compte");

				title.setFont(Font.font("Arial",FontWeight.BOLD, 25));

				Label nameLabel = new Label("Nom:");
				TextField nameField = new TextField();
				Label emailLabel = new Label("Prénom:");
				TextField emailField = new TextField();
				Label passwordLabel = new Label("Mot de passe:");

				PasswordField passwordField = new PasswordField();

				Label confirmPasswordLabel = new Label("Confirmation du mot de passe:");

				PasswordField confirmPasswordField = new PasswordField();

				Button createAccountButton = new Button("Créer le compte");

				EventHandler<MouseEvent> eventHandler5 =

				new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent event) {
				Text normalText = new Text("Votre compte a été crée!");
				normalText.setFont(Font.font("Arial", FontWeight.BOLD,20));

				TextFlow textFlow = new TextFlow(normalText);

				textFlow.setPrefWidth(300);
				textFlow.setTextAlignment(TextAlignment.CENTER);
				StackPane newContent = new StackPane(textFlow);

				newContent.setPadding(new Insets(100));

				Scene currentScene = primaryStage.getScene();

				BorderPane root = (BorderPane)

				currentScene.getRoot();

				root.setCenter(newContent);

				}
				};

				createAccountButton.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler5);

				accountCreation.add(title, 0, 0, 2, 1);
				accountCreation.add(nameLabel, 0, 1);
				accountCreation.add(nameField, 1, 1);
				accountCreation.add(emailLabel, 0, 2);
				accountCreation.add(emailField, 1, 2);
				accountCreation.add(passwordLabel, 0, 3);
				accountCreation.add(passwordField, 1, 3);
				accountCreation.add(confirmPasswordLabel,0, 4);
				accountCreation.add(confirmPasswordField,1, 4);

				accountCreation.add(createAccountButton, 0,5, 2, 1);

				accountCreation.setAlignment(Pos.TOP_CENTER);

				accountCreation.setPadding(new Insets(20));
				GridPane loginPane = new GridPane();
				loginPane.setPadding(new Insets(20));
				loginPane.setHgap(10);
				loginPane.setVgap(10);
				Label loginTitle = new Label("Se connecter");

				loginTitle.setFont(Font.font("Arial", FontWeight.BOLD, 25));

				Label emailLoginLabel = new Label("Username:");

				TextField emailLoginField = new TextField();

				Label passwordLoginLabel = new Label("Mot de passe:");

				PasswordField passwordLoginField = new PasswordField();

				Button loginButton = new Button("Se connecter");

				EventHandler<MouseEvent> eventHandler7 =

				new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent event) {
				String enteredText = emailLoginField.getText();
				compteButton.setText(enteredText);

				Text normalText = new Text("Bonjour " + enteredText + " !");
				normalText.setFont(Font.font("Arial", FontWeight.BOLD, 20));

				TextFlow textFlow = new TextFlow(normalText);

				textFlow.setPrefWidth(300);
				textFlow.setTextAlignment(TextAlignment.CENTER);
				StackPane newContent = new StackPane(textFlow);

				newContent.setPadding(new Insets(100));

				Scene currentScene = primaryStage.getScene();

				BorderPane root = (BorderPane)

				currentScene.getRoot();

				root.setCenter(newContent);
				}
				};

				loginButton.addEventHandler(MouseEvent.MOUSE_CLICKED,eventHandler7);

				loginPane.add(loginTitle, 0, 0, 2, 1);
				loginPane.add(emailLoginLabel, 0, 1);
				loginPane.add(emailLoginField, 1, 1);
				loginPane.add(passwordLoginLabel, 0, 2);
				loginPane.add(passwordLoginField, 1, 2);
				loginPane.add(loginButton, 0, 3, 2, 1);
				loginPane.setAlignment(Pos.TOP_CENTER);
				Separator separator = new Separator();

				separator.setOrientation(Orientation.VERTICAL);
				HBox fullContent = new HBox();
				fullContent.getChildren().addAll(accountCreation,
				separator, loginPane);

				fullContent.setSpacing(20);
				fullContent.setPadding(new Insets(20, 20,20, 20));

				fullContent.setMaxWidth(Double.MAX_VALUE);
				fullContent.setMaxHeight(Double.MAX_VALUE);
				HBox.setHgrow(accountCreation,Priority.ALWAYS);

				HBox.setHgrow(loginPane, Priority.ALWAYS);
				Scene currentScene = primaryStage.getScene();

				BorderPane root = (BorderPane) currentScene.getRoot();

				root.setCenter(fullContent);
				}
				};

				compteButton.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler2);
// ____________Création button Panier ____________________________________
				Button panierButton = new Button("Panier");
				panierButton.setGraphic(imageView4);
//_____________Affichage de la barre de recherche , qui sommes nous , le panier, barre de recherche________________________
				GridPane gridPane = new GridPane();
				gridPane.add(accueil, 0, 1, 1, 1);
				gridPane.add(searchField, 1, 1, 1, 1);
				gridPane.add(searchButton, 2, 1, 1, 1);
				gridPane.add(nousButton, 3, 1, 1, 1);
				gridPane.add(compteButton, 4, 1, 1, 1);
				gridPane.add(panierButton, 5, 1, 1, 1);
				vScrollBar.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);

				Label[] labels = { accueil };
				
				for (Label label : labels) {
				label.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
				GridPane.setHgrow(label, Priority.ALWAYS);
				GridPane.setVgrow(label, Priority.ALWAYS);
				GridPane.setMargin(label, new Insets(5));
				}
				TextField[] textField = { searchField };
				for (TextField textfield : textField) {
				textfield.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);

				GridPane.setHgrow(textfield, Priority.ALWAYS);
				GridPane.setVgrow(textfield, Priority.ALWAYS);
				GridPane.setMargin(textfield, new Insets(5));
				}
				Button[] buttons = { searchButton, nousButton,compteButton, panierButton };

				for (Button button : buttons) {
				button.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);

				GridPane.setHgrow(button, Priority.ALWAYS);
				GridPane.setVgrow(button, Priority.ALWAYS);
				GridPane.setMargin(button, new Insets(5));
				}
				MenuBar leftBar = new MenuBar();
//___________________EPICERIE _____________________________________________________________
				Label label = new Label("Épicerie");
				
				
				StackPane stackPane = new StackPane();
		        stackPane.setAlignment(Pos.TOP_CENTER);
		        stackPane.setPadding(new Insets(5));

		        // ...

		        label.setOnMouseClicked(mouseEvent -> {
		            // Créez une nouvelle vue pour la catégorie Épicerie
		            VBox epicerieView = new VBox();
		            epicerieView.setAlignment(Pos.TOP_CENTER);
		            epicerieView.setSpacing(20);

		            Label titleLabel = new Label("Épicerie");
		            titleLabel.setStyle("-fx-font-weight: bold; -fx-font-size: 25;");

		            Label descriptionLabel = new Label("Découvrez nos produits d'épicerie de qualité !");
		            descriptionLabel.setWrapText(true);
		            descriptionLabel.setMaxWidth(300);
		            HBox descriptionContainer = new HBox(descriptionLabel);
		            descriptionContainer.setAlignment(Pos.CENTER);

		            // Ajoutez des produits d'épicerie au FlowPane
		            FlowPane epicerieStock = new FlowPane();
		            epicerieStock.setHgap(15);
		            addProduit(epicerieStock, "/Users/PC_DELL/eclipse-workspace/fraise.jpg", "Barquette de Fraises", 5.99);
		            // Ajoutez d'autres produits...

		            // Ajoutez le titre, la description et le stock d'épicerie à la vue d'épicerie
		            epicerieView.getChildren().addAll(titleLabel, descriptionContainer, epicerieStock);

		            // Affichez la vue d'épicerie dans le StackPane
		            stackPane.getChildren().clear();
		            stackPane.getChildren().add(epicerieView);
		        });
				
				
//___________________le bouton qui sommes nous ? _______________________________________
		EventHandler<MouseEvent> eventHandler3 = new EventHandler<MouseEvent>() {
		@Override
		public void handle(MouseEvent event) {
		Text boldText = new Text("Marché d'ici,l'idée d'être humain\n");

		boldText.setFont(Font.font("Arial", 25));
		boldText.setStyle("-fx-font-weight:bold;");

		Text normalText = new Text("\n Qualité, transparence et	traçabilité des produits sont devenus aujourd’hui des maitres-	mots dans notre société où nous sommes de plus en plusnombreux à nous interroger sur la provenance de ce que nousachetons, de ce que nous consommons.\n"+ "\n L’idée de mettreen relation producteurs et consommateurs n’est pas nouvelle mais nous avons choisi de la décliner autour d’un concept inédit, pensé pour vous : une plateforme internet réservée aux produits, aux fabrications et à l’artisanat français.");
		normalText.setFont(Font.font("Arial", 15));
		TextFlow textFlow = new TextFlow(boldText,normalText);

		textFlow.setPrefWidth(300);
		textFlow.setTextAlignment(TextAlignment.CENTER);

		StackPane newContent = new StackPane(textFlow);

		newContent.setPadding(new Insets(20));
		Scene currentScene = primaryStage.getScene();

		BorderPane root = (BorderPane)currentScene.getRoot();

		root.setCenter(newContent);
		}
		};
		nousButton.addEventHandler(MouseEvent.MOUSE_CLICKED,eventHandler3);



//________________le event qui nous emmene au panier !!______________

		EventHandler<MouseEvent> eventHandler6 = new EventHandler<MouseEvent>() {
		@Override
		public void handle(MouseEvent event) {
		//on affiche tous articles de la "list" en les ajoutant un par un avec un for au vbox cartContent	
		VBox cartContent = new VBox();
		cartContent.setPadding(new Insets(20));
		cartContent.setSpacing(10);
		
		Label cartTitle = new Label("Votre Panier");
		cartTitle.setFont(Font.font("Spencil", 25));
		
		
//__________________________Bouton : valider la commande ____________
		Button checkoutButton = new Button("Passer la commande");

		EventHandler<MouseEvent> eventHandler7 = new EventHandler<MouseEvent>() {
		@Override
		public void handle(MouseEvent event) {
		Text normalText = new Text("Votre commande a été passé!");
		normalText.setFont(Font.font("Arial", FontWeight.BOLD,20));

		TextFlow textFlow = new TextFlow(normalText);

		textFlow.setPrefWidth(300);
		textFlow.setTextAlignment(TextAlignment.CENTER);
		StackPane newContent = new StackPane(textFlow);

		newContent.setPadding(new Insets(100));

		Scene currentScene = primaryStage.getScene();

		BorderPane root = (BorderPane)currentScene.getRoot();
		root.setCenter(newContent);
		}
		};

		checkoutButton.addEventHandler(MouseEvent.MOUSE_CLICKED,eventHandler7);
//__________________________Ajout des produits dns le panier et affichage du panier avec le bouton commander ..;( Scene du panier ) 
	
		cartContent.getChildren().addAll(cartTitle,
		/* faut ajouter les produits, à modifier */ checkoutButton);
		cartContent.setAlignment(Pos.CENTER);
		Scene currentScene = primaryStage.getScene();

		BorderPane root = (BorderPane)currentScene.getRoot();

		root.setCenter(cartContent);
		}
		};

		panierButton.addEventHandler(MouseEvent.MOUSE_CLICKED,eventHandler6);

		
//___________________ Add de tous les produits qu'on a dans le marché dans le flowpane qui revient à la ligne si y'a plus d place____________________________
		FlowPane epicerie = new FlowPane ();
		epicerie.setHgap(15);
		
		

				
		addProduit(epicerie,"/Users/PC_DELL/eclipse-workspace/fraise.jpg","Barquette de Fraises" , 5.99);
		

		
		Menu menu1 = new Menu("", label);
		Menu menu2 = new Menu("Boissons");
		Menu menu3 = new Menu("Hygiène/Beauté");
		Menu menu4 = new Menu("Maison");
		leftBar.getMenus().addAll(menu1, menu2, menu3,menu4);

		MenuBar rightBar = new MenuBar();
		Menu menu5 = new Menu("Nos producteurs");
		rightBar.getMenus().addAll(menu5);
		Region spacer = new Region();
		spacer.getStyleClass().add("menu-separator");
		HBox.setHgrow(spacer, Priority.SOMETIMES);
		HBox menubars = new HBox(leftBar, spacer, rightBar);
		VBox vBox = new VBox(gridPane, menubars);
		borderPane.setTop(vBox);
		borderPane.setPadding(new Insets(5));
		Scene scene = new Scene(borderPane, 900, 600);
		primaryStage.setScene(scene);
		primaryStage.show();
		}
		//______________Methode addProduit qui s'occupe d'ajouter le prod au Flowpane des produits dispos en prenant en paramètres les infos du produit	_____________________
				public static void addProduit (FlowPane stock,String imagePath, String nom, Double prix) {
					List <String> list = new ArrayList<>();

					Image image = null;
					try {
						image = new Image ( new FileInputStream (imagePath) );
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					ImageView imgP = new ImageView (image);
					
					Label nomP = new Label( nom );
					nomP.setFont(Font.font("Arial",FontWeight.EXTRA_BOLD, 30));
					Label prixP = new Label(prix.toString() + "€");			
					
					Button btn = new Button (" Ajouter au panier ");
					
					VBox boxProduit = new VBox();
					boxProduit.getChildren().addAll(imgP,nomP ,prixP,btn);
					stock.getChildren().add(boxProduit);
					
					EventHandler<MouseEvent> Ev_ajout = new EventHandler <MouseEvent>(){
						@Override 
						public void handle (MouseEvent e) {
							//areaText addOk = new AreaText(" Votre produit a bien été ajouté au panier ");
							//root.getChildren().add(addOk);
							System.out.println (nom + "a été ajouté au panier");
							list.add(nomP.toString());
							
						}} ;
					
					btn.addEventHandler(MouseEvent.MOUSE_CLICKED , Ev_ajout);
					
				}
		
		public static void main(String[] args) {
		launch(args);

		}
	
		}
