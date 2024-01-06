package application;

import java.io.File;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.effect.BoxBlur;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class Selectproduct extends Application {

    @Override
    public void start(Stage primaryStage) {
        
        
        Label StockLab = new Label("StockLab");
        StockLab.getStyleClass().add("StockLab-style"); 
        
        Label Select = new Label("Select product");
        Select.getStyleClass().add("Select-style"); 
        Select.setStyle("-fx-font-size: 24px;");
        
        

        Label Gmailst = new Label("Stocklab.client@sttest.ma");
        Gmailst.getStyleClass().add("Gmailst-style"); 
        
        
        Label Phonest = new Label("0523548160");
        Phonest.getStyleClass().add("Phonest-style"); 
        
        TextField searchField = new TextField();
        searchField.setPromptText("Search");
        searchField.setMinWidth(250);
        searchField.setMaxWidth(250);
        searchField.setPrefWidth(250);
        searchField.setPrefHeight(25); // Hauteur de 40 pixels
        searchField.getStyleClass().add("search-field"); 
        
        
        Rectangle rectangle = new Rectangle(360, 50);
        rectangle.getStyleClass().add("rectangle-style");
        
        Rectangle rectanglesefli = new Rectangle(360,90);
        rectanglesefli.getStyleClass().add("rectanglesefli-style");
        rectanglesefli.setArcWidth(65); 
        rectanglesefli.setArcHeight(65); 
        
        Rectangle rectangleBlur = new Rectangle(100,15);
        rectangleBlur.getStyleClass().add("rectangleBlur-Style");
        rectangleBlur.setArcWidth(00); 
        rectangleBlur.setArcHeight(00); 
        
        
        Rectangle rectanglerose = new Rectangle(174, 174);
        rectanglerose.setFill(Color.valueOf("#FFA3A3"));
        BoxBlur blur = new BoxBlur(113,113,113); 
        rectanglerose.setEffect(blur);
        
        
        Rectangle rectanglezre9 = new Rectangle(174, 174);
        rectanglezre9.setFill(Color.valueOf("#A3FFE9"));
        rectanglezre9.setEffect(blur);
        
        Rectangle rectanglekhder = new Rectangle(174, 174);
        rectanglekhder.setFill(Color.valueOf("#A3FFA6"));
        rectanglekhder.setEffect(blur);
        
       


        
      
        
        Button BackButton = new Button("Back");
        BackButton.getStyleClass().add("Add_a_product-style");
        BackButton.setOnAction(e -> {
        	Choix Logout = new Choix();
            Stage stage = new Stage();
            Logout.start(stage);
            Stage currentStage = (Stage) BackButton.getScene().getWindow();
            currentStage.close();

        });
        
        BackButton.getStyleClass().add("ResetButton-style");
        
        
       
        
     
        
        
        
        Image image1 = new Image("file:C:\\Users\\PC\\OneDrive\\Bureau\\application\\logowhit.png");
        ImageView imageView1 = new ImageView(image1);

        Image image2 = new Image("file:C:\\Users\\PC\\OneDrive\\Bureau\\application\\logoblack.png");
        ImageView imageView2 = new ImageView(image2);
        
        Image image3 = new Image("file:C:\\Users\\PC\\OneDrive\\Bureau\\application\\Group 5.png");
        ImageView imageView3 = new ImageView(image3); 
        
        Image image4 = new Image("file:C:\\Users\\PC\\OneDrive\\Bureau\\application\\Group 18.png");
        ImageView imageView4 = new ImageView(image4);
        
        Image image5 = new Image("file:C:\\Users\\PC\\OneDrive\\Bureau\\application\\search.png");
        ImageView imageView5 = new ImageView(image5);
        
        StackPane root = new StackPane();
        
        
        // Add an event handler for the Enter key
        searchField.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ENTER) {
            	 Edit_product es = new Edit_product();
                 Stage stage = new Stage();
                 es.start(stage);
                 // If this method is called from the TextField, you need to find the current stage differently
                 Stage currentStage = (Stage) searchField.getScene().getWindow();
                 currentStage.close();
            }
        });
     
        
       
        
        
        root.getChildren().addAll(rectanglerose,
        		rectanglezre9,
        		rectanglekhder,
        		rectangle,
        		rectanglesefli,
        		rectangleBlur,
        		imageView1,
        		imageView2,
        		imageView3,
        		imageView4,
        		StockLab,
        		Gmailst,
        		Phonest,
        		Select,
        		BackButton,
        		searchField,
        		imageView5
        		);
    
        
     
        
        BoxBlur boxBlur = new BoxBlur();
        boxBlur.setWidth(160);  
        boxBlur.setHeight(160);
        rectangleBlur.setEffect(boxBlur);
        
        Gmailst.setTranslateY(273.5);
        
        Phonest.setTranslateY(285.5);
        
        rectanglesefli.setTranslateX(0); 
        rectanglesefli.setTranslateY(285); 
        
        rectangleBlur.setTranslateX(0); 
        rectangleBlur.setTranslateY(265); 
        
        rectanglerose.setTranslateX(-130); 
        rectanglerose.setTranslateY(-300); 
        rectanglezre9.setTranslateX(120); 
        rectanglezre9.setTranslateY(285); 
        rectanglekhder.setTranslateX(200); 
        rectanglekhder.setTranslateY(-270);
        
        rectangle.setTranslateX(0); 
        rectangle.setTranslateY(-280); 
        
      
        imageView1.setTranslateX(0); 
        imageView1.setTranslateY(-274); 
        
        imageView2.setTranslateX(-100.25); 
        imageView2.setTranslateY(-200.5); 
        
        imageView3.setTranslateX(0); 
        imageView3.setTranslateY(235); 
        
        imageView4.setTranslateX(80); 
        imageView4.setTranslateY(-145); 
        
        imageView5.setTranslateX(-100); 
        imageView5.setTranslateY(-80); 
        
        Select.setTranslateX(-15);
        Select.setTranslateY(-145);
    
       
        
        BackButton.setTranslateX(0);
        BackButton.setTranslateY(130);
        
        searchField.setTranslateX(0);
        searchField.setTranslateY(-80);
        
    
        
        Scene scene = new Scene(root, 360,600);
        scene.getStylesheets().add(getClass().getResource("Styles51.css").toExternalForm());
        Image applicationIcon = new Image("file:C:\\Users\\PC\\OneDrive\\Bureau\\application\\logoblack.png");
        primaryStage.getIcons().add(applicationIcon);
        primaryStage.setTitle("Select Product");
        primaryStage.setScene(scene);
        primaryStage.show();
        
       
        
        
    }

    public static void main(String[] args) {
        launch(args);
    }
}
