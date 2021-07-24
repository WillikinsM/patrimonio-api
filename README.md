<div align="center">
<h1> REST api Gestão de patrimonio </h2>
</div>

**A Finalidade deste projeto foi criar uma REST api para gestão de patrimonios de uma empresa.**



**Foram utilizadas as seguintes tecnologias nesta REST api:**
### Java 11, PostgreSQL, SpringBoot 2 com as dependencias(H2 Database, Validation, Spring Data JPA, Spring Web , Spring Dev Tools)


****Esta api foi desenvolvida em camadas sendo as principais: Camada de Dominio, Camada de Serviços, Camada de Recursos e Camada de Repositorio.****

*A api possui dois perfis sendo respctivamente test e dev, o perfil teste utiliza o banco H2 rodando em tempo de compilação ja o perfil Dev utiliza o Postgresql(foi utilziada a extenção Dbeaver no eclipse para seu gerenciamento) *

*A api esta implementada com um CRUD Simples*

Endpoints suportados : 
```
/patrimonio  - lista todos os patrimonios cadastrados
/patrimonio/id   "id sendo o N° Tombo"
/marcas  "lista todas as marcas cadastradas"
/marcas/id  "id sendo o numero da marca"
/usuarios   "lista todos os usuarios cadastrados"
/usuarios/id  "id sendo o nome deste usuario"
```
Requisições suportadas :

```
Get -  Utilizado para listar as entidades, Todos Endpoints principais 
Post - Utilziado para criar entidades novas, Todos Endpoints principais, deve ser enviado como arquivo json!
Put -  Utilziado para atualizar  entidades já existentes,   Endpoints que contem /id
Delete - Utilziado para deletar entidades,  Endpoints que contem /id

```
Endpoints testados utilizando o Postman na versão 0.38.
Foi utilizada a versão 13 do PostgreeSQL.


