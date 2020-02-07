package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;



public class Main extends Application {

    private Line line;
    @Override
    public void start(Stage primaryStage) throws Exception{

        VBox root = new VBox();

        root.setPadding(new Insets(45,15,0,25));
        root.setSpacing(30);

        double x1 =45;
        double x2 =790;
        double y1 =25;

       for (int i =0; i < 22; i++){

            line = new Line();
           line.setStroke(Color.MEDIUMPURPLE);
           line.setStrokeWidth(2);

           line.setStartX( x1 );
           line.setStartY(y1 );
           line.setEndX(x2 );
           line.setEndY(y1 );

           root.getChildren().add(line);
       }

       BorderPane  borderPane = new BorderPane();
       borderPane.setLeft(root);
       borderPane.setId("mainpanel");

        Scene  scene = new Scene(borderPane,800,750);
        String css = this.getClass().getResource("/sample/css/style.css").toExternalForm();
        scene.setUserAgentStylesheet(css);

        primaryStage.setTitle("NACOSS NOTEBOOK");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
