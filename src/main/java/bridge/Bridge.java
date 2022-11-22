package bridge;

import java.util.*;

public class Bridge {

    private final List<String> bridge = new ArrayList<>();

    public void matchBridge(List<String> input) {
        bridge.addAll(input);
    }

    public List<String> getBridge() {
        return bridge;
    }

    public int getBridgeSize() {
        return bridge.size();
    }
}
