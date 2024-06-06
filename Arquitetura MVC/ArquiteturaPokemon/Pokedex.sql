Create table pokemons (
    Id INT PRIMARY KEY AUTO_INCREMENT,
    Nome VARCHAR(20) NOT NULL,
    Tipo VARCHAR(30) NOT NULL,
    Cor VARCHAR(10),
    Habitat VARCHAR(30)
);

create database pokemons;
use pokemons;
select * from pokemons;