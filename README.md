
# :heart: Projeto Senai POO

## :computer: Sistema de gestão de academia com os pilares da POO:


- **Encapsulamento** protege os dados das classes `Cliente` e `Instrutor`.
- **Herança** é aplicada com `Pessoa` sendo a classe pai de `Cliente` e `Instrutor`.
- **Polimorfismo** ocorre no método `getDescricao()`, que é sobrescrito em `Cliente` e `Instrutor`.
- **Composição** é utilizada na classe `Academia`, que contém uma lista de `Pessoa`.



### :high_brightness: Detalhes do projeto:
- **Abstração e Herança**: A classe `Pessoa` é **abstrata** e serve como base para `Cliente` e `Instrutor`.
- **Encapsulamento**: Os atributos são privados e acessados por métodos públicos.
- **Polimorfismo**: O método `getDescricao()` é sobrescrito para retornar informações específicas de `Cliente` e `Instrutor`.
- **Composição**: A `Academia` contém uma lista de `Pessoa`, que pode ser `Cliente` ou `Instrutor`.



### :satellite: Classe Pessoa (Herança aplicada)

### :notebook: Classe Cliente (Herança e Encapsulamento)

### :factory: Classe Instrutor (Herança e Encapsulamento)

### :red_car: Classe Academia (Composição e Polimorfismo)