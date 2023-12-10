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
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler;
import javafx.scene.text.TextFlow;

public class ihm extends Application {
	
//
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Marché d'ici");

		BorderPane borderPane = new BorderPane();
		
		String path = "/Users/PC_DELL/logo.mp4";	    // le chemin vers la video du logo du marché 
		Media media = new Media (new File(path).toURI().toString());  
		MediaPlayer logo = new MediaPlayer(media);
		MediaView mediaView = new MediaView (logo);
		logo.setAutoPlay(true);
		logo.setCycleCount(MediaPlayer.INDEFINITE);
		mediaView.setFitWidth(60); 
		mediaView.setFitHeight(60);
		
		Text boldText = new Text("Bienvenue sur la site Marché d'ici!\n Marché d'ici, l'idée d'être humain\n");
		boldText.setFont(Font.font("Arial", 25));
		boldText.setStyle("-fx-font-weight: bold;");

		Text normalText = new Text(
				"\n Choissisez une des nos catégories pour commencer votre aventure avec les produits, aux fabrications et à l’artisanat français");
		normalText.setFont(Font.font("Arial", 15));

		TextFlow textFlow = new TextFlow(boldText, normalText);
		textFlow.setPrefWidth(300);
		textFlow.setTextAlignment(TextAlignment.CENTER);
		textFlow.setPadding(new Insets(20));
		borderPane.setCenter(textFlow);

		File file1 = new File("/Users/PC_DELL/eclipse-workspace/search.png");
		Image image1 = new Image(file1.toURI().toString());
		ImageView imageView1 = new ImageView(image1);
		imageView1.setFitWidth(20);
		imageView1.setFitHeight(20);

		File fileNous= new File("/Users/PC_DELL/eclipse-workspace/handShake.png");
		Image imageNous = new Image(fileNous.toURI().toString());
		ImageView imageViewN = new ImageView(imageNous);
		imageViewN.setFitWidth(20);
		imageViewN.setFitHeight(20);

		File fileU = new File("/Users/PC_DELL/eclipse-workspace/user.jpg");
		Image imageU = new Image(fileU.toURI().toString());
		ImageView imageViewU = new ImageView(imageU);
		imageViewU.setFitWidth(20);
		imageViewU.setFitHeight(20);

		File fileP = new File("/Users/PC_DELL/eclipse-workspace/panier.jpg");
		Image imageP = new Image(fileP.toURI().toString());
		ImageView imageViewP = new ImageView(imageP);
		imageViewP.setFitWidth(20);
		imageViewP.setFitHeight(20);


		EventHandler<MouseEvent> eventHandler9 = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				Text boldText = new Text("Bienvenue sur la site Marché d'ici!\n Marché d'ici, l'idée d'être humain\n");
				boldText.setFont(Font.font("Arial", 25));
				boldText.setStyle("-fx-font-weight: bold;");

				Text normalText = new Text(
						"\n Choissisez une des nos catégories pour commancer votre aventure avec les produits, aux fabrications et à l’artisanat français");
				normalText.setFont(Font.font("Arial", 15));

				TextFlow textFlow = new TextFlow(boldText, normalText);
				textFlow.setPrefWidth(300);
				textFlow.setTextAlignment(TextAlignment.CENTER);

				StackPane newContent = new StackPane(textFlow);

				newContent.setPadding(new Insets(20));
				

				Scene currentScene = primaryStage.getScene();

				BorderPane root = (BorderPane) currentScene.getRoot();
				root.setCenter(newContent);
			}
		};

		mediaView.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler9);

		TextField searchField = new TextField();
		searchField.setPromptText("Rechercher un produit ...");
		Button searchButton = new Button();
		searchButton.setGraphic(imageView1);
		Button nousButton = new Button("Qui sommes nous?");
		nousButton.setGraphic(imageViewN);

		EventHandler<MouseEvent> eventHandler3 = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				Text boldText = new Text("Marché d'ici, l'idée d'être humain\n");
				boldText.setFont(Font.font("Arial", 25));
				boldText.setStyle("-fx-font-weight: bold;");

				Text normalText = new Text(
						"\n Qualité, transparence et traçabilité des produits sont devenus aujourd’hui des maitres-mots dans notre société où nous sommes de plus en plus nombreux à nous interroger sur la provenance de ce que nous achetons, de ce que nous consommons.\n"
								+ "\n L’idée de mettre en relation producteurs et consommateurs n’est pas nouvelle mais nous avons choisi de la décliner autour d’un concept inédit, pensé pour vous : une plateforme internet réservée aux produits, aux fabrications et à l’artisanat français.");
				normalText.setFont(Font.font("Arial", 15));

				TextFlow textFlow = new TextFlow(boldText, normalText);
				textFlow.setPrefWidth(300);
				textFlow.setTextAlignment(TextAlignment.CENTER);

				StackPane newContent = new StackPane(textFlow);

				newContent.setPadding(new Insets(20));

				Scene currentScene = primaryStage.getScene();

				BorderPane root = (BorderPane) currentScene.getRoot();
				root.setCenter(newContent);
				ScrollPane scrollPane = new ScrollPane(newContent);
		        scrollPane.setFitToWidth(true);
		        scrollPane.setFitToHeight(true);
		        borderPane.setCenter(scrollPane);
			}
		};
///
		nousButton.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler3);

		Button compteButton = new Button("Compte");
		compteButton.setGraphic(imageViewU);

		EventHandler<MouseEvent> eventHandler2 = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				GridPane accountCreation = new GridPane();
				accountCreation.setPadding(new Insets(20));
				accountCreation.setHgap(10);
				accountCreation.setVgap(10);

				Label title = new Label("Créer mon compte");
				title.setFont(Font.font("Arial", FontWeight.BOLD, 25));

				Label nameLabel = new Label("Nom:");
				TextField nameField = new TextField();

				Label emailLabel = new Label("Prénom:");
				TextField emailField = new TextField();

				Label passwordLabel = new Label("Mot de passe:");
				PasswordField passwordField = new PasswordField();

				Label confirmPasswordLabel = new Label("Confirmation du mot de passe:");
				PasswordField confirmPasswordField = new PasswordField();

				Button createAccountButton = new Button("Créer le compte");

				EventHandler<MouseEvent> eventHandler5 = new EventHandler<MouseEvent>() {
					@Override
					public void handle(MouseEvent event) {
						Text normalText = new Text("Votre compte a été crée!");
						normalText.setFont(Font.font("Arial", FontWeight.BOLD, 20));

						TextFlow textFlow = new TextFlow(normalText);
						textFlow.setPrefWidth(300);
						textFlow.setTextAlignment(TextAlignment.CENTER);

						StackPane newContent = new StackPane(textFlow);

						newContent.setPadding(new Insets(100));

						Scene currentScene = primaryStage.getScene();

						BorderPane root = (BorderPane) currentScene.getRoot();
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
				accountCreation.add(confirmPasswordLabel, 0, 4);
				accountCreation.add(confirmPasswordField, 1, 4);
				accountCreation.add(createAccountButton, 0, 5, 2, 1);

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

				EventHandler<MouseEvent> eventHandler7 = new EventHandler<MouseEvent>() {
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

						BorderPane root = (BorderPane) currentScene.getRoot();
						root.setCenter(newContent);
					}
				};

				loginButton.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler7);

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
				fullContent.getChildren().addAll(accountCreation, separator, loginPane);
				fullContent.setSpacing(20);

				fullContent.setPadding(new Insets(20, 20, 20, 20));

				fullContent.setMaxWidth(Double.MAX_VALUE);
				fullContent.setMaxHeight(Double.MAX_VALUE);

				HBox.setHgrow(accountCreation, Priority.ALWAYS);
				HBox.setHgrow(loginPane, Priority.ALWAYS);

				Scene currentScene = primaryStage.getScene();

				BorderPane root = (BorderPane) currentScene.getRoot();
				root.setCenter(fullContent);
			}
		};

		compteButton.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler2);

		Button panierButton = new Button("Panier");
		panierButton.setGraphic(imageViewP);

		EventHandler<MouseEvent> eventHandler6 = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				VBox cartContent = new VBox();
				cartContent.setPadding(new Insets(20));
				cartContent.setSpacing(10);

				Label cartTitle = new Label("Votre Panier");
				cartTitle.setFont(Font.font("Arial", FontWeight.BOLD, 25));

				// Ajoutez ici le contenu de votre panier, tel que des articles, quantités,
				// prix, etc.
				//VBox achats = new VBox ();
				
				Button checkoutButton = new Button("Passer la commande");

				EventHandler<MouseEvent> eventHandler7 = new EventHandler<MouseEvent>() {
					@Override
					public void handle(MouseEvent event) {
						Text normalText = new Text("Votre commande a été passé!");
						normalText.setFont(Font.font("Arial", FontWeight.BOLD, 20));

						TextFlow textFlow = new TextFlow(normalText);
						textFlow.setPrefWidth(300);
						textFlow.setTextAlignment(TextAlignment.CENTER);

						StackPane newContent = new StackPane(textFlow);

						newContent.setPadding(new Insets(100));

						Scene currentScene = primaryStage.getScene();

						BorderPane root = (BorderPane) currentScene.getRoot();
						root.setCenter(newContent);
					}
				};

				checkoutButton.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler7);

				cartContent.getChildren().addAll(cartTitle, /* faut ajouter les produits, à modifier */ checkoutButton);

				cartContent.setAlignment(Pos.CENTER);

				Scene currentScene = primaryStage.getScene();

				BorderPane root = (BorderPane) currentScene.getRoot();
				root.setCenter(cartContent);
			}
		};

		panierButton.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler6);

		GridPane gridPane = new GridPane();

		gridPane.add(mediaView, 0, 1, 1, 1);
		gridPane.add(searchField, 1, 1, 1, 1);
		gridPane.add(searchButton, 2, 1, 1, 1);
		gridPane.add(nousButton, 3, 1, 1, 1);
		gridPane.add(compteButton, 4, 1, 1, 1);
		gridPane.add(panierButton, 5, 1, 1, 1);

		
		

		TextField[] textField = { searchField };
		for (TextField textfield : textField) {
			textfield.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
			GridPane.setHgrow(textfield, Priority.ALWAYS);
			GridPane.setVgrow(textfield, Priority.ALWAYS);
			GridPane.setMargin(textfield, new Insets(10));
		}

		Button[] buttons = { searchButton, nousButton, compteButton, panierButton };
		for (Button button : buttons) {
			button.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
			GridPane.setHgrow(button, Priority.ALWAYS);
			GridPane.setVgrow(button, Priority.ALWAYS);
			GridPane.setMargin(button, new Insets(10));
		}
		MenuBar leftBar = new MenuBar();
		
// _________________RAYON EPICERIIIIE ____________________________
		Label label = new Label("Épicerie");
		label.setOnMouseClicked(mouseEvent -> {
			VBox mainContainer = new VBox();
            mainContainer.setAlignment(Pos.TOP_CENTER);
            mainContainer.setSpacing(20);

            Label titleLabel = new Label("Épicerie");
            titleLabel.setStyle("-fx-font-weight: bold; -fx-font-size: 25;");

            Label descriptionLabel = new Label("Découvrez nos produits d'épicerie de qualité !");
            descriptionLabel.setWrapText(true);
            descriptionLabel.setMaxWidth(300);

            HBox descriptionContainer = new HBox(descriptionLabel);
            descriptionContainer.setAlignment(Pos.CENTER);
            
// la grille qui va porter toutes le svbox des produits dans le rayon epicerie, ____PRODUITS EPICERIE ____
            GridPane productsGrid = new GridPane();
            productsGrid.setHgap(20);
            productsGrid.setVgap(20);
            productsGrid.setAlignment(Pos.CENTER);

            VBox productBox1 = new VBox();
            productBox1.setAlignment(Pos.CENTER);
            productBox1.setSpacing(10);

            File file = new File("/Users/PC_DELL/eclipse-workspace/fraise.jpg");
			Image image = new Image(file.toURI().toString());
			ImageView imageView = new ImageView(image);
			imageView.setFitWidth(200);
			imageView.setFitHeight(200);

			Label productNameLabel1 = new Label("Barquette de Fraises");
			Label descriptionLabel1 = new Label("Fraises gariguette cuillies dans la saison, 250g");
			Label priceLabel1 = new Label("6.99€");

			Button addToCartButton1 = new Button("Ajouter au panier");

			productBox1.getChildren().addAll(imageView, productNameLabel1, descriptionLabel1, priceLabel1,
					addToCartButton1);
			productsGrid.add(productBox1, 0, 0);
// VBOX 2eme produit 
			VBox productBox2 = new VBox();
			productBox2.setAlignment(Pos.CENTER);
			productBox2.setSpacing(10);

			File file2 = new File("/Users/PC_DELL/eclipse-workspace/miel.jpg");
			Image image2 = new Image(file2.toURI().toString());
			ImageView imageView2 = new ImageView(image2);
			imageView2.setFitWidth(200);
			imageView2.setFitHeight(200);

			Label productNameLabel2 = new Label("Bocal de miel ");
			Label descriptionLabel2 = new Label("Miel d'abeilles artisanal, 150ml");
			Label priceLabel2 = new Label("19.99€");

			Button addToCartButton2 = new Button("Ajouter au panier");

			productBox2.getChildren().addAll(imageView2, productNameLabel2, descriptionLabel2, priceLabel2,
					addToCartButton2);
			productsGrid.add(productBox2, 1, 0);
//__ P3___
			VBox productBox3 = new VBox();
			productBox3.setAlignment(Pos.CENTER);
			productBox3.setSpacing(10);

			File file3= new File("/Users/PC_DELL/eclipse-workspace/peche.jpg");
			Image image3 = new Image(file3.toURI().toString());
			ImageView imageView3 = new ImageView(image3);
			imageView3.setFitWidth(200);
			imageView3.setFitHeight(200);

			Label productNameLabel3 = new Label("Peche");
			Label descriptionLabel3 = new Label("Peche venant d'espagne en vrac");
			Label priceLabel3 = new Label("5.99€/kg");
			
			Button addToCartButton3 = new Button("Ajouter au panier");

            productBox3.getChildren().addAll(imageView3, productNameLabel3, descriptionLabel3, priceLabel3, addToCartButton3);
            productsGrid.add(productBox3, 2, 0);
  //____ P4____
            VBox productBox4 = new VBox();
            productBox4.setAlignment(Pos.CENTER);
            productBox4.setSpacing(10);

            File file4 = new File("/Users/PC_DELL/eclipse-workspace/maquereau.jpg");
			Image image4= new Image(file4.toURI().toString());
			ImageView imageView4 = new ImageView(image4);
			imageView4.setFitWidth(200);
			imageView4.setFitHeight(200);

			Label productNameLabel4 = new Label("Filets de maquereau");
			Label descriptionLabel4 = new Label("Filets de maquereau fumés , 200g");
			Label priceLabel4 = new Label("7.90€");

			Button addToCartButton4 = new Button("Ajouter au panier");

			productBox4.getChildren().addAll(imageView4, productNameLabel4, descriptionLabel4, priceLabel4,
					addToCartButton4);
			productsGrid.add(productBox4, 3, 0);
//___P5____________
			   VBox productBox5 = new VBox();
	            productBox5.setAlignment(Pos.CENTER);
	            productBox5.setSpacing(10);

	            File file5 = new File("/Users/PC_DELL/eclipse-workspace/coca.jpg");
				Image image5 = new Image(file5.toURI().toString());
				ImageView imageView5 = new ImageView(image5);
				imageView5.setFitWidth(200);
				imageView5.setFitHeight(200);

				Label productNameLabel5 = new Label("Canette Coca-Cola");
				Label descriptionLabel5 = new Label("Canette de coca-cola, 33cl");
				Label priceLabel5 = new Label("2.95€");

				Button addToCartButton5 = new Button("Ajouter au panier");

				productBox5.getChildren().addAll(imageView5, productNameLabel5, descriptionLabel5, priceLabel5,
						addToCartButton5);
				productsGrid.add(productBox5, 4, 0);
//________P6_____
				 VBox productBox6 = new VBox();
		            productBox6.setAlignment(Pos.CENTER);
		            productBox6.setSpacing(10);

		            File file6 = new File("/Users/PC_DELL/eclipse-workspace/filet.jpg");
					Image image6 = new Image(file6.toURI().toString());
					ImageView imageView6 = new ImageView(image6);
					imageView6.setFitWidth(200);
					imageView6.setFitHeight(200);

					Label productNameLabel6 = new Label("Filet de Sandre");
					Label descriptionLabel6 = new Label("2 filets du Sandre surgelés, 200g");
					Label priceLabel6 = new Label("8.95€");

					Button addToCartButton6 = new Button("Ajouter au panier");

					productBox6.getChildren().addAll(imageView6, productNameLabel6, descriptionLabel6, priceLabel6,
							addToCartButton6);
					productsGrid.add(productBox6, 0, 1);
	//___P7_______
					 VBox productBox7 = new VBox();
			            productBox7.setAlignment(Pos.CENTER);
			            productBox7.setSpacing(10);

			            File file7 = new File("/Users/PC_DELL/eclipse-workspace/camembert.jpg");
						Image image7 = new Image(file7.toURI().toString());
						ImageView imageView7 = new ImageView(image7);
						imageView7.setFitWidth(200);
						imageView7.setFitHeight(200);

						Label productNameLabel7 = new Label("Camembert du Bocage");
						Label descriptionLabel7 = new Label("Camemebert du Bocage frais et fondant, 250g");
						Label priceLabel7 = new Label("4.95€");

						Button addToCartButton7 = new Button("Ajouter au panier");

						productBox7.getChildren().addAll(imageView7, productNameLabel7, descriptionLabel7, priceLabel7,
								addToCartButton7);
						productsGrid.add(productBox7, 1, 1);
            
					
//_______________________________P8________
							 VBox productBox8 = new VBox();
					            productBox8.setAlignment(Pos.CENTER);
					            productBox8.setSpacing(10);

					            File file8 = new File("/Users/PC_DELL/eclipse-workspace/beurre.jpg");
								Image image8 = new Image(file8.toURI().toString());
								ImageView imageView8 = new ImageView(image8);
								imageView8.setFitWidth(200);
								imageView8.setFitHeight(200);

								Label productNameLabel8 = new Label("Beurre");
								Label descriptionLabel8 = new Label("Beurre demi-sel , 500g");
								Label priceLabel8 = new Label("2.95€");

								Button addToCartButton8 = new Button("Ajouter au panier");

								productBox8.getChildren().addAll(imageView8, productNameLabel8, descriptionLabel8, priceLabel8,
										addToCartButton8);
								productsGrid.add(productBox8, 2, 1);
						
//__________P9__________
								 VBox productBox9 = new VBox();
						            productBox9.setAlignment(Pos.CENTER);
						            productBox9.setSpacing(10);

						            File file9 = new File("/Users/PC_DELL/eclipse-workspace/Pitaya.jpg");
									Image image9 = new Image(file9.toURI().toString());
									ImageView imageView9 = new ImageView(image9);
									imageView9.setFitWidth(200);
									imageView9.setFitHeight(200);

									Label productNameLabel9 = new Label("Pitaya");
									Label descriptionLabel9 = new Label("Pitaya dit fruit du dragon, par pièce");
									Label priceLabel9 = new Label("4.50€");

									Button addToCartButton9 = new Button("Ajouter au panier");

									productBox9.getChildren().addAll(imageView9, productNameLabel9, descriptionLabel9, priceLabel9,
											addToCartButton9);
									productsGrid.add(productBox9, 3, 1);
            
//__________ _______________________________________________________________
            StackPane newContent = new StackPane(mainContainer);
            newContent.setPadding(new Insets(20));

            Scene currentScene = primaryStage.getScene();
            BorderPane root = (BorderPane) currentScene.getRoot();
            mainContainer.getChildren().addAll(titleLabel, descriptionContainer, productsGrid);
            root.setCenter(newContent);
            ScrollPane scrollPane = new ScrollPane(mainContainer);
            scrollPane.setFitToWidth(true);
            scrollPane.setFitToHeight(true);
            borderPane.setCenter(scrollPane);
		});
    
///_____________________________HYGIENE / BEAUTE ___________________________________
		Label hygiene = new Label("Hygiène/Beauté");
		hygiene.setOnMouseClicked(mouseEvent -> {
			VBox mainContainer = new VBox();
            mainContainer.setAlignment(Pos.TOP_CENTER);
            mainContainer.setSpacing(20);

            Label titleLabel = new Label("Hygiène Beauté");
            titleLabel.setStyle("-fx-font-weight: bold; -fx-font-size: 25;");

            Label descriptionLabel = new Label(" Une hygiène assurée et une mise en beauté garantie !");
            descriptionLabel.setWrapText(true);
            descriptionLabel.setMaxWidth(300);

            HBox descriptionContainer = new HBox(descriptionLabel);
            descriptionContainer.setAlignment(Pos.CENTER);
            
// la grille qui va porter toutes le svbox des produits dans le rayon epicerie, ____PRODUITS Hygiene____
            GridPane productsGrid = new GridPane();
            productsGrid.setHgap(20);
            productsGrid.setVgap(20);
            productsGrid.setAlignment(Pos.CENTER);

            VBox productBox1 = new VBox();
            productBox1.setAlignment(Pos.CENTER);
            productBox1.setSpacing(10);

            File f = new File("/Users/PC_DELL/eclipse-workspace/couche.jpg");
			Image i = new Image(f.toURI().toString());
			ImageView imageView57 = new ImageView(i);
			imageView57.setFitWidth(200);
			imageView57.setFitHeight(200);

			Label productNameLabel1 = new Label("Couches bébé");
			Label descriptionLabel1 = new Label("Couches bébé pour age 2ans, 24pce");
			Label priceLabel1 = new Label("12.99€");

			Button addToCartButton1 = new Button("Ajouter au panier");

			productBox1.getChildren().addAll(imageView57, productNameLabel1, descriptionLabel1, priceLabel1,
					addToCartButton1);
			productsGrid.add(productBox1, 0, 0);
// VBOX 2eme produit 
			VBox productBoxf= new VBox();
			productBoxf.setAlignment(Pos.CENTER);
			productBoxf.setSpacing(10);

			File fil = new File("/Users/PC_DELL/eclipse-workspace/brosse.jpg");
			Image imagef = new Image(fil.toURI().toString());
			ImageView imageViewf = new ImageView(imagef);
			imageViewf.setFitWidth(200);
			imageViewf.setFitHeight(200);

			Label productNameLabelf = new Label("Brosse à cheveux ");
			Label descriptionLabelf = new Label("Brosse à cheveux idéale cheveux delicats");
			Label priceLabelf = new Label("13.90€");

			Button addToCartButtonf = new Button("Ajouter au panier");

			productBoxf.getChildren().addAll(imageViewf, productNameLabelf, descriptionLabelf, priceLabelf,
					addToCartButtonf);
			productsGrid.add(productBoxf, 1, 0);
//__ P3___
			VBox productBox3 = new VBox();
			productBox3.setAlignment(Pos.CENTER);
			productBox3.setSpacing(10);

			File file3= new File("/Users/PC_DELL/eclipse-workspace/peche.jpg");
			Image image3 = new Image(file3.toURI().toString());
			ImageView imageView3 = new ImageView(image3);
			imageView3.setFitWidth(200);
			imageView3.setFitHeight(200);

			Label productNameLabel3 = new Label("Peche");
			Label descriptionLabel3 = new Label("Peche venant d'espagne en vrac");
			Label priceLabel3 = new Label("5.99€/kg");
			
			Button addToCartButton3 = new Button("Ajouter au panier");

            productBox3.getChildren().addAll(imageView3, productNameLabel3, descriptionLabel3, priceLabel3, addToCartButton3);
            productsGrid.add(productBox3, 2, 0);
  //____ P4____
            VBox productBox4 = new VBox();
            productBox4.setAlignment(Pos.CENTER);
            productBox4.setSpacing(10);

            File file4 = new File("/Users/PC_DELL/eclipse-workspace/maquereau.jpg");
			Image image4= new Image(file4.toURI().toString());
			ImageView imageView4 = new ImageView(image4);
			imageView4.setFitWidth(200);
			imageView4.setFitHeight(200);

			Label productNameLabel4 = new Label("Filets de maquereau");
			Label descriptionLabel4 = new Label("Filets de maquereau fumés , 200g");
			Label priceLabel4 = new Label("7.90€");

			Button addToCartButton4 = new Button("Ajouter au panier");

			productBox4.getChildren().addAll(imageView4, productNameLabel4, descriptionLabel4, priceLabel4,
					addToCartButton4);
			productsGrid.add(productBox4, 4, 0);
//___P5____________
			   VBox productBox5 = new VBox();
	            productBox5.setAlignment(Pos.CENTER);
	            productBox5.setSpacing(10);

	            File file5 = new File("/Users/PC_DELL/eclipse-workspace/coca.jpg");
				Image image5 = new Image(file5.toURI().toString());
				ImageView imageView5 = new ImageView(image5);
				imageView5.setFitWidth(200);
				imageView5.setFitHeight(200);

				Label productNameLabel5 = new Label("Canette Coca-Cola");
				Label descriptionLabel5 = new Label("Canette de coca-cola, 33cl");
				Label priceLabel5 = new Label("2.95€");

				Button addToCartButton5 = new Button("Ajouter au panier");

				productBox5.getChildren().addAll(imageView5, productNameLabel5, descriptionLabel5, priceLabel5,
						addToCartButton5);
				productsGrid.add(productBox5, 5, 0);
//________P6_____
				 VBox productBox6 = new VBox();
		            productBox6.setAlignment(Pos.CENTER);
		            productBox6.setSpacing(10);

		            File file6 = new File("/Users/PC_DELL/eclipse-workspace/filet.jpg");
					Image image6 = new Image(file6.toURI().toString());
					ImageView imageView6 = new ImageView(image6);
					imageView6.setFitWidth(200);
					imageView6.setFitHeight(200);

					Label productNameLabel6 = new Label("Filet de Sandre");
					Label descriptionLabel6 = new Label("2 filets du Sandre surgelés, 200g");
					Label priceLabel6 = new Label("8.95€");

					Button addToCartButton6 = new Button("Ajouter au panier");

					productBox6.getChildren().addAll(imageView6, productNameLabel6, descriptionLabel6, priceLabel6,
							addToCartButton6);
					productsGrid.add(productBox6, 0, 1);
	//___P7_______
					 VBox productBox7 = new VBox();
			            productBox7.setAlignment(Pos.CENTER);
			            productBox7.setSpacing(10);

			            File file7 = new File("/Users/PC_DELL/eclipse-workspace/camembert.jpg");
						Image image7 = new Image(file7.toURI().toString());
						ImageView imageView7 = new ImageView(image7);
						imageView7.setFitWidth(200);
						imageView7.setFitHeight(200);

						Label productNameLabel7 = new Label("Camembert du Bocage");
						Label descriptionLabel7 = new Label("Camemebert du Bocage frais et fondant, 250g");
						Label priceLabel7 = new Label("4.95€");

						Button addToCartButton7 = new Button("Ajouter au panier");

						productBox7.getChildren().addAll(imageView7, productNameLabel7, descriptionLabel7, priceLabel7,
								addToCartButton7);
						productsGrid.add(productBox7, 1, 1);
            
					
//_______________________________P8________
							 VBox productBox8 = new VBox();
					            productBox8.setAlignment(Pos.CENTER);
					            productBox8.setSpacing(10);

					            File file8 = new File("/Users/PC_DELL/eclipse-workspace/beurre.jpg");
								Image image8 = new Image(file8.toURI().toString());
								ImageView imageView8 = new ImageView(image8);
								imageView8.setFitWidth(200);
								imageView8.setFitHeight(200);

								Label productNameLabel8 = new Label("Beurre");
								Label descriptionLabel8 = new Label("Beurre demi-sel , 500g");
								Label priceLabel8 = new Label("2.95€");

								Button addToCartButton8 = new Button("Ajouter au panier");

								productBox8.getChildren().addAll(imageView8, productNameLabel8, descriptionLabel8, priceLabel8,
										addToCartButton8);
								productsGrid.add(productBox8, 2, 1);
						

            
//__________QUE FAIT CA ???? _______________________________________________________________
            StackPane newContent = new StackPane(mainContainer);
            newContent.setPadding(new Insets(20));

            Scene currentScene = primaryStage.getScene();
            BorderPane root = (BorderPane) currentScene.getRoot();
            mainContainer.getChildren().addAll(titleLabel, descriptionContainer, productsGrid);
            root.setCenter(newContent);
            ScrollPane scrollPane = new ScrollPane(mainContainer);
            scrollPane.setFitToWidth(true);
            scrollPane.setFitToHeight(true);
            borderPane.setCenter(scrollPane);
		});
//__________________________
		Menu menu1 = new Menu("", label);     // epicerie casté en menu1 pour le add au leftBar 

		Menu menu2 = new Menu("",hygiene);              // a enlever avec vetements 
		Menu menu4 = new Menu("Maison");

		leftBar.getMenus().addAll(menu1, menu2, menu4);
		MenuBar rightBar = new MenuBar();

		Menu menu6 = new Menu("Nos producteurs");

		rightBar.getMenus().addAll(menu6);

		Region spacer = new Region();
		spacer.getStyleClass().add("menu-bar");
		HBox.setHgrow(spacer, Priority.SOMETIMES);
		HBox menubars = new HBox(leftBar, spacer, rightBar);

		VBox vBox = new VBox(gridPane, menubars);
		borderPane.setTop(vBox);
		
		borderPane.setPadding(new Insets(5));

		Scene scene = new Scene(borderPane, 900, 600);
		primaryStage.setScene(scene);
	    primaryStage.setResizable(true);
	    
	    
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}