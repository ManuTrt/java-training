package clean.code.design_patterns.requirements._cpu_pipeline;

public abstract class Stage {
    String input;
    String output;
    Stage nextStage;

    public Stage(Stage nextStage) {
        this.nextStage = nextStage;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public void sendOutputNextStage(){
        System.out.println("Sent output: [" + output + "] to the next stage");
        nextStage.setInput(output);
    }
}
