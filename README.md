## Exercise 1
### Aufgabe: Klassen 1
- Lege eine Klasse model.Student an und überlege dir drei Eigenschaften
- Schreibe Methoden, um die Eigenschaften zu setzen und abzufragen
- Schreibe für jede Methode einen Test

## Exercise 2
### Aufgabe: Package
- Verschiebe deine Student Klasse in ein model Package und passe die Sichtbarkeiten und Referenzen an
- Schreibe eine Methode `toString` welche alle Eigenschaften eines Studenten als String zurückgibt
- Schreibe für deinen Student Klasse einen Konstruktor und verwende ihn

## Exercise 3
### Aufgabe: Objekt-Methoden
- Implementiere für deine Klasse `equals` und `hashCode`
- Nutze die `equals` Methode im Test

## Exercise 4
### Aufgabe: Random Student
Erstelle eine Klasse StudentDB mit folgenden Eigenschaften

1. Der Konstruktor nimmt ein Array von Studenten entgegen
2. Jeder Student hat einen Namen und eine Id
3. Die Methode `list` gibt alle Studenten zurück
4. Die Methode `toString()` gibt alle Studenten formatiert als String zurück
5. Die Methode `randomStudent()` gibt einen zufälligen Studenten zurück (Nutze für den Zufall `Math.random()`)

Schreibe für alle Methoden Tests (bis auf randomStudent() )

**Bonus**: Schreibe eine `add` und eine `remove` Methode, um Studenten hinzuzufügen und zu entfernen


## Exercise 5
Wednesday 2021-09-15
### Aufgabe: ArrayList
Ersetze in deiner StudentDB das Array durch eine `ArrayList`.


## Exercise 6
Thursday 2021-09-16
### Aufgabe: Map
Ersetzte in deiner StudentDb die Liste durch eine `Map`
  - nur intern sollte eine Map genutzt werden, nach außen hin können wir weiter das List interface zurückgeben (d.h. Konstruktor nimmt eine List entgegen, list Methode gibt `List<Student> weiterhin zurück)
  
Überlege was für eine Map und was für eine Arraylist spricht

## Exercise 7
Thursday 2021-09-16
### Aufgabe: Exceptions
- Erweitere die `add` Methode der StudentDB um eine Prüfung, ob die id bereits in der Liste vorhanden ist und schmeiße in dem Fall eine Runtime Exception
- Schreibe einen Test mittels `try` /`catch` der dieses Verhalten überprüft.