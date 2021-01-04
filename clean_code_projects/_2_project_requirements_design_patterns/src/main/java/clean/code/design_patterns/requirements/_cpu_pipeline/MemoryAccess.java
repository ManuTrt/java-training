package clean.code.design_patterns.requirements._cpu_pipeline;

public class MemoryAccess extends Stage {
    public MemoryAccess(Stage nextStage) {
        super(nextStage);
    }

    public void readOrWriteMemory(){
        System.out.println("Memory access skipped");
        output = input.substring(0, 25);
    }
}
