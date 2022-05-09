package net.karmacoder.osc.model.command;


import java.util.HashMap;
import java.util.Map;

public class SetOptions extends Command {
  public SetOptions() {
    super("camera.setOptions");
  }

  public SetOptions setIso(int iso) {
    parameters.computeIfAbsent("options", k -> new HashMap<String, Object>());

    Map<String, Object> options = (Map<String, Object>) parameters.get("options");
    options.put("iso", iso);
    return this;
  }

  public SetOptions setExposureCompensation(int exposureCompensation) {
    parameters.computeIfAbsent("options", k -> new HashMap<String, Object>());

    Map<String, Object> options = (Map<String, Object>) parameters.get("options");
    if (options != null) {
      options.put("exposureCompensation", exposureCompensation);
    }
    return this;
  }
}
