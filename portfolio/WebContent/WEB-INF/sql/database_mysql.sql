create table member (
	name varchar(30),
	userid	varchar(30),
	pwd varchar(20),
	email varchar(30),
	phone varchar(13),
	grade integer(1) default 0,  -- 0:사용자, 1:관리자
	primary key(userid)
);

insert into member values('이소미', 'somi', '1234', 'gmd@naver.com', '010-2362-5157', 0);
insert into member values('하상오', 'sang12', '1234', 'ha12@naver.com', '010-5629-8888', 1);
insert into member values('김윤승', 'light', '1234', 'youn1004@naver.com', '010-9999-8282', 0);

create table board (
	num integer(5) primary key auto_increment,
	pass varchar(30),
	name varchar(30),
	email varchar(30),
	title varchar(50),
	content varchar(1000),
	readcount integer(4) default 0,
	writedate timestamp default current_timestamp
);

create table product (
	code integer(5) auto_increment,
	name varchar(100),
	price integer(8),
	pictureurl varchar(50),
	description varchar(1000),
	primary key (code)
);

insert into product (name, price, pictureurl, description) values('개념을 콕콕 잡아주는 데이터베이스', 27000, 'db.jpg', '데이터베이스에 관한 모든 것을 쉽고 재미있게 정리한 교재...');
insert into product (name, price, pictureurl, description) values('웹 표준을 위한 HTML5', 25000, 'html5.jpg', 'HTML5 가이드북. 홈 페이지 제작을 위한 필수 선택 HTML 기본 문법...');
insert into product (name, price, pictureurl, description) values('Dynamic Programming book 시리즈-01 오라클 11g + PL/SQL', 25000, 'oracle.jpg','Dynamic 실무 코칭 프로그래밍 Book의 첫 번째 책으로, 오라클 11g의 새로운 ...');
insert into product (name, price, pictureurl, description) values('Visual C++ MFC 윈도우 프로그래밍', 26000, 'mfc.jpg', 'Visual C++를 처음 시작하는 독자의 눈높이에 맞춘 Visual C++...');
insert into product (name, price, pictureurl, description) values('jQuery and jQuery Mobile : 이해하기 쉽게 풀어쓴', 25000, 'jquery.jpg', '소스 하나로 데스크탑과 모바일까지 HTML5와 함께 사용한다. 초보자들도 ...');