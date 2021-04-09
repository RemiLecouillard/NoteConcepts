DROP TABLE IF EXISTS concept;

create table Concept (
    id int,
    name varchar(255),
    description varchar(255),
    PRIMARY KEY (id)
);

create table Note (
    id int,
    concept int,
    note int,
    PRIMARY KEY (id),
    FOREIGN KEY (concept) REFERENCES Concept(id)
);
