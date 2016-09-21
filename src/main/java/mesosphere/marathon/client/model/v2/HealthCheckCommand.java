package mesosphere.marathon.client.model.v2;

import mesosphere.marathon.client.utils.ModelUtils;

/**
 * Created by suman.bn on 21/09/16.
 */
public class HealthCheckCommand {

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return ModelUtils.toString(this);
    }
}
