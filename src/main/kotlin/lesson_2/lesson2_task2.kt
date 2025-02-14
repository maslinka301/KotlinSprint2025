package lesson_2

fun main() {

    val employees = 30
    val salaryOfOneEmployee = 30_000
    val interns = 20
    val salaryOfOneIntern = 20_000

    val salaryOfPermanentEmployees = employees* salaryOfOneEmployee
    val totalSalary = employees*salaryOfOneEmployee + interns*salaryOfOneIntern
    val averageSalaryWithInterns = totalSalary / (employees+interns)

    println(salaryOfPermanentEmployees)
    println(totalSalary)
    println(averageSalaryWithInterns)

}