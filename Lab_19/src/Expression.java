public class Expression {
    private static Expression exp;
    private Expression(){}
    public static Expression getResult(){
        if(exp==null){
            exp = new Expression();
        }
        return exp;
    }
    public double calculator(int x, int y){
        return 2*x+3.0/y;
    }
}
