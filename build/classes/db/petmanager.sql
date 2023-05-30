create database PetManager;
use PetManager;

create table TblPet(
	IDPet INT NOT NULL auto_increment,
    CodePet VARCHAR(3) NOT NULL,
    NamePet VARCHAR(50) NOT NULL,
    BornYearPet INT NOT NULL,
    ColorPet VARCHAR(20) NOT NULL,
    HealthStatusPet VARCHAR(100) NOT NULL,
    PRIMARY KEY(IDPet)
);

INSERT INTO `tblpet`(`IDPet`, `CodePet`, `NamePet`, `BornYearPet`, `ColorPet`, `HealthStatusPet`) VALUES (1,'001','Tobi', 2020,'Amarillo','Sano');
INSERT INTO `tblpet`(`IDPet`, `CodePet`, `NamePet`, `BornYearPet`, `ColorPet`, `HealthStatusPet`) VALUES (2,'002','Manchas', 2018,'Blanco con Negro','Enfermo');
INSERT INTO `tblpet`(`IDPet`, `CodePet`, `NamePet`, `BornYearPet`, `ColorPet`, `HealthStatusPet`) VALUES (3,'003','Tobias', 2023,'Dorado','En Diagnostico');
INSERT INTO `tblpet`(`IDPet`, `CodePet`, `NamePet`, `BornYearPet`, `ColorPet`, `HealthStatusPet`) VALUES (4,'004','Michifu', 2016,'Rosa','Sano');
INSERT INTO `tblpet`(`IDPet`, `CodePet`, `NamePet`, `BornYearPet`, `ColorPet`, `HealthStatusPet`) VALUES (5,'005','Pelusa', 2012,'Gris','En Diagnostico');

create table TblDoctor(
	IDDoctor INT NOT NULL auto_increment,
    NameDoctor VARCHAR(150) NOT NULL,
    PhoneDoctor VARCHAR(20) NOT NULL,
    Address VARCHAR(100) NOT NULL,
    PRIMARY KEY (IDDoctor)
);

INSERT INTO `tbldoctor`(`IDDoctor`, `NameDoctor`, `PhoneDoctor`, `Address`) VALUES (1,'Alberto Fernandez','3148473262','Cra. 13 #40-24');
INSERT INTO `tbldoctor`(`IDDoctor`, `NameDoctor`, `PhoneDoctor`, `Address`) VALUES (2,'Sofia Cuesta','3207459324','Cll. 11 #09-76');

create table TblDog(
	IDDog INT NOT NULL auto_increment,
    BreedDog VARCHAR(50) NOT NULL,
    PedigreeDog tinyint(1) NOT NULL,
    IDPet INT NOT NULL,
    PRIMARY KEY(IDDog),
    FOREIGN KEY (IDPet) REFERENCES TblPet(IDPet)
);

INSERT INTO `tbldog`(`IDDog`, `BreedDog`, `PedigreeDog`, `IDPet`) VALUES (1,'Pastor Aleman', 0, 1);
INSERT INTO `tbldog`(`IDDog`, `BreedDog`, `PedigreeDog`, `IDPet`) VALUES (2,'Dalmata', 1, 2);

create table TblCat(
	IDCat INT NOT NULL auto_increment,
    BreedCat VARCHAR(50) NOT NULL,
    IDPet INT NOT NULL,
    PRIMARY KEY(IDCat),
    FOREIGN KEY (IDPet) REFERENCES TblPet(IDPet)
);

INSERT INTO `tblcat`(`IDCat`, `BreedCat`, `IDPet`) VALUES (1,'Persia', 4);
INSERT INTO `tblcat`(`IDCat`, `BreedCat`, `IDPet`) VALUES (2,'Siberiano', 5);

create table TblHospital(
	IDHospital INT NOT NULL auto_increment,
    NameHospital VARCHAR(50) NOT NULL,
    PhoneHospital VARCHAR(20) NOT NULL,
    AddressHospital  VARCHAR(50) NOT NULL,
    PatientTypeHospital INT NOT NULL,
    IDDoctor INT NOT NULL,
    PRIMARY KEY(IDHospital),
    FOREIGN KEY (IDDoctor) REFERENCES TblDoctor(IDDoctor)
);

INSERT INTO `tblhospital`(`IDHospital`, `NameHospital`, `PhoneHospital`, `AddressHospital`, `PatientTypeHospital`, `IDDoctor`) VALUES (1, 'Santa Matilde','3134690847','Cll. 5 #10-13',1,1);
INSERT INTO `tblhospital`(`IDHospital`, `NameHospital`, `PhoneHospital`, `AddressHospital`, `PatientTypeHospital`, `IDDoctor`) VALUES (2, 'San Rafael','3025467384','Cra. 23 #10-113 sur', 1, 2);

create table TblPet_Hospital(
	IDPetHospital INT NOT NULL auto_increment,
    IDPet INT NOT NULL,
    IDHospital INT NOT NULL,
    DatePetHospital VARCHAR(50),
    PRIMARY KEY(IDPetHospital),
    FOREIGN KEY (IDPet) REFERENCES TblPet(IDPet),
    FOREIGN KEY (IDHospital) REFERENCES TblHospital(IDHospital)
);

INSERT INTO `tblpet_hospital`(`IDPetHospital`, `IDPet`, `IDHospital`, `DatePetHospital`) VALUES (1,1,1,'26/05/2023');
INSERT INTO `tblpet_hospital`(`IDPetHospital`, `IDPet`, `IDHospital`, `DatePetHospital`) VALUES (2,2,2,'11/05/2023');








