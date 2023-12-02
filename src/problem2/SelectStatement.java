package problem2;
import org.apache.commons.lang3.StringUtils;

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



    //inner Builder class
    public static class Builder {
        //set constant defaults, so we only have to check for nulls?
//        private static final String DEFAULT_SELECT = "";
//        private static final String DEFAULT_FROM = "";
//        private static final String DEFAULT_WHERE = "";
//        private static final String DEFAULT_GROUPBY = "";
//        private static final String DEFAULT_HAVING = "";
//        private static final String DEFAULT_ORDERBY = "";

        //inner class's instance variables
        private String select;
        private String from;
        private String where;
        private String group_by;
        private String having;
        private String order_by;

        public SelectStatement build() {
            //validation statements
            if (StringUtils.isBlank(select)) {
                throw new IllegalArgumentException("MUST have a SELECT statement.");
            }
            if (StringUtils.isBlank(from)) {
                throw new IllegalArgumentException("MUST have a FROM statement.");
            }
            //how do i check for GROUP BY and HAVING and WHERE?

            //if everything is okay, build this instance of SelectStatement
            return new SelectStatement(this);
        }

        //need SETTERS to assign values lol duh, how else were we gonna do it??
        public Builder setSelect(String select) {
            if (StringUtils.isBlank(select)) {
                throw new IllegalArgumentException("Must have SELECT statement");
            }
            this.select = select;
            return this;
        }

        public Builder setFrom(String from) {
            if (StringUtils.isBlank(select)) {
                throw new IllegalArgumentException("Must have FROM statement.");
            }
            this.from = from;
            return this;
        }
        //question. We can have this one so long as the others are valid.
        // do I need to check for both Select and From or just from?
        // how do the previous validations come into play?

        //what if they don't have a where statement? how do I allow them that?
        public Builder setWhere(String where) {
            if (StringUtils.isBlank(select) || StringUtils.isBlank(from)) {
                throw new IllegalArgumentException("Must have SELEct and FROM statements.");
            }
            this.where = where;
            return this;
        }


    }

    @Override   //why is this not working?
    public String toString() {
        return "[SELECT=" + select + "]" + "[FROM=" + from + "]";
    }
    //System.out.println(this); //must override toString so we actually get what we want printed out. why is println an error?

}

