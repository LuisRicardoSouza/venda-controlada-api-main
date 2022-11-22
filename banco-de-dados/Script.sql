create table tbCliente (
	id bigint primary key GENERATED ALWAYS AS IDENTITY,
    nome varchar(255) not null, 
    rua varchar(255) not null,
    numero varchar(255) not null,
    bairro varchar(255) not null,
    cidade varchar(255) not null
    );         
   
  create table tbProduto (
    id bigint primary key GENERATED ALWAYS AS IDENTITY,
  	nome varchar(255) not null,
  	produto varchar (3) not null,
  	pagamento varchar (8) not null  
  );