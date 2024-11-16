public class TimeCalc {
    public static void main(String[] args) {
        String time = args[0];
        int minutesToAdd = Integer.parseInt(args[1]);
        int timeHours = Integer.parseInt(time.substring(0, 2));
        int timeMinutes = Integer.parseInt(time.substring(3));
        int totalMinutes = (timeHours * 60) + timeMinutes + minutesToAdd;
        int totalHours = totalMinutes / 60;
        int newHours = totalHours % 24;
        int newMinutes = totalMinutes - (totalHours * 60);
        if (newHours < 10){
            System.out.print("0" + newHours + ":");
        }
        else{
            System.out.print(newHours + ":");
        }
        if (newHours < 10){
            System.out.println("0" + newMinutes);
        }
        else{
            System.out.println(newMinutes);
        }
        

    }
}
