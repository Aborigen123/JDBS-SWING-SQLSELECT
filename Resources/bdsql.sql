
create database sklad
use sklad

drop database sklad;

create table zamdet
(id_z int  not null ,
nazvatovar varchar(60) not null,
kilkist int not null ,
price double not null,
chaszamovlenya date not null,
id_s int PRIMARY KEY );



create table EmployeeInfo
(id int AUTO_INCREMENT PRIMARY KEY,
username  int  not null,
passworld int  not null
 );

/*
ALTER TABLE postachalnikifirma ADD CONSTRAINT postachalnikifirma_fk1 FOREIGN KEY (id_s) REFERENCES Sklad(id_s);


ALTER TABLE zamdet ADD CONSTRAINT zamdet_fk1 FOREIGN KEY (id_s) REFERENCES Sklad(id_s);

ALTER TABLE brak ADD CONSTRAINT brak_fk1 FOREIGN KEY (id_s) REFERENCES Sklad(id_s);


ALTER TABLE staticticprodajiv ADD CONSTRAINT staticticprodajiv_fk1 FOREIGN KEY (id_s) REFERENCES Sklad(id_s);

ALTER TABLE postachalnikidileri ADD CONSTRAINT postachalnikidileri_fk1 FOREIGN KEY (id_s) REFERENCES Sklad(id_s);

ALTER TABLE postachalnikinevelikivirobnitstva ADD CONSTRAINT postachalnikinevelikivirobnitstva_fk1 FOREIGN KEY (id_s) REFERENCES Sklad(id_s);

ALTER TABLE postachalnikidribni ADD CONSTRAINT postachalnikidribni_fk1 FOREIGN KEY (id_s) REFERENCES Sklad(id_s);

ALTER TABLE postachalnikimagazini ADD CONSTRAINT postachalnikimagazini_fk1 FOREIGN KEY (id_s) REFERENCES Sklad(id_s);
*/





create table sklad
(id_s int  ,
nazvatovar varchar(60) not null ,
kilkist int not null ,
price double not null,
chasnaskladi date not null,
ukogokuplyali varchar(60) not null);




create table staticticprodajiv
(id_st int  not null ,
nazvatovar varchar(60) not null,
kilkistdet int not null ,
price double,
chaspokypki date not null,
ukogokuplyali varchar(60) not null,
id_s int  PRIMARY KEY);



create table brak
(id_b int not null ,
ystanova varchar (60) not null,
nazvabrakovahihdetalei varchar (60) not null,
kilkistbrakovahihdetalei int not null,
price double not null,
id_s int PRIMARY KEY);







create table postachalnikifirma
(id_f int not null  ,
firmanazva varchar(60) not null,
nazvatovar varchar(60) not null,
kilkistdet int not null ,
pokupkunasumu int not null,
chaspokypki date not null,
id_s int PRIMARY KEY);





create table postachalnikidileri
(id_d int  not null ,
dilerinazva varchar(60) not null,
nazvatovar varchar(60) not null,
kilkistdet int not null ,
pokupkunasumu int not null,
chaspokypki  date not null,
id_s int PRIMARY KEY);






create table postachalnikinevelikivirobnitstva
(id_n int not null  ,
nevelikivirobnitstvanazva varchar(60) not null,
nazvatovar varchar(60) not null,
kilkistdet int not null ,
pokupkunasumu int not null,
chaspokypki  date not null,
id_s int PRIMARY KEY);







create table postachalnikidribni
(id_d int not null ,
dribnipostachalnikinazva varchar(60) not null,
nazvatovar varchar(60) not null,
kilkistdet int not null ,
pokupkunasumu int not null,
chaspokypki  date not null,
id_s int PRIMARY KEY);







create table postachalnikimagazini
(id_m int not null  ,
magazininazva varchar(60) not null,
nazvatovar varchar(60) not null,
kilkistdet int not null ,
pokupkunasumu int not null,
chaspokypki  date not null,
id_s int PRIMARY KEY);


ALTER TABLE sklad ADD CONSTRAINT sklad_fk1 FOREIGN KEY (id_s) REFERENCES zamdet(id_s) ;


ALTER TABLE sklad ADD CONSTRAINT sklad_fk2 FOREIGN KEY (id_s) REFERENCES brak(id_s) ;

ALTER TABLE sklad ADD CONSTRAINT sklad_fk3 FOREIGN KEY (id_s) REFERENCES staticticprodajiv(id_s) ;


ALTER TABLE sklad ADD CONSTRAINT sklad_fk4 FOREIGN KEY (id_s) REFERENCES postachalnikifirma(id_s);

ALTER TABLE sklad ADD CONSTRAINT sklad_fk5 FOREIGN KEY (id_s) REFERENCES postachalnikidileri(id_s) ;

ALTER TABLE sklad ADD CONSTRAINT sklad_fk6 FOREIGN KEY (id_s) REFERENCES postachalnikinevelikivirobnitstva(id_s) ;

ALTER TABLE sklad ADD CONSTRAINT sklad_fk7 FOREIGN KEY (id_s) REFERENCES postachalnikidribni(id_s);

ALTER TABLE sklad ADD CONSTRAINT sklad_fk8 FOREIGN KEY (id_s) REFERENCES postachalnikimagazini(id_s) ;




insert into  sklad ( id_s, nazvatovar, kilkist, price, chasnaskladi, ukogokuplyali )
values (1,'Гальмівна система',5 , 120-43 , '2017-01-01', 'АС'),
(2,'Глушники',4 , 69 ,'2017-07-03', 'Авто-світ'),
(3,'Гофри',1 , 42 ,'2017-12-12', 'WC'),
(4,'Болт ричага Febest ',1 , 76.1, '2017-12-05','Toyota'),
(5,'Завіс VW 3С0831401D',1 , 4561 ,'2017-03-12', 'Ford'),
(6,'Кришка розширювального бачка Dello 013013040666A ',1 , 35.05 ,'2017-02-08', 'Opel'),
(7,'Мотор склоомивача JP 1198500400',2 , 101.9 ,'2017-11-03', 'Opel'),
(8,'Гофрии',1 , 42 ,'2017-12-12', 'Ford'),
(9,'Півкільце колінвала',1 , 311.85,'2017-11-11', 'Ford'),
(10,'Фільтр масла Febi',1 , 112.05 ,'2017-10-10', 'Febi'),
(11,'Тримач дверей A',1 , 200.59 ,'2017-09-09', 'Mercedes RH'),
(12,'Коректор фари GM ',1 , 42.82 ,'2017-08-08', 'Daewoo'),
(13,'Клапан електромагнітний',1 , 136.22 ,'2017-07-07', 'ISKRA'),
(14,'Свічка Bosch ',1 , 71.6 ,'2017-06-06', ' Bosch '),
(15,'Свічка NGK V-LINE NR 1',1 , 446.76,'2017-05-05', 'Audi'),
(16,'Фільтр повітряний Clean Filters MA363 ',1 , 97.7 ,'2017-04-04', 'Volvo'),
(17,'Шланг обратки дизель Febi 09487',1 , 32.52 ,'2017-03-03', 'Febi'),
(18,'Шланг обратки дизель',1 , 14.22 ,'2017-02-02', 'FGM'),
(19,'Помпа водяна Dolz T212 ',1 , 550 ,'2017-01-01', 'Toyota'),
(20,'Радіатор Inter Cars 945157 ',1 , 2066 ,'2017-02-07', 'Fiat'),
(21,'Термостат  3472, 87D',1 , 314.78 ,'2017-02-04', 'Vernet'),
(22,'Диск гальмiвний ABS 15981 ',1 , 375.78 ,'2017-02-12', 'Ford'),
(23,'Диск гальмiвний Bosch ',1 , 1278 ,'2017-12-03', 'Toyota');

insert into   brak (id_b, ystanova,nazvabrakovahihdetalei, kilkistbrakovahihdetalei, price, id_s )
values (1,'Fiat','Колодки гальмівні Bosch',1,530.88,20);


insert into  zamdet(id_z , nazvatovar, kilkist, price ,chaszamovlenya , id_s)
values (1,'Диск гальмiвний Bosch',1,1278,'2017-12-03',24),
(2,'Радіатор Inter Cars 945157',1,2066,'2017-02-07',25);



insert into  staticticprodajiv ( id_st, nazvatovar, kilkistdet, price, chaspokypki, ukogokuplyali, id_s)
values (1,'Фільтр масла Febi',1 , 112.05 ,'2017-10-10','Febi',10 ),
(2,'Коректор фари GM ',1 , 42.82 ,'2017-08-08','Daewoo',12);



insert into   postachalnikifirma ( id_f,firmanazva, nazvatovar, kilkistdet, pokupkunasumu, chaspokypki, id_s )
values 
(1,'Ford','Завіс VW 3С0831401D',1 , 4561 ,'2017-03-12',5),
(2,'Volvo','Фільтр повітряний Clean Filters MA363 ',1 , 97.7 ,'2017-04-04',16);


insert into  postachalnikinevelikivirobnitstva (id_n, nevelikivirobnitstvanazva, nazvatovar, kilkistdet, pokupkunasumu, chaspokypki, id_s  )
values (1,'Daewoo','Коректор фари GM ',1 , 42.82 ,'2017-08-08',12),
(2,'ISKRA','Клапан електромагнітний',1 , 136.22 ,'2017-07-07',13);


insert into  postachalnikidribni (id_d, dribnipostachalnikinazva, nazvatovar, kilkistdet, pokupkunasumu, chaspokypki, id_s )
values (1,'Vernet','Термостат  3472, 87D',1 , 314.78 ,'2017-02-04',21),
(2,'FGM','Шланг обратки дизель',1 , 14.22 ,'2017-02-02',18),
(3,'Febi','Шланг обратки дизель Febi 09487',1 , 32.52 ,'2017-03-03',17);


insert into  postachalnikimagazini ( id_m, magazininazva, nazvatovar, kilkistdet, pokupkunasumu, chaspokypki, id_s )
values (1,'АС','Гальмівна система',5 , 120-43 , '2017-01-01',1),
(2,'Авто-світ','Глушники',4 , 69 ,'2017-07-03',2),
(3,'WC','Гофри',1 , 42 ,'2017-12-12',3),
(4,'Болт ричага Febest','Toyota',1 , 76.1 ,'2017-12-05',4);

insert into  postachalnikidileri (id_d, dilerinazva, nazvatovar, kilkistdet, pokupkunasumu, chaspokypki, id_s )
values (1,'Bosch','Свічка Bosch ',1 , 71.6 ,'2017-06-06',14);


insert into  EmployeeInfo ( username, passworld )
values (1,1);


/*1*/

select id_m,magazininazva,nazvatovar,kilkistdet,chaspokypki,id_s
from postachalnikimagazini  
where chaspokypki > '09-09-2017';



select id_d, dribnipostachalnikinazva,nazvatovar,kilkistdet,chaspokypki,id_s
from postachalnikidribni; 

select id_n,nevelikivirobnitstvanazva, nazvatovar,kilkistdet,chaspokypki,id_s
from postachalnikinevelikivirobnitstva; 

select  id_d ,dilerinazva,nazvatovar,kilkistdet,chaspokypki,id_s
from postachalnikidileri; 

select  id_f,firmanazva, nazvatovar,kilkistdet,chaspokypki,id_s
from postachalnikifirma;



/*2*/
select nazvatovar, kilkist, price, chasnaskladi
from sklad 
where nazvatovar = 'Гальмівна система';

/*3*/
select *
from staticticprodajiv  
where chaspokypki > '2017-07-07' ;


select *
from staticticprodajiv  
where nazvatovar = 'Фільтр масла Febi' ;


/*4*/
select id_s, nazvatovar, kilkist
from sklad;


/*5*/
select id_st, nazvatovar, kilkistdet , price, ukogokuplyali, id_s
from staticticprodajiv
order by  kilkistdet;
/*where kilkistdet = max;

/*6*/
select id_m,magazininazva,nazvatovar,kilkistdet,chaspokypki,id_s
from postachalnikimagazini  
where chaspokypki > '2017-01-01' and chaspokypki < '2017-10-10' ;

/*10*/
select id_b,ystanova,nazvabrakovahihdetalei,kilkistbrakovahihdetalei,price,id_s
from brak  ;
/*where chaspokypki > '09-09-2017' and chaspokypki < '10-10-2017' ;*/


/*11*/
select *
from staticticprodajiv  
where chaspokypki > '2017-07-07' ;


/*16*/
select sum(price)
from zamdet  ;

select count(*)
from zamdet  ;