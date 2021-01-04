package clean.code.design_patterns.requirements._cpu_pipeline;

public class InstructionFetch extends Stage {
    public InstructionFetch(Stage nextStage) {
        super(nextStage);
    }

    public void incrementPC() {
        System.out.println("Program counter incremented");
    }

    public void fetchInstructionFromMemory(){
        System.out.println("Instruction fetched from memory");
        output = "add $r1, $r2, $r3";
    }
}
