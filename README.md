                                Task 1

    Your task is to create a programming system for a ferry. The ferry transports

    passengers and vehicles (cars, buses, lorries and bicycles). The ferry has

    space for 200 passengers and 40 cars. A lorry need as much space as two

    buses or 8 cars. A car need as much space as 5 bicycles. There are different

    fees for different vehicles and an extra fee might be added for passengers.


    Use the following fees:

        Passenger without vehicle, 20 kr.

        Bicycle 40 kr (passenger included).

        Car 100 kr + 15 kr/passenger. (maximum 4 passengers)

        Bus 200 kr + 10 kr/ passenger. (maximum 20 passengers)

        Lorry 300 kr + 15 kr/ passenger. (maximum 2 passengers)
        
        

    Every type of vehicle (car, bus, lorry, bicycle) will inherit from the class

    Vehicle. The functionality of the ferry is given by the interface Ferry :

   
    public interface Ferry {

    int countPassengers(); // Number of passengers on board

    int countVehicleSpace(); // Used vehicle space. One car is 1.

    int countMoney(); // Earned money

    Iterator iterator(); // Vehicle iterator

    void embark(Vehicle v); // Embark vehicle, warning if not enough space

    void embark(Passenger p); // Embark passenger, warning if not enough room

    void disembark(); // Clear (empty) ferry. The money earned remains, 
    // i.e., is not reset to zero

    boolean hasSpaceFor(Vehicle v); // true if we can embark vehicle v

    boolean hasRoomForPassenger(); // true if we can embark another passenger

    String toString(); // Nice looking ferry status print out

    }
    

    A vehicle can not leave the ferry until the ferry has been disembarked

    and the same vehicle can not embark twice. The ferry iterator should ite-
    rate over all vehicles embarked (not the passengers). Also write a test pro-
    gram FerryMain.java, embarking a number of vehicles and passengers,

    showing the functionality of the methods.


                                Task 2

    Reuse the classes from the previous task and create a GUI using JavaFX. The

    program should help in embarking by having buttons for all the different

    vehicles and passengers in the list. Also show somewhere (and somehow)

    how much of the ferry is occupied and the total sum of the income for

    the ferry. There should also be a button for embarking whereby the list is

    emptied and the clear the sum. As with the previous task, the same vehicle

    cannot embark twice.

