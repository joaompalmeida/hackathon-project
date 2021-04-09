DELETE FROM trip;
INSERT INTO trip(LOCATION, ID, CREATIONTIME, UPDATETIME, VERSION, STARTDATE, ENDDATE, LOCATIONTYPE, LOCATIONGOAL, HOTEL, PRICE, TRAVELLERID) VALUES
    ('Aveiro', 1, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-10-10', DATE '2021-10-10', 'URBAN', 'CULTURE', 'You should have stayed...', '100',0),
    ('Braga', 2, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'URBAN', 'CULTURE', 'Great Hostel', '465',0),
    ('Lisboa', 3, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'URBAN', 'CULTURE', 'Ritz', '1500',0),
    ('Bragança', 4, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'URBAN', 'ACTION', 'You should have stayed...', '100',0),
    ('Vila Nova de Famalicão', 5, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'URBAN', 'ACTION', 'Great Hostel', '300',0),
    ('Vila do Conde', 6, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'URBAN', 'ACTION', 'Ritz', '1000',0),
    ('Guimarães', 7, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'URBAN', 'RELAXATION', 'You should have stayed...', '100',0),
    ('Évora', 8, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'URBAN', 'RELAXATION', 'Great Hostel', '300',0),
    ('Viseu', 9, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'URBAN', 'RELAXATION', 'Ritz', '1000',0),
    ('Parque Natural do Alvão', 10, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'COUNTRYSIDE', 'CULTURE', 'You should have stayed...', '100',0),
    ('Parque Natural do Tejo Internacional', 11, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'COUNTRYSIDE', 'CULTURE', 'Great Hostel', '300',0),
    ('Serra do Marão', 12, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'COUNTRYSIDE', 'CULTURE', 'Ritz', '1000',0),
    ('Parque Natural de Montesinho', 13, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'COUNTRYSIDE', 'ACTION', 'You should have stayed...', '100',0),
    ('Parque Natural do Douro Internacional', 14, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'COUNTRYSIDE', 'ACTION', 'Great Hostel', '300',0),
    ('Parque Natural de Sintra-Cascais', 15, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'COUNTRYSIDE', 'ACTION', 'Ritz', '1000',0),
    ('Parque Nacional da Peneda-Gerês', 16, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'COUNTRYSIDE', 'RELAXATION', 'You should have stayed...', '100',0),
    ('Serra da Estrela', 17, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'COUNTRYSIDE', 'RELAXATION', 'Great Hostel', '300',0),
    ('Parque Natural do Litoral Norte', 18, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'COUNTRYSIDE', 'RELAXATION', 'Ritz', '1000',0),
    ('Faro', 19, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'BEACH', 'CULTURE', 'You should have stayed...', '100',0),
    ('Tavira', 20, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'BEACH', 'CULTURE', 'Great Hostel', '300',0),
    ('Vila do Bispo', 21, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'BEACH', 'CULTURE', 'Ritz', '1000',0),
    ('Olhão', 22, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'BEACH', 'ACTION', 'You should have stayed...', '564',0),
    ('Faro', 23, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'BEACH', 'ACTION', 'Great Hostel', '300',0),
    ('Quarteira', 24, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'BEACH', 'ACTION', 'Ritz', '1000',0),
    ('Portimão', 25, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'BEACH', 'RELAXATION', 'You should have stayed...', '100',0),
    ('Lagos', 26, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'BEACH', 'RELAXATION', 'Great Hostel', '300',0),
    ('Sines', 27, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'BEACH', 'RELAXATION', 'Ritz', '1000',0),
    ('Beja', 28, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-10-10', DATE '2021-10-10', 'URBAN', 'CULTURE', 'You should have stayed...', '100',0),
    ('Coimbra', 29, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'URBAN', 'CULTURE', 'Great Hostel', '300',0),
    ('Setubal', 30, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'URBAN', 'CULTURE', 'Ritz', '1000',0),
    ('Vila Nova de Gaia', 31, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-10-10', DATE '2021-10-10', 'URBAN', 'CULTURE', 'You should have stayed...', '100',0),
    ('Sintra', 32, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'URBAN', 'CULTURE', 'Great Hostel', '300',0),
    ('Fátima', 33, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'URBAN', 'CULTURE', 'Ritz', '1000',0),
    ('Lisboa', 34, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'URBAN', 'ACTION', 'You should have stayed...', '100',0),
    ('Porto', 35, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'URBAN', 'ACTION', 'Great Hostel', '300',0),
    ('Braga', 36, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'URBAN', 'ACTION', 'Ritz', '1000',0),
    ('Elvas', 37, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'URBAN', 'RELAXATION', 'You should have stayed...', '100',0),
    ('Lourinhã', 38, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'URBAN', 'RELAXATION', 'Great Hostel', '300',0),
    ('Torres Vedras', 39, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'URBAN', 'RELAXATION', 'Ritz', '1000',0),
    ('Coruche', 40, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'COUNTRYSIDE', 'CULTURE', 'You should have stayed...', '100',0),
    ('Alenquer', 41, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'COUNTRYSIDE', 'CULTURE', 'Great Hostel', '300',0),
    ('Mafra', 42, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'COUNTRYSIDE', 'CULTURE', 'Ritz', '1000',0),
    ('Grândola', 43, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'COUNTRYSIDE', 'ACTION', 'You should have stayed...', '100',0),
    ('Almodôvar', 44, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'COUNTRYSIDE', 'ACTION', 'Great Hostel', '300',0),
    ('Montemor-o-Novo', 45, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'COUNTRYSIDE', 'ACTION', 'Ritz', '1000',0),
    ('Castro Verde', 46, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'COUNTRYSIDE', 'RELAXATION', 'You should have stayed...', '100',0),
    ('Alqueva', 47, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'COUNTRYSIDE', 'RELAXATION', 'Great Hostel', '300',0),
    ('Viana do Alentejo', 48, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'COUNTRYSIDE', 'RELAXATION', 'Ritz', '1000',0),
    ('Vila Nova de Mil Fontes', 49, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'BEACH', 'CULTURE', 'You should have stayed...', '100',0),
    ('Olhão', 50, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'BEACH', 'CULTURE', 'Great Hostel', '300',0),
    ('Sagres', 51, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'BEACH', 'CULTURE', 'Ritz', '1000',0),
    ('Portimão', 52, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'BEACH', 'ACTION', 'You should have stayed...', '100',0),
    ('Sines', 53, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'BEACH', 'ACTION', 'Great Hostel', '300',0),
    ('Melides', 54, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'BEACH', 'ACTION', 'Ritz', '1000',0),
    ('Monte Gordo', 55, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'BEACH', 'RELAXATION', 'You should have stayed...', '100',0),
    ('Loulé', 56, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'BEACH', 'RELAXATION', 'Great Hostel', '300',0),
    ('Lagos', 57, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'BEACH', 'RELAXATION', 'Ritz', '1000',0),
    ('Palmela', 58, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'URBAN', 'ACTION', 'You should have stayed...', '100',0),
    ('Caldas da Rainha', 59, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'URBAN', 'ACTION', 'Great Hostel', '300',0),
    ('Bombarral', 60, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'URBAN', 'ACTION', 'Ritz', '1000',0),
    ('Cartaxo', 61, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'URBAN', 'RELAXATION', 'You should have stayed...', '100',0),
    ('Fazendas de Almeirim', 62, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'URBAN', 'RELAXATION', 'Great Hostel', '300',0),
    ('Leiria', 63, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'URBAN', 'RELAXATION', 'Ritz', '1000',0),
    ('Alcanede', 64, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'COUNTRYSIDE', 'CULTURE', 'You should have stayed...', '100',0),
    ('Golegã', 65, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'COUNTRYSIDE', 'CULTURE', 'Great Hostel', '300',0),
    ('Almeirim', 66, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'COUNTRYSIDE', 'CULTURE', 'Ritz', '1000',0),
    ('Rio Maior', 67, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'COUNTRYSIDE', 'ACTION', 'You should have stayed...', '100',0),
    ('Montargil', 68, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'COUNTRYSIDE', 'ACTION', 'Great Hostel', '300',0),
    ('Benavente', 69, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'COUNTRYSIDE', 'ACTION', 'Ritz', '1000',0),
    ('Alcácer do Sal', 70, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'COUNTRYSIDE', 'RELAXATION', 'You should have stayed...', '100',0),
    ('São Mamede do Sádão', 71, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'COUNTRYSIDE', 'RELAXATION', 'Great Hostel', '300',0),
    ('Aljustrel', 72, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'COUNTRYSIDE', 'RELAXATION', 'Ritz', '1000',0),
    ('Comporta', 73, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'BEACH', 'CULTURE', 'You should have stayed...', '100',0),
    ('Setúbal', 74, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'BEACH', 'CULTURE', 'Great Hostel', '300',0),
    ('Cascais', 75, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'BEACH', 'CULTURE', 'Ritz', '1000',0),
    ('Armação de Pêra', 76, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'BEACH', 'ACTION', 'You should have stayed...', '100',0),
    ('Almancil', 77, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'BEACH', 'ACTION', 'Great Hostel', '300',0),
    ('Fuseta', 78, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'BEACH', 'ACTION', 'Ritz', '1000',0),
    ('Vila Nova de Cacela', 79, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'BEACH', 'RELAXATION', 'You should have stayed...', '100',0),
    ('Vila do Bispo', 80, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'BEACH', 'RELAXATION', 'Great Hostel', '300',0),
    ('Carvoeiro', 81, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 0, DATE '2021-04-05', DATE '2021-03-07', 'BEACH', 'RELAXATION', 'Ritz', '1000',0);
