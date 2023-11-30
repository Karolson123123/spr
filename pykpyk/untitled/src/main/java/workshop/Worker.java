package workshop;

public class Worker {
    public static void main(String[] args) {
        Tool[] tools = {
                new Tool("miarka"),
                new Tool("nozyk"),
                new Tool("mlotek"),
        };

        for (Tool tool : tools) {
            tool.useTool();
        }
    }
}