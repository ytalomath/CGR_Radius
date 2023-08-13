package Helper;

import static View.AttributeSearch.*;
import static View.Add.*;
import static View.Assign.*;
import static View.Extract.*;
import static View.Delete.*;
import static View.Speed.*;
import static View.Suspend.*;
import static View.RemoveSuspend.*;

import javax.swing.table.DefaultTableModel;

public class HelperClear {

    public static void clearTable() {

        DefaultTableModel mode2 = (DefaultTableModel) tblAttribute.getModel();

        mode2.setRowCount(0);

    }

    public static void clearTableExtract() {
        DefaultTableModel mode = (DefaultTableModel) tblAuth.getModel();
        mode.setRowCount(0);

    }

    public static void clearAttribute() {
        txtLogin.setText("");

    }

    public static void clearInput() {
        txtLogin.setText("");
    }

    public static void clearInputExtract() {
        txtLoginExtract.setText("");
    }

    public static void clearRegister() {
        txtUser.setText("");
        txtPass.setText("");
    }

    public static void clearAssign() {
        txtValue.setText("");
        txtLoginAssign.setText("");
    }

    public static void clearDelete() {
        txtLoginDelete.setText("");
    }

    public static void clearSpeed() {
        txtLoginSpeed.setText("");
    }

    public static void clearSuspend() {
        txtLoginSuspend.setText("");
    }

    public static void clearRemoveSuspend() {
        txtLoginRemoveSuspend.setText("");
    }

}
