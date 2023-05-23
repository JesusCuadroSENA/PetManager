create database PetManager;
use PetManager;

create table TblPet(
	IDPet INT NOT NULL,
    CodePet INT NOT NULL,
    NamePet VARCHAR(30) NOT NULL,
    BornYearPet  INT NOT NULL,
    ColorPet VARCHAR(50) NOT NULL,
    HealthStatusPet VARCHAR(50) NOT NULL,
    PRIMARY KEY(IDPet)
);

create table TblDog(
	IDDog INT NOT NULL,
    BreedDog VARCHAR(50) NOT NULL,
    PedigreeDog BOOLEAN NOT NULL,
    PRIMARY KEY(IDDog)
);

create table TblCat(
	IDCat INT NOT NULL,
    BreedCat VARCHAR(50) NOT NULL,
    PRIMARY KEY(IDCat)
);

create table TblHospital(
	IDHospital INT NOT NULL,
    NameHospital VARCHAR(50) NOT NULL,
    PhoneHospital VARCHAR(100) NOT NULL,
    AddressHospital  VARCHAR(100) NOT NULL,
    PatientTypeHospital VARCHAR(100) NOT NULL,
    IDDoctor INT NOT NULL,
    PRIMARY KEY(IDHospital)
);

create table TblPet_Hospital(
	IDPet INT NOT NULL,
    IDHospital INT NOT NULL,
    DatePetHospital VARCHAR(100),
    PRIMARY KEY(IDPet, IDHospital)
);




