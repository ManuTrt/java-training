*CPUPipelineFacade* reprezinta o simulare a executiei unui procesor
simplificat cu 5 stagii de pipeline.

Am folosit design pattern-ul comportamental **Facade**, pentru a putea abstractiza
acele etape, astfel incat clientul sa nu fie nevoit sa stie metodele pe care
trebuie sa le apeleze si respectiv, ordinea de executie a acestora.