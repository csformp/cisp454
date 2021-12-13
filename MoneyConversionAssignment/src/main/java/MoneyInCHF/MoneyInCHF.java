package MoneyInCHF;
import ConverstionRateCHF.ConversionRateCHF;

public class MoneyInCHF {
    ConversionRateCHF convert;

    public MoneyInCHF(ConversionRateCHF convert) { this.convert = convert;}
   // public MoneyInCHF() {
   //     this.convert = new ConversionRateCHF();
   // }
    //MoneyUSDtoCHF() {
    // The converstaion rate changes every day
    // and required to dynamically get the current rate.
    //    this.rate = 0.921636;
    //}
    public double MoneyUSDtoCHF(double money) {
        //1 United States Dollar = 0.921636 Swiss Franc
        return (money * convert.get());
    }

}
