package wcq.ramp.up.datainput;

import wcq.ramp.up.GCDEuclideanAlg;
import wcq.ramp.up.model.GCDModel;

import java.util.Arrays;

public class Data {
    public int[] getInputNums() {
        return inputNums;
    }

    public void setInputNums(int[] inputNums) {
        this.inputNums = inputNums;
    }

    public Data() {
    }

    /**
     * Array inputs
     * Empty Constructor
     * getter/setter for inputs
     */
    private int[] inputNums;

    public GCDModel convertToModel() {
        return new GCDModel(
                GCDEuclideanAlg.findGCD(this.inputNums)
        );
    }

    @Override
    public String toString() {
        return "Data{" +
                "inputNums=" + Arrays.toString(inputNums) +
                '}';
    }
}

