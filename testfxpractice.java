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

public class testfxpractice extends Application {

  public void start(Stage stage){

    Circle round = new Circle(200, 200, 150);
    round.setStroke(Color.PURPLE);
    round.setFill(Color.GREEN);
    Text text = new Text(50, 450, "Upsidedown Comic Sans");
    text.setRotate(180);
    text.setFont(Font.font("Comic Sans MS", 35));
    text.setStroke(Color.BLUE);
    Rectangle rectangle = new Rectangle(185, 50, 25, 300);
    rectangle.setStroke(Color.YELLOW);
    rectangle.setFill(Color.RED);
    Rectangle second = new Rectangle(187,50,25,300);
    second.setRotate(90);
    second.setStroke(Color.ORANGE);
    second.setFill(Color.HOTPINK);
    Text anotherText = new Text(150, 400, "Fancy");
    anotherText.setFont(Font.font("Times New Roman",FontPosture.ITALIC, 75));





    Group root = new Group(round, text, rectangle, second, anotherText);
    Scene scene = new Scene(root, 500, 500, Color.LIGHTBLUE);

    stage.setTitle("testfxpractice");
    stage.setScene(scene);
    stage.show();






}
  public static void main(String[]args){
    launch(args);
  }


}
