package lab1_1;

public class lab1_10 {
    public static class Weather{
        public double temperature;
        public double chanceOfRain;

        public boolean sunny;
        public boolean raining;
        public boolean cloud;

        public Weather(){
            temperature=0;
            chanceOfRain=0;
            sunny=false;
            raining=false;
            cloud=false;
        }
        public Weather(double temperature, double chanceOfRain, boolean sunny,boolean raining,boolean cloud){
            this.temperature = temperature;
            this.chanceOfRain=chanceOfRain;
            this.sunny=sunny;
            this.raining=raining;
            this.cloud=cloud;
        }
    }
    enum Days{ MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,SATURDAY, SUNDAY };

    public static class Day extends Weather{
        public Day(){
            super();
            day = null;
        }
        public Day(double temperature, double chanceOfRain, boolean sunny,boolean raining,boolean cloud, Days day){
            super(temperature, chanceOfRain,sunny,raining,cloud);
            this.day = day;
        }
        public Days day;

        @Override
        public String toString() {
            return ("Day: " + day + "\nTemperature: " + temperature + "\nChange Of Rain: " + chanceOfRain +
            "\nSunny: " + sunny +"\nRaining: " + raining +"\nCloud: "+cloud+"\n");
        }
    }
    public static void printForecast(final Day[] forecast){
        for (Day i : forecast){
            System.out.println(i.toString());
        }
    }

    public static void main(String[] args) {
        Day[] forecast = new Day[7];
        Day a0 = new Day(15,0,true,false,false,Days.MONDAY);
        forecast[0] = a0;
        Day a1 = new Day(17,15,false,false,true,Days.TUESDAY);
        forecast[1] = a1;
        Day a2 = new Day(20,0,true,false,false,Days.WEDNESDAY);
        forecast[2] = a2;
        Day a3 = new Day(10,80,false,true,true,Days.THURSDAY);
        forecast[3] = a3;
        Day a4 = new Day(11,30,true,true,true,Days.FRIDAY);
        forecast[4] = a4;
        Day a5 = new Day(9,0,false,false,true,Days.SATURDAY);
        forecast[5] = a5;
        Day a6 = new Day(13,8,true,false,false,Days.SUNDAY);
        forecast[6] = a6;

        printForecast(forecast);
    }
}
