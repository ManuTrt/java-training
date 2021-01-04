package clean.code.design_patterns.requirements._cpu_pipeline;

public class WriteBack extends Stage{
    public WriteBack(Stage nextStage) {
        super(nextStage);
    }

    public void writeToRegisterMem(){
        System.out.println("Write result to r3 register");
    }
}
