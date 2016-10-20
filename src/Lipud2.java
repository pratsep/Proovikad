import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
public class Lipud2 extends Application {
    Pane pane;
    Stage lava;
    @Override
    public void start(Stage primaryStage) throws Exception {
        Nupud();

    }
    //Pilt
    private void Nupud() {
        pane = new Pane();
        lava = new Stage();
        Scene stseen = new Scene(pane, 500, 700);
        lava.setX(500);
        lava.setY(100);
        lava.setScene(stseen);
        lava.show();
        lava.setTitle("Lipud ja muu joonistusvärk");
        Button eestiNupp = new Button("Eesti lipp");
        Button jaapaniNupp = new Button("Jaapani lipp");
        pane.getChildren().addAll(eestiNupp, jaapaniNupp);
        eestiNupp.setPrefWidth(150);
        eestiNupp.setLayoutX(150);
        eestiNupp.setLayoutY(150);
        eestiNupp.setOnAction(event -> {
            eesti();
        });
        jaapaniNupp.setPrefWidth(150);
        jaapaniNupp.setLayoutX(150);
        jaapaniNupp.setLayoutY(200);
        jaapaniNupp.setOnAction(event -> {
            jaapan();
        });
    }
    //Eesti
    private void eesti() {
        pane = new Pane();
        Scene stseen = new Scene(pane, 500, 700);
        lava.setScene(stseen);
        Rectangle ruut1 = new Rectangle(250, 50);
        Rectangle ruut2 = new Rectangle(250, 50);
        Rectangle ruut3 = new Rectangle(250, 150);
        pane.getChildren().addAll(ruut1, ruut2, ruut3);
        ruut1.setX(100);
        ruut1.setY(100);
        ruut1.setFill(Color.BLUE);
        ruut2.setX(100);
        ruut2.setY(150);
        ruut2.setFill(Color.BLACK);
        ruut3.setX(100);
        ruut3.setY(100);
        ruut3.setFill(Color.TRANSPARENT);
        ruut3.setStroke(Color.BLACK);
        algusesse();
    }
    //Jaapani lipp
    private void jaapan() {
        pane = new Pane();
        Scene stseen = new Scene(pane, 500, 700);
        lava.setScene(stseen);
        Rectangle ruut = new Rectangle(100, 100, 250, 150);
        ruut.setStroke(Color.BLACK);
        ruut.setFill(Color.TRANSPARENT);
        Circle ring1 = new Circle(225, 175, 50, Color.RED);
        pane.getChildren().addAll(ruut, ring1);
        algusesse();
    }
    private void algusesse() {
        Button algusesse = new Button("Tagasi");
        pane.getChildren().add(algusesse);
        algusesse.setLayoutX(150);
        algusesse.setLayoutY(450);
        algusesse.setPrefWidth(150);
        algusesse.setOnAction(event -> {
            lava.close();
            Nupud();
        });
    }
}
