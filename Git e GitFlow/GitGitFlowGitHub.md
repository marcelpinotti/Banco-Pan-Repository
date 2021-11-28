<h1>Git / GitFlow / GitHub</h1>

***GIT*** é um software de controle de versão distribuído (VCS), cujos objetivos são, ***controlar o histórico de versões estáveis*** (atualizações), permite o ***trabalho em equipe***, por possibilitar a ramificação do projeto principal (branch), e assim permite que o ***trabalho seja desenvolvido com segurança***, pois um desenvolvedor ou equipe conseguem modificar e atualizar sua parte do projeto sem alterar o código do projeto inteiro antes das validações. Então podemos dizer que o Git é um sistema que documenta e a armazena as etapas de desenvolvimento de um projeto. 

Na prática, o desenvolvedor possui um repositório próprio acoplado a uma área de trabalho. Quando o trabalho é feito em equipe, a comunicação entre os desenvolvedores é feita através de commit e update usando operações básicas, o pull (Puxar) e o push (Empurrar) .

Esquema de  fluxo de trabalho e de controle de versões usando ramificações (branches):

![Trabalhando com Branches no Git](../imagens/git-branches-merge.png?raw=true)



O **GITFLOW é um Workflow**, que tem por objetivo **organizar o fluxo de trabalho**. Ele organiza as atividades em sequência lógica para as suas realizações, preferencialmente de forma automatizada, ou seja, é o passo a passo mais eficiente e prático para a execução de um trabalho, **melhorando a eficiência** e a **produtividade** do mesmo.

***GITFLOW*** é um (framework) modelo alternativo de ramificação do Git, que consiste no uso de ramificações de recursos e várias ramificações primárias, ou seja, ramificações que são criadas automaticamente na inicialização do repositório do projeto. Tem por objetivos,  melhorar a organização da configuração e gerência das branches.

As branches que são inicializadas e cuidam do fluxo de trabalho e entregas são:

**Branch Master**: É ela quem guarda o histórico oficial das entregas;

**Branch Develop**: Ela serve para a integração entre todos os branches de funcionalidades (feature branches);

**Branch Feature**: É criada uma branch para cada funcionalidade, cada branch feature é criada a partir da branch develop, e com a entrega ela é "mergiada" a branch develop. A branc feature nunca devem interagir diretamente com a branch master.

**Release Branch: Quando o branch develop estiver com todas funcionalidades entregues, é criada um branch de entrega (release branch). É o ponto de "start" para um novo ciclo de entregas, e a release é mesclada com as branches master e develop.

**Maintenance  Branch**: é uma branch de manutenção, que serve para corrigir rapidamente algum erro durante a produção. Também é conhecida como  branch hotfix. Ela é utilizada para corrigir rapidamente algum problema em produção, e é finalizada após a correção. É a única branch criada a partir da master.

Esquema de  fluxo de trabalho e de controle de versões usando ramificações (branches):

![Trabalhando com Branches no GitFlow](../imagens/gitflow-branches.png?raw=true)



**GITHUB** é uma plataforma de hospedagem de código-fonte e arquivos com controle de versão usando o Git, também é conhecida como uma rede social para programadores. Ele permite que programadores, utilitários ou qualquer usuário cadastrado na plataforma contribuam em projetos privados e/ou Open Source de qualquer lugar do mundo.

![Trabalhando com Branches no GitFlow](../imagens/github.png?raw=true)



- Site para Download e documentação do Git: https://git-scm.com/

- Site com Documentação do GitFlow: https://git-flow.readthedocs.io/en/latest/

- Site do GitHub: https://github.com/

  


<h3>Comandos de Configuração (GIT e GITFLOW):</h3>

- Configurações de usuário:

  - ***git config - - global user.name  “SEU NOME DE USUÁRIO”***;

  - ***git config - - global user.email “SEU EMAIL”;***

  - ***git config - - list "LISTA USUÁRIOS CADASTRADOS";***

    

<h3>Comandos básicos:</h3>

***GIT***

- ***git init***  - inicializa o git no repositório local. 

- ***git add nome-do-arquivo ou .*** - adiciona o arquivo modificado no stagging (área temporária).

- ***git status*** -  mostra os arquivos alterados e que foram ou não foram adicionados. 

- ***git commit –am ou -m “legenda-do-commit”*** - adiciona para o git todos os arquivos Adds, com a mensagem “xxx” como titulo. 

- ***git pull*** - baixa todas as atualizações para a pasta local (remoto -> local).

- ***git push*** - envia as atualizações para o local remoto (local -> remoto).

- ***git push -u origin nome-da-branch*** - envia as atualizações para o local remoto (local -> remoto ).

- ***git clone  endereço-do-repositório-remoto***- traz e mantem um link de um repositório git  com uma pasta local ou um link de um repositório web. 

- ***git log*** - lista todos os commits (snapshot) que foram feitos e onde esta apontando o HEAD. 

- ***git branch*** - mostra a branch que está.

- ***git branch -M novo-nome*** - modifica o nome da branch.

- ***git checkout - - nome-do-arquivo*** - adiciona o seu repositório local ao remoto.

- ***git remote add origin "local-caminho"*** - adiciona o seu repositório local ao remoto.

- ***git checkout -b nome-da-branch*** - cria uma nova branch e vai para ela.

- ***git checkout*** - volta para branch anterior.

- ***git checkout - - nome-do-arquivo*** - descarta as alterações locais do arquivo informado.

- ***git reset*** - muda o ponteiro para o guid (pode ser soft e hard).

- ***git merge*** - mandamos as alterações para a branch principal.

  

***GITFLOW***

- ***git flow init*** -  inicializa repositório inicializando que na pasta será um gitflow (Serão inicializadas as branches master e develop, e são sugeridas a inicialização das outras braches).
- ***version tag prefix*** - inicializa a versão (por exemplo v1, v2) , se não quiser inicializar a versão é digitado (DONE).
- ***git flow feature start -nome-da-branch*** - inicializa uma branch feature com nome ou número de identificação.
- ***git flow feature finish -nome-da-branch*** - finaliza e deleta a branch feature que estava sendo utilizada, e não quebra a branch master ( do modo normal iriamos para a MAIN e  dar MERGE).
- ***git branch --list*** - lista as branches que existem no repositório e sinaliza em qual branch está sendo trabalhada.
- ***git flow release start -numero-da-versao*** - as releases representariam o ambiente de HML (homologação), é onde os QAs acessam e testam.
- ***git flow release finish -numero-da-versao*** - fecha a release (é aberto um editor para rotular o commit).
-  Após a rolutação do commit a branch release foi fechada e o fluxo de trabalho é  redirecionado para a  branch master.
