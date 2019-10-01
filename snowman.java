import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import javafx.stage.Stage;

public class snowman extends Application {

  public void start(Stage stage){
    Circle round1 = new Circle(250, 350, 75);
    round1.setStroke(Color.WHITE);
    round1.setFill(Color.WHITE);
    Rectangle background = new Rectangle(0,425,600,75);
    background.setStroke(Color.WHITE);
    background.setFill(Color.WHITE);
    Circle round2 = new Circle(250, 225, 50);
    round2.setStroke(Color.WHITE);
    round2.setFill(Color.WHITE);
    Circle round3 = new Circle(250, 150, 25);
    round3.setStroke(Color.WHITE);
    round3.setFill(Color.WHITE);
    Rectangle arm = new Rectangle(100,225, 100, 10);
    arm.setStroke(Color.BROWN);
    arm.setFill(Color.BROWN);
    Rectangle arm2 = new Rectangle(300,225, 100, 10);
    arm2.setStroke(Color.BROWN);
    arm2.setFill(Color.BROWN);
    Rectangle hat = new Rectangle(225, 75, 50, 50);
    Circle eye = new Circle(240,140, 5);
    Circle eye2 = new Circle(260,140, 5);
    Circle nose = new Circle(250,150, 3);







    Group root = new Group(round1, background, round2, round3, arm, arm2, hat, eye, eye2, nose);
    Scene scene = new Scene(root, 500, 500, Color.LIGHTBLUE);

    stage.setTitle("testfxpractice");
    stage.setScene(scene);
    stage.show();

}
    public static void main(String[] args){
      launch(args);
    }
  }
