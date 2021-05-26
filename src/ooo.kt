import kotlin.math.*

fun main()
{
//    print("Вас приветствует решебник по задачам Абрамяна на языке Kotlin. Чтобы протестировать результат работы программ, выберите нужную Вам задачу.\n")
    print("Вас приветствует операционная система Console+\n")
  explorer()

}


fun explorer()
{

    print("Сейчас в решебнике присутствуют задачи:\nBegin1\nBegin2\nBegin8\nBegin21\n")
    print("Выберите задачу(первая буква категория, цифра - номер задачи. Например Begin1 = b1)\nВаш выбор: ")
    var user_choise = readLine().toString().toLowerCase()
    when(user_choise)
    {
        "b1" -> Begin1()
        "b2" -> Begin2()
        "b8" -> Begin8()
        "b21" -> Begin21()
        "999" -> Begin999()
        "if1" -> If1()
        "if2" -> If2()
        "if3" -> If3()
        "if4" -> If4()
        "if5" -> If5()
        "if7" -> If7()
        "if6" -> if6()
        "if10" -> If10()
        "if11" -> If11()
        "if12" -> If12()
        "if13" -> If13()
        "if14" -> If14()
        "if15" -> If15()
        "if16" -> If16()
        "m1"-> math_1()
        "shard"->AsteroidShard()
        "shop" -> ShopGameStart()
        else -> print("Такой задачи нет :( ")
    }
}
fun Begin1()
{
    print("\nДана сторона квадрата a. Найти его периметр P = 4·a\n")
    print("Введите сторону квадрата а: ")
    var a = readLine()!!.toFloat()
    var Perimeter = 4*a
    print("Периметр квадрата со стороной а = $a: $Perimeter \nДемонстрация завершена!\n")
}
fun Begin2()
{
    print("\nДана сторона квадрата a. Найти его площадь S = a*a\n")
    print("Введите сторону квадрата а: ")
    var a = readLine()!!.toFloat()
    var Square = a*a
    print("Площадь квадрата = $Square \nДемонстрация завершена!\n")
}
fun Begin8()
{
    print("\nДаны два числа a и b. Найти их среднее арифметическое: (a + b)/2.\n")
    print("Введите первое число а: ")
    var a = readLine()!!.toFloat()
    print("Введите второе число b: ")
    var b = readLine()!!.toFloat()
    var sred_arifm = (a+b)/2
    print("Cреднее арифметическое = $sred_arifm \nДемонстрация завершена!\n")
}
fun Begin999()
{
//    print("\nДаны два числа a и b. Найти их среднее арифметическое: (a + b)/2.\n")
    print("Введите число которое хотите протестировать: ")
    var a = readLine()!!.toDouble()
//    print("Введите второе число b: ")
//    var b = readLine()!!.toFloat()
    var stepen = a.pow(2)
    var koren = sqrt(stepen)
    print("Корень из числа $stepen = $koren\nДемонстрация завершена!\n")
}
fun Begin21()
{
    print("Даны координаты трех вершин треугольника: (x1, y1), (x2, y2), (x3, y3).\n" +
            "Найти его периметр и площадь, используя формулу для расстояния между двумя точками на плоскости.\n"  +
            "Для нахождения площади треугольника со сторонами a, b, c использовать формулу Герона\n")

    print("Введите координаты первой вершины треугольника...\nВведите x1: ")
    var x1 = readLine()!!.toDouble()
    print("Введите y1: ")
    var y1 = readLine()!!.toDouble()
    print("Введите координаты второй вершины треугольника...\nВведите x2: ")
    var x2 = readLine()!!.toDouble()
    print("Введите y2: ")
    var y2 = readLine()!!.toDouble()
    print("Введите координаты третьей вершины треугольника...\nВведите x3: ")
    var x3 = readLine()!!.toDouble()
    print("Введите y3: ")
    var y3 = readLine()!!.toDouble()
    var a = sqrt((x2-x1).pow(2)+(y2-y1).pow(2))
    var b = sqrt((x3-x2).pow(2)+(y3-y2).pow(2))
    var c = sqrt((x1-x3).pow(2)+(y2-y1).pow(2))
    var Perimeter = a+b+c
    var p = Perimeter/2
    var Square = sqrt(p*(p-a)*(p-b)*(p-c))
    print("Сторона а = $a\nСторона b = $b\nСторона c = $c\n")
    println("Периметр треугольника = $Perimeter")
    println("Площадь треугольника = $Square")

}
fun If1()
{

    println("If1. Дано целое число. Если оно является положительным, то прибавить к\n" +
            "нему 1; в противном случае не изменять его. Вывести полученное число.")

    print("Введите целое число а: ")
    var a = readLine()!!.toInt()
    if(a>0)
    {
        a=a+1000000000
        println("Число а оказалось положительным и равно ${a-1000000000}, по условию задачи, нужно прибавить +1000000000. а = $a")
    }
    else
    {
        println("Число а оказалось не положительным и равно $a, по условию задачи изменять его не нужно. а = $a")
    }

}
fun If2()
{


    println(
        "If2.  Дано целое число. Если оно является положительным, то прибавить к\n" +
                "нему 1; в противном случае вычесть из него 2. Вывести полученное число."
    )

    print("Введите целое число b: ")
    var b = readLine()!!.toInt()
    if (b > 0)
    {
        b = b + 2
        println("Число b оказалось положительным и равно ${b - 2}, по условию задачи, нужно прибавить +2. b = $b")
    }
    else
    {
        b = b - 3
        println("Число b оказалось не положительным и равно ${b + 3}, по условию задачи, нужно отнять -3. b = $b")
    }
}
fun If3()
{
    println( "If3. Дано целое число. Если оно является положительным, то прибавить к\n" +
            "нему 1; если отрицательным, то вычесть из него 2; если нулевым, то\n" +
            "заменить его на 10. Вывести полученное число.\n")
    print("Введите число: ")
    var c = readLine()!!.toInt()

    if(c > 0)
    {
        c=c+1
        println("Число оказалось положительным, поэтому +1. Число с = $c")
    }
    if(c < 0)
    {
        c=c-2
        println("Число оказалось отрицательным, поэтому -2. Число c = $c")
    }
    if (c == 0)
    {
        c=10
        println("Число оказалось  нулевым, поэтому = 10. Число c = $c")

    }
}
fun If4()
{
    print("If4. Даны три целых числа. Найти количество положительных чисел в исходном наборе.\n")
    print("Введите первое число: ") // вывод сообщения с пояснением для пользователя
    var num1 = readLine()!!.toInt() //целое число - вводится в консоль через readLine()
    print("Введите второе число: ") // вывод сообщения с пояснением для пользователя
    var num2 = readLine()!!.toInt() //целое число - вводится в консоль через readLine()
    print("Введите третье число: ") // вывод сообщения с пояснением для пользователя
    var num3 = readLine()!!.toInt() //целое число - вводится в консоль через readLine()
    var counter = 0 //целое число - счетчик положительных чисел

    if(num1>0) // Если первое число больше нуля(значит положительное - к счетчику прибавится 1)
        counter++ // ++ - означает прибавить 1 к текущему значению переменной
    if(num2>0) // Если первое число больше нуля(значит положительное - к счетчику прибавится 1)
        counter++ // ++ - означает прибавить 1 к текущему значению переменной
    if(num3>0) // Если первое число больше нуля(значит положительное - к счетчику прибавится 1)
        counter++ // ++ - означает прибавить 1 к текущему значению переменной
    println("Количество положительных чисел в исходном наборе: $counter") //сообщение с выводом количества насчитаных счетчиком положительных чисел

}
fun If5()
{
    print("If5. Даны три целых числа. Найти количество положительных и количество отрицательных чисел в исходном наборе.\n")
    print("Введите первое число: ") // вывод сообщения с пояснением для пользователя
    var num1 = readLine()!!.toInt() //целое число - вводится в консоль через readLine()
    print("Введите второе число: ") // вывод сообщения с пояснением для пользователя
    var num2 = readLine()!!.toInt() //целое число - вводится в консоль через readLine()
    print("Введите третье число: ") // вывод сообщения с пояснением для пользователя
    var num3 = readLine()!!.toInt() //целое число - вводится в консоль через readLine()

    var counter_plus = 0 //целое число - счетчик положительных чисел
    var counter_minus = 0 //целое число - счетчик отрицательных чисел
    var counter_null = 0 //целое число - счетчик нулевых чисел


    //Счетчик положительных чисел
    if(num1>0) // Если первое число больше нуля(значит положительное - к счетчику прибавится 1)
        counter_plus++ // ++ - означает прибавить 1 к текущему значению переменной
    if(num2>0) // Если первое число больше нуля(значит положительное - к счетчику прибавится 1)
        counter_plus++ // ++ - означает прибавить 1 к текущему значению переменной
    if(num3>0) // Если первое число больше нуля(значит положительное - к счетчику прибавится 1)
        counter_plus++ // ++ - означает прибавить 1 к текущему значению переменной

    //Счетчик отрицательных чисел


    //Счетчик нулевых чисел
    if(num1==0)
        counter_null++
    if(num2==0)
        counter_null++
    if(num3==0)
        counter_null++
    println("Количество положительных чисел в исходном наборе: $counter_plus") //сообщение с выводом количества насчитаных счетчиком положительных чисел
    println("Количество отрицательных чисел в исходном наборе: $counter_minus")
    println("Количество нулевых чисел в исходном наборе: $counter_null")
}
fun if6 ()
{
    println("ВЕДИТЕ 1 ЧИСЛО")
    var num1 = readLine()!!.toInt()
    println("ВЕДИТЕ 2 ЧИСЛО")
    var num2 = readLine()!!.toInt()

if (num1 > num2)
    println("Первое число больше, поэтому выводим его - $num1")

if (num1 < num2)

    println("Второе число больше, поэтому выводим его - $num2")



}
fun If7()
{
    println("Даны два числа. Вывести порядковый номер меньшего из них")

    print("Введите первое число: ")
    var a = readLine()!!.toInt()
    print("Введите второе число: ")
    var b = readLine()!!.toInt()
    if (a > b)
        print("1")
    if (a < b)
        print("2")
    if (a == b)
        print("А числа то оба $a, равны...тру-ля-ля")
}
fun If10()
{
    print("Введите первое число: ")
    var num_A = readLine()!!.toInt()
    print("Введите второе число: ")
    var num_B = readLine()!!.toInt()

    if(num_A==num_B)
    {
        num_A = 0
        num_B = 0
        println("Значения переменных равны, значит их нужно прировнять к нулю\nЗначение А = $num_A\n" +
                "Значение B = $num_B")
    }
    else
    {

        num_A = num_A+num_B
        num_B = num_A
        println("Значения переменных не равны, значит их нужно суммировать\nЗначение А = $num_A\n" +
                "Значение B = $num_B")
    }


}
fun If11()
{
    print("Введите первое число: ")
    var num_A = readLine()!!.toInt()
    print("Введите второе число: ")
    var num_B = readLine()!!.toInt()

    if(num_A==num_B)
    {
        num_A = 0
        num_B = 0
        println("Значения переменных равны, значит их нужно прировнять к нулю\nЗначение А = $num_A\n" +
                "Значение B = $num_B")
    }
    else
    {
        if(num_A>num_B)
            num_B = num_A
        else
            num_A = num_B

        println("Значения переменных не равны, значит переезаписываем все на болшее значение\nЗначение А = $num_A\n" +
                "Значение B = $num_B")
    }


}
fun If12()
{
    println("Введите первое число: ")
    var num1 = readLine()!!.toInt()

    println("Введите второе число: ")
    var num2 = readLine()!!.toInt()

    println("Введите третье число: ")
    var num3 = readLine()!!.toInt()

if (num1 < num2 && num1 < num3)
    println("Первое число меньше, поэтому выводим его - $num1")

    if (num2 < num1 && num2 < num3)
        println("Второе число меньше, поэтому выводим его - $num2")

    if (num3 < num2 && num3 < num1)
        println("Третье число меньше, поэтому выводим его - $num3")



}
fun If13()
{
    println("Введите первое число: ")
    var num1 = readLine()!!.toInt()

    println("Введите второе число: ")
    var num2 = readLine()!!.toInt()

    println("Введите третье число: ")
    var num3 = readLine()!!.toInt()

    if ((num2 > num1&&num1 > num3)||(num3 > num1&&num1 > num2)) // 1 2 3
        println("Первое число среднее, поэтому выводим его - $num1")

    if ((num1 > num2&&num2 > num3)||(num3 > num2&&num2 > num1))
        println("Второе число среднее, поэтому выводим его - $num2")

    if ((num1 > num3&&num3 > num2)||(num2 > num3&&num3 > num1))
        println("Третье число среднее, поэтому выводим его - $num3")



}

fun If14()
{
 print("If14.\nДаны три числа. Вывести вначале наименьшее,\n" +
         "а затем наибольшее из данных чисел\n")

    print("Введите первое число: ")
    var a = readLine()!!.toDouble()
    print("Введите второе число: ")
    var b = readLine()!!.toDouble()
    print("Введите третье число: ")
    var c = readLine()!!.toDouble()
    if (a<b&&b<c)
    {
        println("Первое число меньше, поэтому выводим его - $a")
    }
    if (b<a&&b<c)
    {
        println("Второе число меньше, поэтому выводим его - $b")
    }
    if (c<b&&c<a)
    {
        println("Третье число меньше, поэтому выводим его - $c")
    }
    println("_______________________________________________")
    if (a>b&&b>c)
    {
        println("Первое число больше, поэтому выводим его - $a")
    }
    if (b>a&&b>c)
    {
        println("Второе число больше, поэтому выводим его - $b")
    }
    if (c>b&&c>a)
    {
        println("Третье число больше, поэтому выводим его - $c")
    }




}

fun If15()
{
    println("If15. Даны три числа. Найти сумму двух наибольших из них.")

    //Блок ввода чисел
    print("Введите первое число: "); var a = readLine()!!.toDouble()
    print("Введите второе число: "); var b = readLine()!!.toDouble()
    print("Введите третье число: "); var c = readLine()!!.toDouble()

    //Блок условий

    if ((a>b&&b>c)||(b>a&&a>c))//a и b - наибольшие(c - меньшее)
    {
        var SUMM = a+b
        print("Сумма наибольших чисел = $SUMM")
    }
    if ((c>b&&b>a)||(b>c&&c>a))//b и c - наибольшие(a - меньшее)
    {
        var SUMM = b+c
        print("Сумма наибольших чисел = $SUMM")
    }
    if ((a>c&&c>b)||(c>a&&a>b))//a и c - наибольшие(b - меньшее)
    {
        var SUMM = a+c
        print("Сумма наибольших чисел = $SUMM")
    }
println("If16.\nДаны три переменные вещественного типа: A, B, C.\n" +
        "Если их значения упорядочены по возрастанию, то удвоить их;\n" +
        "в противном случае заменить значение каждой переменной на противоположное.\n" +
        "Вывести новые значения переменных A, B, C.")
}

fun If16()
{
    println("If16.\nДаны три переменные вещественного типа: A, B, C.\n" +
            "Если их значения упорядочены по возрастанию, то удвоить их;\n" +
            "в противном случае заменить значение каждой переменной на противоположное.\n" +
            "Вывести новые значения переменных A, B, C.")

    //Блок ввода чисел
    print("Введите первое число: "); var a = readLine()!!.toDouble()
    print("Введите второе число: "); var b = readLine()!!.toDouble()
    print("Введите третье число: "); var c = readLine()!!.toDouble()

    //Блок условий(1   2   3)
    if(a==b&&b==c)
    {
        print("Все числа равны: оставляем как есть!")}
    else{
        if(c>b&&b>a)
        {
            c =c*2
            a =a*2
            b =b*2
            print("Значения чисел A,B и C упорядочены по возрастанию, значит их нужно удвоить.\n" +
                    "Новые значения чисел:\n" +
                    "A = $a\n" +
                    "B = $b\n" +
                    "C = $c\n")
        }
        else
        {
            c = -c
            a = -a
            b = -b
            print("Значения чисел A,B и C не упорядочены по возрастанию, значит их нужно заменить на противоположные.\n" +
                    "Новые значения чисел:\n" +
                    "A = $a\n" +
                    "B = $b\n" +
                    "C = $c\n")}
    }


}
/*17.00*/


fun math_1()
{

    var a1 = 4.0
    var a2 = 60.0
    var a3 = 9.0
    print("Введите сторону куба вручную: ")
    var a = readLine()!!.toDouble()

    var V = a.pow(3)
    var V1 = a1.pow(3)
    var V2 = a2.pow(3)
    var V3 = a3.pow(3)

    println("Объем куба со стороной а = $a1: $V1 см3")
    println("Объем куба со стороной а = $a2: $V2 см3")
    println("Объем куба со стороной а = $a3: $V3 м3")
    println("Объем куба со стороной а = $a: $V см3")
}











/*println("ВЕДИТЕ 1 ЧИСЛО")
var num1 = readLine()!!.toInt()
println("ВЕДИТЕ 2 ЧИСЛО")
var num2 = readLine()!!.toInt()

if (num1 > num2)
println("Первое число больше, поэтому выводим его - $num1")

if (num1 < num2)

println("Второе число больше, поэтому выводим его - $num2")

if (num1 = num2)

println("Оба числа равны, поэтому выводим их - $num1 = $num2")
*/

fun AsteroidShard()
{

    print(
        "Вас привествует игра 'AsteroidShard'... \n" +
                "Приветствую, командир! Вы начальник космической базы, а я Ваш компьютерный помощник на базе ИИ-17bF47.\n" +
                "В моей консоли управления содержится вся информация о нашей космической базе.\n" +
                "Такаже с моей помощью Вы можете оперировать всеми шлюзами и отдавать приказы не отходя от консоли.\n" +
                "На данный момент доступны команды: -scan , -mining, -loot, -open, -close\n" +
                "На начальном этапе развития Вы должны добыть ресурсы для поддержки функционирования базы.(за топливо)\n" +
                "Каждая команда связанная с расходом топлива отнимает -2 топлива.\n"
    )

    var fuel = 100
    var minerals = 0
    var gas = 0
    var oxygen = 1000
    var meteor1 = 0
    var meteor2 = 0
    var meteor3 = 0
    var meteor4 = 0

    var time = 0
    var mining = 0

    while (true) {

        print("Выберите действие: ");
        var operation = readLine()!!.toLowerCase()

        when (operation) {
            "scan" -> {
                print("Ведется сканирование...")
                meteor1 = (5..16).random()
                meteor2 = (1..29).random()
                meteor3 = (8..10).random()
                meteor4 = (0..60).random()
                Thread.sleep(1000)
                print(
                    "По близости обнаружено 4 метеорита:\n" +
                            "1. Размер[$meteor1]\n" +
                            "2. Размер[$meteor2]\n" +
                            "3. Размер[$meteor3]\n" +
                            "4. Размер[$meteor4]\n"
                )
            }


            "mining" -> {
                print("Выберите метеорит для начала добычи ресурсов:")
                mining = readLine()!!.toInt()
                when (mining) {
                    1 -> {
                        time = meteor1 / (1..5).random(); print("Добыча этого метеорита займет $time времени.")
                    }
                    2 -> {
                        time = meteor2 / (2..6).random(); print("Добыча этого метеорита займет $time времени.")
                    }
                    3 -> {
                        time = meteor3 / (3..4).random(); print("Добыча этого метеорита займет $time времени.")
                    }
                    4 -> {
                        time = meteor4 / (4..9).random(); print("Добыча этого метеорита займет $time времени.")
                    }
                    else -> print("SystemError!")
                }


            }
            "loot" -> {
                print("")
            }
            "open" -> {
                print("")
            }
            "close" -> {
                print("")
            }
            else -> {
                print("SystemError! Command $operation is not found!")
            }

        }
    }





}


fun Info() {
    print(
        "Вас привествует игра 'ShopGame', тут есть покупки и закупки. C оптом и без опта.\n" +
                "scan - обзор цен на все товары\n" +
                "buy - покупка товара за цену указанную сверху\n" +
                "sell - продажа выбранных Вами продуктов, которые есть у Вас в наличии\n" +
                "В начале игры у Вас на депозите есть деньги(240$)\n" +
                "Вы должны их преумножить, но помните, что помимо товаров деньги можно потерять на функции scan(-5 за 1 раз)\n" +
                "Пишите команды в консоль для покупки(buy), продажи(sell) и поиска информации(scan)\n"
    )
}


    fun ShopGameStart() {
        Info()

        val goods_names = mutableMapOf(
            1 to "Кока-Коли",
            2 to "Молоко",
            3 to "Хлеб",
            4 to "Вода",
            5 to "Собакас"
        )
        var pr = goods_names.values
        var Money = 240
        var koka_count = 0
        var milk_count = 0
        var bread_count = 0
        var water_count = 0
        var sobakas_count = 0
        var mass_buy_sell = 0
        var product = 0
        var product_price = 0
        var product_count = 0
        var name_buffer = ""
        var run = true

        while (run) {
            print("\nВыберите действие[buy/sell/scan]: ")
            var user_choise = readLine()!!.toString().toLowerCase()
            when (user_choise) {
                "buy" -> {
                    print("Выберите количество товара $name_buffer для покупки: "); mass_buy_sell = readLine()!!.toInt()
                    if (Money >= (product_price * mass_buy_sell)) {
                        Money = Money - product_price * mass_buy_sell;println("Ваш счет: $Money$")
                        when (product) {
                            1 -> koka_count = koka_count + mass_buy_sell
                            2 -> milk_count = milk_count + mass_buy_sell
                            3 -> bread_count = bread_count + mass_buy_sell
                            4 -> water_count = water_count + mass_buy_sell
                            5 -> sobakas_count = sobakas_count + mass_buy_sell
                            else -> print("\nОшибка!")
                        }
                    } else {
                        println("Недостаточно денег! Вы можете купить только ${(Money / product_price).toInt()}шт. $name_buffer")
                    }
                }
                "sell" -> {
                    try {
                        print("Выберите количество товара $name_buffer для продажи: "); mass_buy_sell = readLine()!!.toInt()
                        when (product) {
                            1 -> {
                                product_count = koka_count
                                if ((koka_count > 0) && (koka_count >= mass_buy_sell)) {
                                    koka_count = koka_count - mass_buy_sell
                                    Money = Money + product_price * mass_buy_sell;println("Ваш счет: $Money$")
                                }
                                else
                                    print("Недостаточно товара на складе!\n" +
                                            "Товара $name_buffer всего лишь $product_count шт.")
                            }
                            2 -> { product_count = milk_count

                                if ((milk_count > 0) && (milk_count >= mass_buy_sell)) {
                                    milk_count = milk_count - mass_buy_sell
                                    Money = Money + product_price * mass_buy_sell;println("Ваш счет: $Money$")
                                }
                                else
                                    print("Недостаточно товара на складе!\n" +
                                            "Товара $name_buffer всего лишь $product_count шт.")
                            }
                            3 -> {
                                product_count = bread_count
                                if ((bread_count > 0) && (bread_count >= mass_buy_sell)) {
                                    bread_count = bread_count - mass_buy_sell
                                    Money = Money + product_price * mass_buy_sell;println("Ваш счет: $Money$")
                                }
                                else
                                    print("Недостаточно товара на складе!\n" +
                                            "Товара $name_buffer всего лишь $product_count шт.")
                            }
                            4 -> {
                                product_count = water_count
                                if ((water_count > 0) && (water_count >= mass_buy_sell)) {
                                    water_count = water_count - mass_buy_sell
                                    Money = Money + product_price * mass_buy_sell;println("Ваш счет: $Money$")
                                }
                                else
                                    print("Недостаточно товара на складе!\n" +
                                            "Товара $name_buffer всего лишь $product_count шт.")
                            }
                            5 -> {
                                product_count = sobakas_count
                                if ((sobakas_count > 0) && (sobakas_count >= mass_buy_sell)) {
                                    sobakas_count = sobakas_count - mass_buy_sell
                                    Money = Money + product_price * mass_buy_sell;println("Ваш счет: $Money$")
                                }
                                else
                                    print("Недостаточно товара на складе!\n" +
                                            "Товара $name_buffer всего лишь $product_count шт.")
                            }
                            else -> print("\nОшибка!")
                        }
                    }
                    catch (e:Exception)
                    {
                        print("Вы ввели не предусмотренное значение попробуйте еще раз!")
                    }
                    catch (e:NumberFormatException)
                    {
                        print("Вы ввели не предусмотренное значение попробуйте еще раз!")
                    }
                }
                "scan" -> {
                    try{  Money = Money - 5
                        print(
                            "\nВыберите продукт:\n" +
                                    "1.Кока-Коли[$koka_count]\n" +
                                    "2.Молоко[$milk_count]\n" +
                                    "3.Хлеб[$bread_count]\n" +
                                    "4.Вода 'Грязный источник'[$water_count]\n" +
                                    "5.Собакас[$sobakas_count]\n"
                        ); print("Выберите продукт: ");
                        product = readLine()!!.toInt();
                        var koka = 56
                        var milk = 50
                        var bread = 23
                        var water = 19
                        var sobakas = 115
                        when (product) {
                            1 -> {
                                name_buffer = "Кока-коли"
                                koka = (40..64).random();print("\nКока-Коли: $koka$\n");product_price =
                                    koka;print("Ваш банк: $Money$")
                            }
                            2 -> {
                                name_buffer = "Молоко"
                                milk = (35..70).random();print("\nМолоко: $milk$\n");product_price =
                                    milk;print("Ваш банк: $Money$")
                            }
                            3 -> {
                                name_buffer = "Хлеб"
                                bread = (15..30).random();print("\nХлеб: $bread$\n");product_price =
                                    bread;print("Ваш банк: $Money$")
                            }
                            4 -> {
                                name_buffer = "Вода 'Грязный источник'"
                                water = (8..22).random();print("\nВода: $water$\n");product_price =
                                    water;print("Ваш банк: $Money$")
                            }
                            5 -> {
                                name_buffer = "Собакас"
                                sobakas = (80..150).random();print("\nСобакас: $sobakas$\n");product_price =
                                    sobakas;print("Ваш банк: $Money$")
                            }
                            else -> print("\nОшибка!")
                        }
                    }
                    catch(e:Exception)
                    {
                        print("Вы ввели не предусмотренное значение попробуйте еще раз!")
                    }
                }
                else -> print("Ошибка! Введите одну из предусмотренных команд[buy/sell/scan]\n")
            }
        }
    }