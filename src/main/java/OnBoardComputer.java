public class OnBoardComputer implements BurnStream {

    @Override
    public int getNextBurn(DescentEvent status) {
        int burn = 0;

        if (status.Velocity >= 1 || status.Altitude <= 1000 ) {
            burn = 200;
            }
        System.out.println(burn); /*hack!*/
        return burn;
    }

}

//    Maybe the way to do this is to descend from your initial altitude until you're at about
//        1000m and moving at 100m/s, then descend to 200m at 100 m/s, and then descend to 50m at 25m/s.
//        When at 50m, slow to 10m/s, then descend to 10m and slow to 2m/s.
//        Then maintain speed and descend until you land.



//Fuel
//Velocity
//Altitude
//Status
