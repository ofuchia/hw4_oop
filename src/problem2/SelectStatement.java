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

    public String printStatement() {
        String finalStatement = select + from + where + group_by + having + order_by;
        return finalStatement;
    }
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
        //default values for optional statements
        private static final String DEFAULT_WHERE = "";
        private static final String DEFAULT_GROUPBY = "";
        private static final String DEFAULT_HAVING = "";
        private static final String DEFAULT_ORDERBY = "";

        //assigning inner class's instance variables
        private String select;
        private String from;

        //assigning constant default values (eliminating magic numbers)
        private String where =  DEFAULT_WHERE;
        private String group_by = DEFAULT_GROUPBY;
        private String having = DEFAULT_HAVING;
        private String order_by = DEFAULT_ORDERBY;



        public SelectStatement build() {
            //validation and relational statements

            //MUST HAVE SELECT
            if (StringUtils.isBlank(select)) {
                throw new IllegalArgumentException("MUST have a SELECT statement.");
            }
            //MUST HAVE FROM
            if (StringUtils.isBlank(from)) {
                throw new IllegalArgumentException("MUST have a FROM statement.");
            }
            //dont need to check WHERE or GROUP BY explicitly because it must go along with SELECT and FROM
            // which are being checked for above

            //can only have HAVING if there is a valid GROUP BY
            if (!StringUtils.isBlank(having) && StringUtils.isBlank(group_by) ) {
                throw new IllegalArgumentException("MUST have a GROUP BY statement if using HAVING.");
            }
            //if everything is okay, build this instance of SelectStatement
            return new SelectStatement(this);
        }

        //need SETTERS to assign values
        public Builder setSelect(String select) {
            if (StringUtils.isBlank(select)) {
                throw new IllegalArgumentException("Must have SELECT statement");
            }
            this.select = "Select " + select;
            return this;
        }

        public Builder setFrom(String userFrom) {
            if (StringUtils.isBlank(userFrom)) {
                throw new IllegalArgumentException("Must have FROM statement.");
            }
            this.from = "\nFrom " + userFrom;
            return this;
        }

        public Builder setWhere(String where) {
            if (StringUtils.isBlank(where)) {
                throw new IllegalArgumentException("Must have WHERE statement.");
            }
            this.where = "\nWhere " + where;
            return this;
        }

        public Builder setGroupBy(String groupby) {
            if (StringUtils.isBlank(groupby)) {
                throw new IllegalArgumentException("Must have GROUP BY statement.");
            }
            this.group_by = "\nGroup By " + groupby;
            return this;
        }

        public Builder setHaving(String having) {
            if (StringUtils.isBlank(having)) {
                throw new IllegalArgumentException("Must have WHERE statement.");
            }
            this.having = "\nHaving " + having;
            return this;
        }

        public Builder setOrderBy(String order_by) {
            if (StringUtils.isBlank(order_by)) {
                throw new IllegalArgumentException("Must have WHERE statement.");
            }
            this.order_by = "\nOrder By " + order_by;
            return this;
        }




    }

}

