package laboratory1;

public class Data {

    private double sum;
    private double maximum;
    private double count;

    public Data(){
        // sum = 0;
        // count = 0;
        maximum = -Double.MAX_VALUE;
    }

    public void add(double value){
        sum += value;
        if(count == 0 || value > maximum){
            maximum = value;    
        }
        count++;
    }

    public double getAvg(){
        if(count == 0) return 0;
        return sum / count;
    }

    public double getMax(){
        if(count == 0) return 0;
        return maximum;
    }

}
