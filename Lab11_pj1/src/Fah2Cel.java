import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;

public class Fah2Cel extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage myStage) {
		myStage.setTitle("Fah to Cel");

		FlowPane rootNode = new FlowPane(10, 10);
		rootNode.setAlignment(Pos.CENTER);
		Scene myScene = new Scene(rootNode, 300, 250);
		myStage.setScene(myScene);

		Label response = new Label("Push a Button or Press Enter");

		TextField tf = new TextField();
		TextField tf2 = new TextField();
		tf.setPromptText("Fahrenheit");
		tf.setPrefColumnCount(15);
		tf2.setPromptText("Celcius");
		tf2.setPrefColumnCount(15);

		Button btn2Cel = new Button("Convert to Cel !");
		Button btn2Fah = new Button("Convert to Fah !");

		Separator sp1 = new Separator();
		sp1.setPrefWidth(250);
		Separator sp2 = new Separator();
		sp2.setPrefWidth(250);

		myStage.setScene(myScene);

		tf.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent ae) {
				try {
					float f = Float.valueOf(tf.getText());
					float convert = (float) ((5.0 / 9) * (f - 32));
					String str = String.format("%.1f", convert);
					response.setText("Pressed Enter :: " + str);
				} catch (NumberFormatException e) {
					response.setText("Enter the float typed number");
				}
			}
		});

		btn2Cel.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
				try {
					float f = Float.valueOf(tf.getText());
					float convert = (float) ((5.0 / 9) * (f - 32));
					String str = String.format("%.1f", convert);
					response.setText("Pressed Enter :: " + str);
				} catch (NumberFormatException e) {
					response.setText("Insert the float typed number");
				}
			}
		});

		tf2.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent ae) {
				try {
					float f = Float.valueOf(tf2.getText());
					float convert = (float) (((9.0 / 5) * f) + 32);
					String str = String.format("%.1f", convert);
					response.setText("Pressed Enter :: " + str);
				} catch (NumberFormatException e) {
					response.setText("Enter the float typed number");
				}
			}
		});

		btn2Cel.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
				try {
					float f = Float.valueOf(tf2.getText());
					float convert = (float) (((9.0 / 5) * f) + 32);
					String str = String.format("%.1f", convert);
					response.setText("Pressed Enter :: " + str);
				} catch (NumberFormatException e) {
					response.setText("Insert the float typed number");
				}
			}
		});

		rootNode.getChildren().addAll(tf, btn2Cel, sp1, tf2, btn2Fah, sp2,response);
		myStage.show();

	}

}