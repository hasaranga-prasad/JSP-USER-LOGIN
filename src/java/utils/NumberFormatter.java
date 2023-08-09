/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatter {
    public static String formatCurrency(double amount, Locale locale) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);
        return formatter.format(amount);
    }

    public static String formatNumber(double number, Locale locale) {
        NumberFormat formatter = NumberFormat.getNumberInstance(locale);
        return formatter.format(number);
    }
}
