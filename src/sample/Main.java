package sample;

import aa222zh_assign1.ferry.Bicycle;
import aa222zh_assign1.ferry.Bus;
import aa222zh_assign1.ferry.Car;
import aa222zh_assign1.ferry.Ferry;
import aa222zh_assign1.ferry.FerryImp;
import aa222zh_assign1.ferry.Lorry;
import aa222zh_assign1.ferry.Passenger;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class Main extends Application {
    Label space = new Label();
    Label pass = new Label();
    Label money = new Label();
    Label carSpace = new Label();
    Label passSpace = new Label();

    int m =0;
    final int MAX_NUMBER_OF_SPACE =40;

    FerryImp ferry = new FerryImp();

    @Override
    public void start(Stage primaryStage) {
        BorderPane border = new BorderPane();
        primaryStage.setTitle("Ferry System");

        HBox hbox = addHBox();
        border.setTop(hbox);
        VBox box = addVBox();
        border.setCenter(box);
        VBox box1 = addVBox1();
        border.setBottom(box1);

        // root.getChildren().add(tf);
        primaryStage.setScene(new Scene(border, 700, 500));
        primaryStage.show();
    }

    public HBox addHBox() {
        HBox hbox = new HBox();
        hbox.setPadding(new Insets(15, 12, 15, 12));
        hbox.setSpacing(20);
        hbox.setStyle("-fx-background-color: #8769;");

        Button btn = new Button();
        btn.setText("Add Passenger");
        btn.setPrefSize(100, 20);

        Button btn2 = new Button();
        btn2.setText("Emb Car");
        btn2.setPrefSize(100, 20);

        Button btn3 = new Button();
        btn3.setText("Emb Bus");
        btn3.setPrefSize(100, 20);

        Button btn4 = new Button();
        btn4.setText("Emb Lorry");
        btn4.setPrefSize(100, 20);

        Button btn5 = new Button();
        btn5.setText("Emb Bic");
        btn5.setPrefSize(100, 20);

        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                ferry.embark(new Passenger());
                int n = ferry.countPassengers();

                m = ferry.countMoney();
                int p = 200 - ferry.countPassengers();

                pass.setText("Number of Passengers: " + Integer.toString(n));
                money.setText("Total Money is: " + Integer.toString(m));
                passSpace.setText("Number of passengers left: "
                        + Integer.toString(p));

            }
        });

        btn2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {



                ferry.embark(new Car(2, "bc"));

                int n = ferry.countPassengers();
                m = ferry.countMoney();
                int o = ferry.countVehicleSpace();
                int p = 40 - ferry.countVehicleSpace();

                pass.setText("Number of Passengers: " + Integer.toString(n));
                money.setText("Total Money is: " + Integer.toString(m));
                carSpace.setText("Number Of car Space Left: "
                        + Integer.toString(p));
                passSpace.setText(("Number of passengers left: " + (200 - ferry.countPassengers())));


            }
        });
        btn3.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                ferry.embark(new Bus(10));

                int n = ferry.countPassengers();
                m = ferry.countMoney();
                int o = ferry.countVehicleSpace();
                int p = 40 - ferry.countVehicleSpace();

                pass.setText("Number of Passengers: " + Integer.toString(n));
                money.setText("Total Money is: " + Integer.toString(m));
                carSpace.setText("Number Of car Space Left: "
                        + Integer.toString(p));
                passSpace.setText(("Number of passengers left: " + (200 - ferry
                        .countPassengers())));

            }
        });
        btn4.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                ferry.embark(new Lorry(2));

                int n = ferry.countPassengers();
                m = ferry.countMoney();
                int o = ferry.countVehicleSpace();
                int p = 40 - ferry.countVehicleSpace();

                pass.setText("Number of Passengers: " + Integer.toString(n));
                money.setText("Total Money is: " + Integer.toString(m));
                carSpace.setText("Number Of car Space Left: "
                        + Integer.toString(p));
                passSpace.setText(("Number of passengers left: " + (200 - ferry
                        .countPassengers())));

            }
        });
        btn5.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                ferry.embark(new Bicycle(10));
                int n = ferry.countPassengers();
                m = ferry.countMoney();
                int o = ferry.countVehicleSpace();
                int p = 40 - ferry.countVehicleSpace();

                pass.setText("Number of Passengers: " + Integer.toString(n));
                money.setText("Total Money is: " + Integer.toString(m));
                carSpace.setText("Number Of car Space Left: "
                        + Integer.toString(p));
                passSpace.setText(("Number of passengers left: " + (200 - ferry
                        .countPassengers())));

            }
        });

        hbox.getChildren().addAll(btn, btn2, btn3, btn4, btn5);

        return hbox;
    }

    public VBox addVBox() {
        VBox box = new VBox();
        box.setPadding(new Insets(15, 12, 15, 12));
        box.setSpacing(10);
        box.setStyle("-fx-background-color: #1611;");

        box.getChildren().addAll(pass, money, carSpace, passSpace);
        return box;
    }

    public VBox addVBox1() {
        VBox box1 = new VBox();
        box1.setPadding(new Insets(15, 12, 15, 12));
        box1.setSpacing(10);
        box1.setStyle("-fx-background-color: #8769;");

        Button btn6 = new Button();
        btn6.setText("DisImbk");
        btn6.setPrefSize(100, 20);
        btn6.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                ferry.disembark();
                int n = ferry.countPassengers();
                m = ferry.countMoney();
                int o = ferry.countVehicleSpace();
                int p = 40 - ferry.countVehicleSpace();

                pass.setText("Number of Passengers: " + Integer.toString(n));

                carSpace.setText("Number Of car Space Left: "
                        + Integer.toString(p));
                passSpace.setText(("Number of passengers left: " + (200 - ferry
                        .countPassengers())));

            }
        });

        box1.getChildren().addAll(btn6);
        return box1;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
