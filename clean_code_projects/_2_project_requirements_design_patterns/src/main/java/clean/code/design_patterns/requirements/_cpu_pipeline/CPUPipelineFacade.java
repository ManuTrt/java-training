package clean.code.design_patterns.requirements._cpu_pipeline;

public class CPUPipelineFacade {
    InstructionFetch ifstage;
    InstructionDecode idstage;
    Execute exstage;
    MemoryAccess memstage;
    WriteBack wbstage;

    public CPUPipelineFacade() {
        wbstage = new WriteBack(null);
        memstage = new MemoryAccess(wbstage);
        exstage = new Execute(memstage);
        idstage = new InstructionDecode(exstage);
        ifstage = new InstructionFetch(idstage);
    }

    public void startCPU(){
        ifstage.incrementPC();
        ifstage.fetchInstructionFromMemory();
        ifstage.sendOutputNextStage();

        idstage.decodeInstruction();
        idstage.readRegisters();
        idstage.sendOutputNextStage();

        exstage.executeOperation();
        exstage.sendOutputNextStage();

        memstage.readOrWriteMemory();
        memstage.sendOutputNextStage();

        wbstage.writeToRegisterMem();
    }
}
