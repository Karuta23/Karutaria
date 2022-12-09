package karutaria.gui;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class MainMenuWindow  extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        System.out.println("AAAAAAAA");
    }

    private static void setWindow(Stage stage) throws Exception {
        stage.setTitle("Karutoria");
        //stage.getIcons().add(new Image(MainMenuWindow.class.getResourceAsStream("/images/icon.png")));
        stage.setResizable(false);

        BorderPane windowContent = new BorderPane();

        HBox buttonBox = new HBox();

        playButton = new Button("Play");
        settingsButton = new Button("Settings");
        closeGameButton = new Button("Close game");
        aboutButton = new Button("About");

        buttonBox.getChildren().addAll(playButton, settingsButton, aboutButton, closeGameButton);
        buttonBox.setAlignment(Pos.CENTER);


        windowContent.setStyle("-fx-padding: 20px; fx-background-color: #AEA893");

        String buttonStyle = "-fx-background-color: #5C2603; -fx-border-color: #444444; -fx-border-radius: 8;" +
                "-fx-padding: 20px; -fx-border-insets: 15px; -fx-background-insets: 15px; -fx-font-size: 20px; -fx-text-fill: #ffffff";

        playButton.setStyle(buttonStyle);
        settingsButton.setStyle(buttonStyle);
        aboutButton.setStyle(buttonStyle);
        closeGameButton.setStyle(buttonStyle);

        playButton.setCursor(Cursor.HAND);
        settingsButton.setCursor(Cursor.HAND);
        aboutButton.setCursor(Cursor.HAND);
        closeGameButton.setCursor(Cursor.HAND);





        windowContent.setBottom(buttonBox);


        try {
            play();
        }
        catch (Exception e){
            System.out.println("test");
        }

        Scene menuScene = new Scene(windowContent, 600, 200);
        stage.setScene(menuScene);
        stage.show();

        windowContent.setTop(setLogoContainer());

        setEvents(stage);

    }


}
