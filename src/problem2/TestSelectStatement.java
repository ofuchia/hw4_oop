package problem2;

public class TestSelectStatement {

    public static void main(String[] args) {
        SelectStatement aStatement = new SelectStatement.Builder() // we are creating an instance of Builder
                .setSelect("SELECT") //should be SELECT + whatever the fuck we passing in... so i need ot append what's passed in with what is alr there, the SELECT
                .setFrom("Database_Name")
                .build();           //maybe i should print this out to console so client can see what they did. Should I do that here or in the build method?
        //figure out why my overrided toString isnt working
        //finish the other statements and their validations
    }
}
