ALTER TABLE EMPLOYE ADD constraint PK_EMPLOYE PRIMARY KEY (id_employe);
ALTER TABLE LIGUE ADD constraint PK_LIGUE PRIMARY KEY (id_ligue);
ALTER TABLE EMPLOYE ADD constraint FK_EMPLOYE1 FOREIGN KEY (id_ligue_emp) REFERENCES LIGUE(id_ligue);
ALTER TABLE EMPLOYE ADD constraint FK_EMPLOYE2 FOREIGN KEY (id_ligue_adm) REFERENCES LIGUE(id_ligue);