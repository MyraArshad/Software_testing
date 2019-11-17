package projectwork;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import java.util.*;
import java.util.logging.Logger;

public class database {

    static boolean flag_delete;
    static boolean flag_update;

    public database() {

    }

    public static void Insert(Admin a) {

        try {
            Connection con = connect.getConnection();
            System.out.println("Inserting records into the table...");
            PreparedStatement st = con.prepareStatement("INSERT INTO SIGNUP(FIRSTNAME,LASTNAME,USERNAME,EMAIL,PASSWORD)VALUES('" + a.First + "','" + a.Last + "','" + a.USer + "','" + a.email + "','" + a.pass + "')");

            int aa = st.executeUpdate();
            if (aa > 0) {
                System.out.println("Inserted records into the table...");
            } else {
                System.out.println("records cannot be Inserted into the table...");
            }

        } catch (SQLException se) {
            se.printStackTrace();
        }
        System.out.println("Goodbye!");

    }

    public static boolean CHECK(String USer, String pass) {

        ResultSet rs;
        try {
            Connection con = connect.getConnection();
            String sql = "Select USERNAME,PASSWORD FROM SIGNUP WHERE USERNAME='" + USer + "' and PASSWORD='" + pass + "'   ";

            System.out.println("SEARCHING record into the table...");
            PreparedStatement st = con.prepareStatement(sql);

            rs = st.executeQuery();
            int c = 0;
            while (rs.next()) {
                c = c + 1;
            }
            if (c == 1) {
                System.out.println(" record found in the table...");
                flag_delete = true;
            } else {
                System.out.println("record is not found!!");
                flag_delete = false;
            }

        } catch (SQLException se) {
            se.printStackTrace();
        }
        System.out.println("Goodbye!");
        if (flag_delete == true) {
            return true;
        } else {
            return false;
        }
    }

    public static int Insert1(organization o) {
        int a = 0;
        try {
            Connection con = connect.getConnection();
            System.out.println("Inserting records into the table...");
            PreparedStatement st = con.prepareStatement("INSERT INTO ORGANIZATION_TABLE(OID,NAME,ADDRESS,FOUNDER,FOUNDED_DATE,PHONE_NUMBER)VALUES('" + o.oid + "','" + o.name + "','" + o.address + "','" + o.founder + "','" + o.date + "','" + o.phone + "')");
            a = st.executeUpdate();

        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "You cannot add more than one organization!!");
        }

        System.out.println("Goodbye!");
        return a;
    }

    public static ResultSet Select() throws SQLException {
        Connection con = connect.getConnection();

        System.out.println("Creating statement...");
        Statement stmt = con.createStatement();
        String sql;
        sql = "SELECT * FROM ORGANIZATION_TABLE";
        ResultSet rs = stmt.executeQuery(sql);

        return rs;

    }

    public static ResultSet Selectdonors() throws SQLException {
        Connection con = connect.getConnection();

        System.out.println("Creating statement...");
        Statement stmt = con.createStatement();
        String sql;
        sql = "SELECT * FROM DONORS";
        ResultSet rs = stmt.executeQuery(sql);

        return rs;

    }

    public static boolean update_adress(String id, String update) {
        try {
            Connection con = connect.getConnection();
            String sql = "UPDATE ORGANIZATION_TABLE SET ADDRESS='" + update + "' WHERE OID = '" + id + "'";

            System.out.println("updating records into the table...");
            PreparedStatement st = con.prepareStatement(sql);

            int a = st.executeUpdate();
            if (a > 0) {
                System.out.println("update records into the table...");
                flag_update = true;
            } else {
                System.out.println("ID is not found!!");
                flag_update = false;
            }

        } catch (SQLException se) {
            se.printStackTrace();
        }
        System.out.println("Goodbye!");
        if (flag_update == true) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean update_phone(String id, String update) {

        try {
            Connection con = connect.getConnection();
            String sql = "UPDATE ORGANIZATION_TABLE SET PHONE_NUMBER='" + update + "' WHERE OID = '" + id + "'";

            System.out.println("updating records into the table...");
            PreparedStatement st = con.prepareStatement(sql);

            int a = st.executeUpdate();
            if (a > 0) {
                System.out.println("update records into the table...");
                flag_update = true;
            } else {
                System.out.println("ID is not found!!");
                flag_update = false;
            }

        } catch (SQLException se) {
            se.printStackTrace();
        }
        System.out.println("Goodbye!");
        if (flag_update == true) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkDonors(long dcnic) {
        boolean result = false;
        long n = 0;
        ResultSet myresobj = null;
        Statement mystatobj = null;
        String q = "Select * from Donors";
        Connection con = connect.getConnection();
        try {
            mystatobj = con.createStatement();
            myresobj = mystatobj.executeQuery(q);
            while (myresobj.next()) {
                n = myresobj.getLong("CNIC");
                if (n == dcnic) {
                    result = true;
                    break;
                }

            }
        } catch (SQLException ex) {
            ex.getStackTrace();
            // Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        }

        return result;

    }

    public boolean insertDonors(String a, long b, long c, String d) {
        String name = a;
        long cnic = b;
        long contacNumber = c;
        String email = d;
        boolean flag = false;
        try {
            Connection con = connect.getConnection();
            PreparedStatement add = con.prepareStatement("insert into DONORS values (?,?,?,?)");
            add.setString(1, name);
            add.setLong(2, cnic);
            add.setLong(3, contacNumber);
            add.setString(4, email);
            add.execute();
            flag = true;

        } catch (SQLException ex) {
            ex.getStackTrace();
            //  Logger.getLogger(manageDonors.class.getName()).log(Level.SEVERE, null, ex);
        }

        return flag;

    }

    public boolean deleteD(long dcnic) throws SQLException {
        Connection con = connect.getConnection();
        //searching
        boolean result = false;
        long n = 0;
        ResultSet myresobj = null;
        Statement mystatobj = null;
        String q1 = "SELECT * FROM DONORS";
        String q2 = "DELETE FROM DONORS WHERE CNIC=" + dcnic + "";

        try {
            mystatobj = con.createStatement();
            myresobj = mystatobj.executeQuery(q1);
            while (myresobj.next()) {
                n = myresobj.getLong("CNIC");
                if (n == dcnic) {
                    result = true; //it means found
                    Statement del = con.createStatement();
                    del.execute(q2);
                    break;
                }

            }
        } catch (SQLException ex) {
            ex.getStackTrace();
            // Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;

    }

    public boolean updateDonor_information(String a, String b, int counter) {
        Connection con = connect.getConnection();
        boolean result = false;
        String q = null;
        long tempa, tempb = 0;
        if (counter == 1) { //updateemail
            try {
                String sql = "UPDATE DONORS SET EMAIL='" + b + "' WHERE EMAIL= '" + a + "'";

                System.out.println("updating records into the table...");
                PreparedStatement st = con.prepareStatement(sql);

                int a1 = st.executeUpdate();
                if (a1 > 0) {
                    System.out.println("update records into the table...");
                    result = true;
                } else {
                    System.out.println("ID is not found!!");
                    result = false;
                }

            } catch (SQLException se) {
                se.printStackTrace();
            }
            System.out.println("Goodbye!");
            if (result == true) {
                return true;
            } else {
                return false;
            }

//            q = "UPDATE DONORS SET EMAIL= '" + b + "' WHERE NAME = ' " + a+"'";
//            System.out.println("executed query\n");
//            PreparedStatement st = con.prepareStatement(q);
//
//            st.executeUpdate();
//            System.out.println("executed query \n");
            //result = true;
        } else if (counter == 2) { //update name

            try {
                String sql = "UPDATE DONORS SET NAME='" + b + "' WHERE NAME= '" + a + "'";

                System.out.println("updating records into the table...");
                PreparedStatement st = con.prepareStatement(sql);

                int a1 = st.executeUpdate();
                if (a1 > 0) {
                    System.out.println("update records into the table...");
                    result = true;
                } else {
                    System.out.println("ID is not found!!");
                    result = false;
                }

            } catch (SQLException se) {
                se.printStackTrace();
            }
            System.out.println("Goodbye!");
            if (result == true) {
                return true;
            } else {
                return false;
            }

        }

        else if (counter == 4) { //update contactnum
            tempa = Long.parseLong(a);
            tempb = Long.parseLong(b);
            try {
                String sql = "UPDATE DONORS SET CONTACTNUMBER='" + b + "' WHERE CONTACTNUMBER= '" + a + "'";

                System.out.println("updating records into the table...");
                PreparedStatement st = con.prepareStatement(sql);

                int a1 = st.executeUpdate();
                if (a1 > 0) {
                    System.out.println("update records into the table...");
                    result = true;
                } else {
                    System.out.println("ContactNumber not found!!");
                    result = false;
                }

            } catch (SQLException se) {
                se.printStackTrace();
            }
            System.out.println("Goodbye!");
            if (result == true) {
                return true;
            } else {
                return false;
            }

//            q = "UPDATE DONORS SET CONTACTNUMBER= " + tempb + " where CONTACTNUMBER=" + tempa + "";
//            Statement up = null;
//            try {
//                up = con.createStatement();
//            } catch (SQLException ex) {
//                Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            try {
//                up.executeUpdate(q);
//            } catch (SQLException ex) {
//                Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//            result = true;
        }

        return result;
    }
///////////////////////////////////projects futnctions

    void addProject(ProjectClass obj) {
        try {
            Connection con = connect.getConnection();
            System.out.println("Inserting records into the table...");
            PreparedStatement st = con.prepareStatement("INSERT INTO PROJECT(PID,NAME,TOTAL_MONEY_REQUIRED)VALUES(" + obj.PID + ",'" + obj.Name + "','" + obj.Total_Money_Required + "')");
            int a = st.executeUpdate();
            if (a > 0) {
                System.out.println("Inserted records into the table...");
            } else {
                System.out.println("records cannot be inserted into the table...");
            }
        } catch (SQLException se) {
            se.printStackTrace();
        }
        System.out.println("Goodbye!");

    }

    public static boolean deleteProject(int id) {

        try {
            Connection con = connect.getConnection();
            String sql = "DELETE FROM PROJECT WHERE PID = " + id + " ";

            System.out.println("deleting records into the table...");
            PreparedStatement st = con.prepareStatement(sql);

            int a = st.executeUpdate();
            if (a > 0) {
                System.out.println("delete records into the table...");
                flag_delete = true;
            } else {
                System.out.println("record is not found!!");
                flag_delete = false;
            }

        } catch (SQLException se) {
            se.printStackTrace();
        }
        System.out.println("Goodbye!");
        if (flag_delete == true) {
            return true;
        } else {
            return false;
        }
    }

    public int fetchid() {
        int a = 0;
        try {
            Statement mystat = null;
            ResultSet rs = null;
            Connection con = connect.getConnection();
            mystat = con.createStatement();
            String q = "Select max(PID) from MYRA.PROJECT";
            rs = mystat.executeQuery(q);

            while (rs.next()) {
                a = rs.getInt(1);

            }

        } catch (SQLException ex) {
            Logger.getLogger(database.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        a++;
        return a;
    }
    ////////

    public ArrayList<ProjectClass> Projectlist() {
        ArrayList<ProjectClass> pl = new ArrayList<>();
        try {
            Connection con = connect.getConnection();
            System.out.println("Creating statement...");
            Statement stmt = con.createStatement();
            String sql;
            sql = "SELECT * FROM PROJECT";
            ResultSet rs = stmt.executeQuery(sql);

            ProjectClass fd;
            while (rs.next()) {
                fd = new ProjectClass(rs.getInt(1), rs.getString(2), rs.getString(3));
                pl.add(fd);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return pl;
    }

    public static boolean updateProjectMoney(int id, String m) {

        try {
            Connection con = connect.getConnection();
            String sql = "UPDATE PROJECT SET TOTAL_MONEY_REQUIRED ='" + m + "' WHERE PID = " + id + "";

            System.out.println("updating records into the table...");
            PreparedStatement st = con.prepareStatement(sql);

            int a = st.executeUpdate();
            if (a > 0) {
                System.out.println("update records into the table...");
                flag_update = true;
            } else {
                System.out.println("ID is not found!!");
                flag_update = false;
            }

        } catch (SQLException se) {
            se.printStackTrace();
        }
        System.out.println("Goodbye!");
        if (flag_update == true) {
            return true;
        } else {
            return false;
        }
    }

    public String getProjectName(int aa)
    {
       String h=null;
        
        try {
            Statement mystat = null;
            ResultSet rs = null;
            Connection con = connect.getConnection();
            mystat = con.createStatement();
            String s1= "SELECT NAME FROM PROJECT WHERE PID="+aa+"";
            rs = mystat.executeQuery(s1);

            while (rs.next()) {
                h = rs.getString(1);
            }

        } catch (SQLException ex) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
       return h;
    }

}
