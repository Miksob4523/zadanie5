## Zadanie 5 - zakup biletów

Do zaimplementowania masz logikę biznesową związaną z zakupem biletów.
Klient może kupić jednocześnie kilka biletów dla rodziny lub znajomych i na podstawie ich danych, powinien dostać odpowiednie bilety i właściwą kwotę do zapłaty.
Tabela opłat wygląda następująco:
- dzieci do 5 lat (włącznie) - darmowy bilet
- dzieci do 15 roku - 10 zł
- uczniowie i studenci do 26 roku - 12 zł
- pozostali - 15 zł

Twoim zadaniem jest zaimplementować klasę **OrderTickets** tak, aby zwracała poprawne dane.
Zwracany jest obiekt klasy **Order**, który powinien zawierać wszystkie zakupione przez klienta bilety oraz zwracać kwotę zamówienia.
Aby mieć pewność, że wszystko działa prawidłowo, napisz do niej testy jednostkowe w klasie **OrderTicketsTests**.

#### Co będzie oceniane:
- implementacja metody takeOrder() i ewentualnie dodatkowych, pomocniczych metod w **OrderTickets**,
- implementacja metody addTicket() i getTotalPrice() w klasie **Order**,
- co najmniej 5 testów (osobnych metod) sprawdzających poprawność powyższej implementacji.

**Powodzenia!**

### Dla chętnych
- Dodaj możliwość ręcznego przetestowania tej aplikacji, czyli dodaj wczytywanie osób od użytkownika z konsoli i po zakończeniu wyświetl kupione bilety i całkowitą cenę.
- Dodaj możliwość korekty już istniejącego zamówienia, poprzez usunięcie jakiegoś biletu z już istniejącego zamówienia. Oczywiście napisz też do tego testy ;)
