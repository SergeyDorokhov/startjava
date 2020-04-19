select * from robots;
select * from robots where status = 'Alive';
select * from robots where mark in ('Mark-1', 'Mark-6');
select * from robots order by mark desc;
select * from robots where launch in (select min(launch) from robots);
select * from robots where kaijukill in ((select min(kaijukill) from robots),(select max(kaijukill) from robots));
select avg (weight) from robots;
update robots set kaijukill = kaijukill + 1 where status = 'Alive';
delete from robots where status != 'Alive';