package problem2;

public class TestSelectStatement {

    public static void main(String[] args) {
        //test1
        SelectStatement aStatement = new SelectStatement.Builder() // we are creating an instance of Builder
                .setSelect("pnumber, pname, count(*)")
                .setFrom("Project join Works_on on pnumber=pno")
                .setGroupBy("pnumber, pname")
                .setHaving("count(*) > 2")
                .build();

                System.out.println(aStatement.printStatement());

                //test2
                System.out.println("\n");

                SelectStatement bStatement = new SelectStatement.Builder()
                .setSelect("fname, lname, address")
                .setFrom("Employee join Department on dnumber=dno")
                .setWhere("dname='research'")
                .build();

                System.out.println(bStatement.printStatement());

                //test3
                System.out.println("\n");
                SelectStatement cStatement = new SelectStatement.Builder()
                        .setSelect("fname, lname, address")
                        .setFrom("Employee")
                        .build();
                //printing it out
                System.out.println(cStatement.printStatement());

                //test4
                System.out.println("\n");
                SelectStatement dStatement = new SelectStatement.Builder()
                        .setSelect("pnumber, pname, budget, count(*)")
                        .setFrom("Project join Works_on on pnumber=pno ")
                        .setWhere("budget > 200000")
                        .setGroupBy("pnumber, pname, budget")
                        .setHaving("count(*) > 2")
                        .setOrderBy("pnumber")
                        .build();

                //printing it out
                System.out.println(dStatement.printStatement());


    }
}
