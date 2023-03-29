DROP TABLE IF EXISTS EMPLOYE;
DROP TABLE IF EXISTS LIGUE;

CREATE TABLE EMPLOYE(
    id_employe int(4) not null,
    nom_employe varchar(50),
    prenom_employe varchar(50),
    password_employe varchar(50),
    email_employe varchar(50),
    statut_admin boolean,
    date_employe date,
    date_arrivee date,
    id_ligue_emp  int(4),
    id_ligue_adm  int(4)
);


CREATE TABLE LIGUE(
    id_ligue int(4) not null,
    nom_ligue varchar(50)
);