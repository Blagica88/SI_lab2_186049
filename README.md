# Втора лабораториска вежба по Софтверско инженерство
## Благица Пенкова, бр. на индекс 186049
### Група на код:
Ја добив групата на код 5

### Control Flow Graph
![tocen_graf](https://user-images.githubusercontent.com/62502968/84269326-5cf83280-ab29-11ea-9c30-7fe404d58296.png)


### Цикломатска комплексност
Цикломатската комплексност на овој код е 6, истата ја добив преку формулата P+1, каде што P е бројот на предикатни јазли. Во случајoв P=5, па цикломатската комплексност изнесува 6.

### Тест случаи според критериумот Every statement
![Screenshot_13](https://user-images.githubusercontent.com/62502968/84269456-84e79600-ab29-11ea-8beb-3d5e55dfc440.png)

Според тоа што има само 1 терминирачки услов,ние треба да имаме минимум два тестови.

Во првиот тест пример имаме прекин.

Во вториот тест пример програмата услешно се извршува, но не влегува во двата услови во една итерација.

Во вториот тест пример програмата услешно се извршува, но и влегува во двата услови во една итерација.

### Тест случаи според критериумот Every statement
(i - 1 >= 0 && list.get(i - 1).equals("#"))

FX:Имаме листа со само еден елемент што значи првиот услов нема да биде исполнет.

TF:Имаме листа од само нули што значи вториот услов нема да биде исполнет

TT:Имаме листа каде што ќе поминат и двата услови

Истото важи и за вториот услов бидејќи се во истиот for.

### Објаснување на напишаните unit tests
Целта на every statement тестовите е да поминат низ секој јазел од control flow графот, па тест примерите се такви што за секој if statement има еден што треба да го помине дадениот if statement, и еден тест пример што треба да падне на дадениот if statement.

Целта на multiple condition тестовите е да се тестираат деловите од кодот коишто зависат од повеќе услови, па првата група на тестови се однесува на

(i - 1 >= 0 && list.get(i - 1).equals("#"))

и ги проверува случаите TX, FT, FF соодветно.

Втората група на тестови се однесува на

(i + 1 < list.size() && list.get(i + 1).equals("#"))

и ги проверува случаите TX, FT, FF соодветно.

