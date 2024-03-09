import java.util.ArrayList;
import java.util.List;

public class NumberList {
    private List<Integer> numbers;

    public NumberList(){
        this.numbers = new ArrayList<>();
    }

    public void add(int num){
        this.numbers.add(num);
    }

    public void plusMinus(){
        int pos = 0;
        int neg = 0;
        int z = 0;
        for (int number: this.numbers){
            if (number > 0){
                pos += 1;
            }
            else if (number < 0){
                neg += 1;
            }
            else {
                z += 1;
            }
        }
        double posr = (double) pos / this.numbers.size();
        double negr = (double) neg / this.numbers.size();
        double zr = (double) z / this.numbers.size();

        System.out.printf("%.6f\n%.6f\n%.6f\n", posr, negr,zr);
    }
}
