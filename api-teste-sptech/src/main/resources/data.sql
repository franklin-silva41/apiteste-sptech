insert into colaborador
(colaborador_id, nome, nivelprofissional, semestreatual,donopost,especialidade.id_especialidade)
values
(null,'Franklin','estagiario','4','frank',1),
(null,'Henrique','estagiario','3','frank'),
(null,'Leticia','estagiario','2','frank'),
(null,'Matheus','estagiario','2','frank'),
(null,'Felipe','estagiario','2','Eduardo'),
(null,'Eduardo','lider tecnico','*','Eduardo');

insert into especialidade
(id_especialidade, especialidade, nivel)
values
(null, 'backend','basico');