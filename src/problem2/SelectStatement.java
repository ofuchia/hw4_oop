package problem2;
public class SelectStatement {
    //i think all of them must be here bc that's what the paper says. also we must define something if it'll be instantiated later, me thinks
    //instance variables
    private String select;
    private String from;
    private String where;
    private String group_by;
    private String having;
    private String order_by;

    //constructor for outerclass. takes in a type Builder and connects the inner class's variables with the outer classes
    private SelectStatement(Builder builder) {
        this.select = builder.select;
        this.from = builder.from;
        this.where = builder.where;
        this.group_by = builder.group_by;
        this.having = builder.having;
        this.order_by = builder.order_by;
    }



    //inner Builder class..repeats outer class's instance variables? yes bc we have to match builder with outer class's?
    public static class Builder {
        //set constant defaults, if any
        //inner class's instance variables
        private String select;
        private String from;
        private String where;
        private String group_by;
        private String having;
        private String order_by;

        public SelectStatement build() {
            //use if statements for validation purposes
            if (select == null) {
                throw new IllegalArgumentException("MUST have a SELECT statement.");
            }
            if (from == null) {
                throw new IllegalArgumentException("MUST have a SELECT statement.");
            }
            if (select == null && from != null) {
                throw new IllegalArgumentException("MUST have a SELECT statement to use FROM statement.");
            }
            //if everything is okay, build this instance of SelectStatement
            return new SelectStatement(this);
        }

        //need SETTERS to assign values lol duh, how else were we gonna do it??
        public Builder setSelect(String select) {
            if (select == null || select.isEmpty()) {
                throw new IllegalArgumentException("MUST input something for SELECT");
            }
            //this is why chaining is able to work, right? bc each setter is returning "this"
            this.select = select;
            return this;
        }
        public Builder setFrom(String from){
            //we have something under the FROM but nothing for SELECT
            if(from != null && !from.isEmpty() && (select.isEmpty() || select == null)) {
                throw new IllegalArgumentException("MUST input something for SELECT if using FROM");
            }
            this.from = from;
            return this;
        }

    }

    @Override   //why is this not working?
    public String toString() {
        return "[SELECT=" + select + "]" + "[FROM=" + from + "]";
    }
    //System.out.println(this); //must override toString so we actually get what we want printed out. why is println an error?

}

