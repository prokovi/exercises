
# If and ternary operator

Пользователь вводит номер месяца (от 1 до 12).
Требуется вывести на экран соответствущее месяцу время года.
Попробуйте решить через if
(*дополнительно* Поместите получившуюся условную конструкцию в тело отдельного метода)

[Solution java](solutions/SeasonOfYearByMonth/src/Main.java)

---

Пользователь вводит три числа. Если каждое число больше 10, нужно вывести на экран 'yes', а если нет - 'no'.

[Solution java](solutions/MoreThan10/src/Main.java)

---

Пользователь вводит количество месяцев и лет, выведите на экран количество дней за это время. Из расчета, что в месяце 29 дней.

[Solution java](solutions/MonthsAndYearsToDays/src/Main.java)

---

Создадим навигационную панель для шапки сайта. Для этого создайте метод navbar, который принимает в себя isAdmin со значением истина или ложь.  
Если значение истина - выводит меню для администратора: "Кабинет админа Товары Заявки".
Если значение ложь - выводит меню для клиента: "Личный кабинет Корзина Любимое"
(попробуйте использовать тернарный оператор).

[Solution java](solutions/MonthsAndYearsToDays/src/Main.java)

---

# Classes and OOP. Create and draw LinkedList of rectangles objects

Task 1
Erstellen Sie das Projekt KomplexeUebungRechteck, erstellen Sie im Ordner src 4 packages mit den Namen model, view, controller, test. Erstellen Sie ein neues Repository und pushen Sie Ihr neues Projekt mit der Commitmessage "Projektsetup" mit einen ordentlich eingegeben Namen. Regelmäßige, aussagekräftige und vollständige Commitmessages sind ein Teil der Bewertung dieser Übung.
Hinweis: leere packages werden am Anfang noch nicht committed, also nicht wundern, das Projekt ist auf bitbucket noch (fast) leer.

Task 2
Erstellen Sie nach dem UML-Klassendiagramm im package model die Klasse Rechteck. Alle Attributwerte sollen im parameterlosem Konstruktor mit 0 initialisiert werden. Die Dia Datei stellt den aktuellen Stand des Projekts dar. Sie soll selbstständig immer aktuell gehalten werden. Erstellen Sie neben dem src-Ordner noch einen Ordner Entwurf, in dem Sie die Dia-Datei speichern und mit in die Versionierung aufnehmen.
Vergessen Sie nicht eine aussagekräftige Commitmessage.

![image](https://user-images.githubusercontent.com/104785655/224082217-fe68f40c-215a-403a-a520-afceb5039e3c.png)

Task 3
Erstellen sie im package test die Klasse RechteckTest. Diese soll 5 Rechtecke mit dem parameterlosen Konstruktor und 5 Rechtecke mit dem
vollparametrisierten Konstuktor erstellen.
Rechteck 0: 10,10,30,40
Rechteck 1: 25,25,100,20
Rechteck 2: 260,10,200,100
Rechteck 3: 5,500,300,25
Rechteck 4: 100,100,100,100
Rechteck 5: 200,200,200,200
Rechteck 6: 800,400,20,20
Rechteck 7: 800,450,20,20
Rechteck 8: 850,400,20,20
Rechteck 9: 855,455,25,25

Task 4
Erstellen Sie in der Klasse Rechteck die toString Methode, welche für das Rechteck 0 folgende Zeichenkette ausgeben soll: "Rechteck [x=10, y=10,
breite=30, hoehe=40]". Versehen Sie die Methode mit einer @Override Annotation(Warum?: https://docs.oracle.com/javase/tutorial/java/annotations/
predefined.html). Testen Sie in der RechteckTest-Klasse mittels Equals, ob Ihre Methode die richtige Zeichenkette auf der Konsole ausgibt.

Task 5
Legen Sie im package controller die Klasse BunteRechteckeController an. Statten Sie diese Klasse mit einer (leeren) Main-Methode aus. Einziges Attribut
der Klasse soll eine Liste von Rechtecken sein, die Sie rechtecke benennen. Im parameterlosen Konstruktor soll diesem Attribut aus Performancegründen eine
leere LinkedList zugewiesen werden. Implementieren Sie die Methoden des Controllers add(Rechteck rechteck), reset()//alle Rechtecke der Liste sollen
gelöscht werden, den Getter und überschreiben Sie die toString()-Methode. Erstellen Sie nun in der RechteckTest-Klasse ein Controllerobjekt und fügen Sie
die 10 Rechtecksobjekte aus dieser Klasse hinzu. Geben Sie anschließend das Controllerobjekt mittels toString() aus. (erwartete Ausgabe: "BunteRechteckeController [rechtecke=[Rechteck [x=10,
y=10, breite=30, hoehe=40], Rechteck [x=25, y=25, breite=100, hoehe=20],
Rechteck [x=260, y=10, breite=200, hoehe=100], Rechteck [x=5, y=500,
breite=300, hoehe=25], Rechteck [x=100, y=100, breite=100, hoehe=100],
Rechteck [x=200, y=200, breite=200, hoehe=200], Rechteck [x=800, y=400,
breite=20, hoehe=20], Rechteck [x=800, y=450, breite=20, hoehe=20],
Rechteck [x=850, y=400, breite=20, hoehe=20], Rechteck [x=855, y=455,
breite=25, hoehe=25]]]
")

Task 6
Erstellen Sie im package view die Klasse Zeichenflaeche, welche die Klasse
JPanel erweitert (Vererbung). Der Konstuktor soll ein Objekt der
BunteRechteckeController übergeben bekommen. Ein späteres Ändern oder
einen Zugriff auf das Controllerobjekt von außen soll nicht möglich sein.
Überschreiben Sie nun die Methode public void paintComponent(Graphics g).
Innerhalb dieser Methode könnnen Sie mit den Befehlen
g.setColor(Color.BLACK);
g.drawRect(0, 0, 50, 50);
ein Rechteck auf Position 0,0 mit den Ausmaßen 50x50 Pixel erstellt und in dem
JPanel gezeichnet. Holen Sie sich nun aus dem Controllerobjekt die Liste mit
den Rechtecken und zeichnen Sie jedes Rechteck, das sich in der Liste
befindet.
Die Klasse test.RechteckViewTest überprüft, ob sie korrekt gearbeitet haben.
Importieren Sie die Klasse in das richtige package und führen Sie sie aus.
ALSO THE CODE WITH END RESULT THAT YOU SHOULD PROGRAM  - RechteckViewTest.java

Task 7 This is a OOA (Objektorientierte Analyse) and
UML-Diagramm task only

Mit der letzten Aufgabe haben sie eine sehr einfache Model-View-Controller-
Architektur für unser Programm fertiggestellt. In den nächsten Aufgaben
werden wir unser Programm weiterentwickeln. Vorher lesen Sie bitte den Artikel
über die grundlegende Funktionsweise von MVC: http://www.datenbankenverstehen.
de/lexikon/model-view-controller-pattern/. Um uns die Architektur
anzuschauen, erstellen Sie ein UML-Klassendiagramm über den aktuellen Stand
des Programms(Wenn Sie wie in der 2. Programmieraufgabe die dia-Datei
immer aktuell gehalten haben, dann sind sie jetzt fertig). Ansonsten erstellen
Sie im Ordner Entwurf das Klassendiagramm. Nehmen Sie ein Format, welches
Sie später noch einmal verändern können und denken Sie ggf. in Zukunft daran
die Datei aktuell zu halten.

[Solution java](https://bitbucket.org/prokopchukmmm/programmier_hausaufgaben_mariia_2/
src/master/KomplexeUebungenRechteck/)

---
