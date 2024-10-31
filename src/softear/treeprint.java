package softear;
import java.io.*;



public class treeprint {
    public static void main(String[] args) throws IOException{

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuffer sb = new StringBuffer();

        sb.append("           *********           \n" +
                "      *****         ****       \n" +
                "    **                  **     \n" +
                "   *                      *    \n" +
                " **                        **  \n" +
                "*                            * \n" +
                "*                            * \n" +
                "**                          ** \n" +
                " **  *    ****  ****    *  **  \n" +
                "   ** ***** ****** ***** **    \n" +
                "             ****              \n" +
                "             ****              \n" +
                "             ****              \n" +
                "             ****              \n" +
                "            ******             \n" +
                "           ********\n" +
                "\n");

        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
}
