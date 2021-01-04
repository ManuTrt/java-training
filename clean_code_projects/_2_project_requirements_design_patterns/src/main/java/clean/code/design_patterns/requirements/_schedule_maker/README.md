DaySchedule reprezinta o implementare simplista a unui organizator de 
timp bazat pe design pattern-ul creational, Builder Pattern.
Folosind acest design pattern s-au rezolvat urmatoarele probleme:
    - existenta builder-ului exclude necesitatea unui constructor parametrizat
pentru DaySchedule;
    - clientul are libertatea de a seta caracteristicile unui obiect DaySchedule
in orice ordine si oricand;
    - clientul nu mai este nevoit sa seteze toate atributle unui DaySchedule
nici sa retina o anumita ordine a initializarii acestora (ca in cazul unui
constructor);