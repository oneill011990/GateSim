package de.germanspacebuild.gatesim.circuit;

/**
 * Created by Felix on 17.10.2016
 * for GateSim
 *
 * @author Felix
 */
public class GateSwitch implements ICircuitItem {

    private GateConnectionPoint output;

    public GateSwitch() {
        output = new GateConnectionPoint(false);
    }

    public GateSwitch(boolean value) {
        output = new GateConnectionPoint(value);
    }

    public void switchState() {
        output.write(!output.read());
    }

    public boolean getOutput() {
        return output.read();
    }

    public void setOutput(boolean output) {
        this.output.write(output);
    }

    @Override
    public String toString() {
        return "GateSwitch{" +
                "state=" + output +
                '}';
    }
}
