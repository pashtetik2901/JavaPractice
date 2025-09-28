package practik_3;

public class Converter { //Сумма вводится в Рублях
    private double value;
    private double usd = 83.35;
    private double eur = 99.04;
    private double cny = 11.70;

    public Converter(double val){
        this.value = val;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double convert_to_USD(){
        return value / usd;
    }

    public double convert_to_EUR(){
        return value / eur;
    }

    public double convert_to_CNY(){
        return  value / cny;
    }

}
