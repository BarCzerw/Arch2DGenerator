package app.utilites.tools;

public class StringRepresenter {

    public static String represent(Object... arguments) {
        StringBuilder sb = new StringBuilder();

        for (Object argument : arguments) {
            sb.append(argument.toString() + ", ");
        }

        if (sb.length() > 0) {
            sb.delete(sb.length() - 2, sb.length() - 1);
        }

        return sb.toString();
    }

}
