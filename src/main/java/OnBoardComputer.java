public class OnBoardComputer implements BurnStream {

    @Override
    public int getNextBurn(DescentEvent status) {
        int burn = 0;
        if (status.Altitude >= 3000){
            burn = 200;

        }
        System.out.println(burn); /*hack!*/
        return burn;
    }

}

//Fuel
//Velocity
//Altitude
//Status
