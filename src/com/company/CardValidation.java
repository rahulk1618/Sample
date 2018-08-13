package com.company;

import java.time.Month;
import java.util.Scanner;

public class CardValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Credit card Number: ");
        String cardnumber = input.nextLine();
        CardValidation card = new CardValidation();

        try {
            card.validcard(cardnumber);
            card.validcardtype(cardnumber);
            System.out.println("Enter the card CVV: ");
            String cvv = input.nextLine();
            card.validcvv(cvv);
            System.out.println("Enter month of expiry: ");
            int month = input.nextInt();
            card.validmonth(month);
        } catch (CardNumberNotValidException e) {
            System.err.println(e.getMessage());
        } catch (CardTypeNotValidException a) {
            System.err.println(a.getMessage());
        }
        catch (CvvNotValidException c){
            System.err.println(c.getMessage());
        }
        catch  (MonthNotValidException b) {
            System.err.println(b.getMessage());
        }
    }

         public void validcard(String cardnumber) throws CardNumberNotValidException{
        if(cardnumber.length() !=16){
            throw new CardNumberNotValidException("please enter valid card number");
        }
         }
         public void validcardtype(String cardnumber) throws CardTypeNotValidException{
        if (cardnumber.startsWith("4")){
            System.out.println("Visa Card");
        }else if (cardnumber.startsWith("5")){
            System.out.println("Master Card");
        }else if (cardnumber.startsWith("37")){
            System.out.println("American Express");
        }else  {
            throw new CardTypeNotValidException("please enter valid cardnumber");
        }

         }

         public void validcvv(String cvv) throws CvvNotValidException{
        if(cvv.length() !=3){
            throw new CvvNotValidException("Enter valid cvv.");
        }
         }
        public void validmonth(int month) throws MonthNotValidException{
            if (month>=1 && month <=12) {
                System.out.println("valid month");
            }else {
                throw  new MonthNotValidException("Enter a Valid month");
            }
        }







}
