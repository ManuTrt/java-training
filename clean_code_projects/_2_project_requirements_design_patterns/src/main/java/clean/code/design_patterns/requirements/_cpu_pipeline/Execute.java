package clean.code.design_patterns.requirements._cpu_pipeline;

public class Execute extends Stage{
    public Execute(Stage nextStage) {
        super(nextStage);
    }

    public void executeOperation(){
        System.out.println("Operation executed");
        output = "location = r3, result = 6, skip memory access";
    }
}
