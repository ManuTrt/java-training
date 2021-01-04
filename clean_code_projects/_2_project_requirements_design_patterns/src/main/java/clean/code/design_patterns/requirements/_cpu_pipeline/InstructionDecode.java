package clean.code.design_patterns.requirements._cpu_pipeline;

public class InstructionDecode extends Stage {
    public InstructionDecode(Stage nextStage) {
        super(nextStage);
    }

    public void decodeInstruction() {
        System.out.println("Instruction decoded");
    }

    public void readRegisters() {
        System.out.println("Registers read");
        output = "r3 = 2 + 4";
    }
}
