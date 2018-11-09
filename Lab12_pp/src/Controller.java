import java.util.StringTokenizer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Text;

public class Controller {
	private String operator = "";
	private double tempX = 0;
	private int x = 0;
	private int y = 0;
	private int isOperator = 0;
	private int isSignedOperator = 0;
	private int isZero = 0;
	private int isFirst = 1;
	private int count = 0;
	private String tempOperator = "";
	private String SignedOperator = "";
	@FXML
	private Text result;

	@FXML
	private void operand(ActionEvent e) {
		if (isZero == 0) {
			if (isSignedOperator == 1) {
				result.setText(result.getText() + ((Button) e.getSource()).getText() + ")");
				isSignedOperator = 0;
			} else {
				result.setText(result.getText() + ((Button) e.getSource()).getText());
			}
			isOperator = 0;
			isFirst = 0;
		}
	}

	@FXML
	private void operator(ActionEvent e) {
		if (isZero == 0) {
			if (((Button) e.getSource()).getText().equals("Enter")) {
				StringTokenizer token = new StringTokenizer(result.getText(), operator + "()");
				tempX = Double.parseDouble(token.nextToken());
				x = (int) tempX;
				y = Integer.parseInt(token.nextToken());
				if (operator.equals("гн")) {
					operator = "-";
				}

				if (operator.equals("/")) {
					if (y == 0) {
						isZero = 1;
						result.setText("Cannot divided by zero");
					} else {
						result.setText(this.calculate(operator, (double) x, (double) y) + "");
					}
				} else {
					result.setText(this.calculate(operator, (int) x, y) + "");
				}
				count = 0;
				SignedOperator = "";
			} else {
				tempOperator = ((Button) e.getSource()).getText();
				if (isOperator == 0) {
					if (count == 0 && isFirst == 0) {
						operator = tempOperator;
						isOperator = 1;
						if (operator.equals("-")) {
							operator = "гн";
							result.setText(result.getText() + "гн");
						} else
							result.setText(result.getText() + ((Button) e.getSource()).getText());

						count = 1;
					} else if (count == 0 && isFirst == 1) {
						if (tempOperator.equals("-") && isSignedOperator == 0) {
							SignedOperator = tempOperator;
							result.setText(result.getText() + "(" + SignedOperator);
							isSignedOperator = 1;
						}
					}
				} else {
					if (tempOperator.equals("-") && isSignedOperator == 0) {
						SignedOperator = tempOperator;
						result.setText(result.getText() + "(" + SignedOperator);
						isSignedOperator = 1;
					}
				}
			}
		}
	}

	@FXML
	void keyPressed(KeyEvent e) {
		if (e.getCode() == KeyCode.ENTER && isZero == 0) {
			StringTokenizer token = new StringTokenizer(result.getText(), operator + "()");
			tempX = Double.parseDouble(token.nextToken());
			x = (int) tempX;
			y = Integer.parseInt(token.nextToken());
			if (operator.equals("гн")) {
				operator = "-";
			}

			if (operator.equals("/")) {
				if (y == 0) {
					isZero = 1;
					result.setText("Cannot divided by zero");
				} else {
					result.setText(this.calculate(operator, (double) x, (double) y) + "");
				}
			} else {
				result.setText(this.calculate(operator, (int) x, y) + "");
			}
			count = 0;
			SignedOperator = "";
		}
	}

	@FXML
	private void clear(ActionEvent e) {
		operator = "";
		x = 0;
		y = 0;
		isOperator = 0;
		isSignedOperator = 0;
		isZero = 0;
		isFirst = 1;
		count = 0;
		tempOperator = "";
		SignedOperator = "";
		result.setText("");
	}

	private int calculate(String operator, int x, int y) {
		if (operator.equals("+")) {
			return x + y;
		} else if (operator.equals("-")) {
			return x - y;
		} else { // operator == "*"
			return x * y;
		}
	}

	private double calculate(String operator, double x, double y) {

		return x / y;
	}
}
